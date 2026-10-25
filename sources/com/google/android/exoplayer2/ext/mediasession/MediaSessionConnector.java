package com.google.android.exoplayer2.ext.mediasession;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionConnector {
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304;
    public static final long ALL_PLAYBACK_ACTIONS = 6554447;
    private static final int BASE_MEDIA_SESSION_FLAGS = 3;
    private static final long BASE_PLAYBACK_ACTIONS = 6554119;
    public static final long DEFAULT_PLAYBACK_ACTIONS = 2360143;
    private static final int EDITOR_MEDIA_SESSION_FLAGS = 7;
    public static final String EXTRAS_SPEED = "EXO_SPEED";
    private static final MediaMetadataCompat METADATA_EMPTY;
    private CaptionCallback captionCallback;
    private final ArrayList<CommandReceiver> commandReceivers;
    private final ComponentListener componentListener;
    private ControlDispatcher controlDispatcher;
    private Map<String, CustomActionProvider> customActionMap;
    private CustomActionProvider[] customActionProviders;
    private final ArrayList<CommandReceiver> customCommandReceivers;
    private Pair<Integer, CharSequence> customError;
    private Bundle customErrorExtras;
    private long enabledPlaybackActions;
    private ErrorMessageProvider<? super ExoPlaybackException> errorMessageProvider;
    private final Looper looper;
    private MediaButtonEventHandler mediaButtonEventHandler;
    private MediaMetadataProvider mediaMetadataProvider;
    public final MediaSessionCompat mediaSession;
    private PlaybackPreparer playbackPreparer;
    private Player player;
    private QueueEditor queueEditor;
    private QueueNavigator queueNavigator;
    private RatingCallback ratingCallback;

    public interface CaptionCallback extends CommandReceiver {
        boolean hasCaptions(Player player);

        void onSetCaptioningEnabled(Player player, boolean z);
    }

    public interface CommandReceiver {
        boolean onCommand(Player player, ControlDispatcher controlDispatcher, String str, Bundle bundle, ResultReceiver resultReceiver);
    }

    public interface CustomActionProvider {
        PlaybackStateCompat.CustomAction getCustomAction(Player player);

        void onCustomAction(Player player, ControlDispatcher controlDispatcher, String str, Bundle bundle);
    }

    public interface MediaButtonEventHandler {
        boolean onMediaButtonEvent(Player player, ControlDispatcher controlDispatcher, Intent intent);
    }

    public interface MediaMetadataProvider {
        MediaMetadataCompat getMetadata(Player player);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackActions {
    }

    public interface PlaybackPreparer extends CommandReceiver {
        public static final long ACTIONS = 257024;

        long getSupportedPrepareActions();

        void onPrepare(boolean z);

        void onPrepareFromMediaId(String str, boolean z, Bundle bundle);

        void onPrepareFromSearch(String str, boolean z, Bundle bundle);

        void onPrepareFromUri(Uri uri, boolean z, Bundle bundle);
    }

    public interface QueueEditor extends CommandReceiver {
        void onAddQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat);

        void onAddQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat, int i);

        void onRemoveQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat);
    }

    public interface QueueNavigator extends CommandReceiver {
        public static final long ACTIONS = 4144;

        long getActiveQueueItemId(Player player);

        long getSupportedQueueNavigatorActions(Player player);

        void onCurrentWindowIndexChanged(Player player);

        void onSkipToNext(Player player, ControlDispatcher controlDispatcher);

        void onSkipToPrevious(Player player, ControlDispatcher controlDispatcher);

        void onSkipToQueueItem(Player player, ControlDispatcher controlDispatcher, long j);

        void onTimelineChanged(Player player);
    }

    public interface RatingCallback extends CommandReceiver {
        void onSetRating(Player player, RatingCompat ratingCompat);

        void onSetRating(Player player, RatingCompat ratingCompat, Bundle bundle);
    }

    private static int getMediaSessionPlaybackState(int i, boolean z) {
        if (i == 2) {
            return z ? 6 : 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 1;
        }
        return z ? 3 : 2;
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.mediasession");
        METADATA_EMPTY = new MediaMetadataCompat.Builder().build();
    }

    public MediaSessionConnector(MediaSessionCompat mediaSessionCompat) {
        this.mediaSession = mediaSessionCompat;
        Looper currentOrMainLooper = Util.getCurrentOrMainLooper();
        this.looper = currentOrMainLooper;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.commandReceivers = new ArrayList<>();
        this.customCommandReceivers = new ArrayList<>();
        this.controlDispatcher = new DefaultControlDispatcher();
        this.customActionProviders = new CustomActionProvider[0];
        this.customActionMap = Collections.emptyMap();
        this.mediaMetadataProvider = new DefaultMediaMetadataProvider(mediaSessionCompat.getController(), null);
        this.enabledPlaybackActions = DEFAULT_PLAYBACK_ACTIONS;
        mediaSessionCompat.setFlags(3);
        mediaSessionCompat.setCallback(componentListener, new Handler(currentOrMainLooper));
    }

    public void setPlayer(Player player) {
        Assertions.checkArgument(player == null || player.getApplicationLooper() == this.looper);
        Player player2 = this.player;
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        invalidateMediaSessionPlaybackState();
        invalidateMediaSessionMetadata();
    }

    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer) {
        PlaybackPreparer playbackPreparer2 = this.playbackPreparer;
        if (playbackPreparer2 != playbackPreparer) {
            unregisterCommandReceiver(playbackPreparer2);
            this.playbackPreparer = playbackPreparer;
            registerCommandReceiver(playbackPreparer);
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (this.controlDispatcher != controlDispatcher) {
            this.controlDispatcher = controlDispatcher;
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setMediaButtonEventHandler(MediaButtonEventHandler mediaButtonEventHandler) {
        this.mediaButtonEventHandler = mediaButtonEventHandler;
    }

    public void setEnabledPlaybackActions(long j) {
        long j2 = j & ALL_PLAYBACK_ACTIONS;
        if (this.enabledPlaybackActions != j2) {
            this.enabledPlaybackActions = j2;
            invalidateMediaSessionPlaybackState();
        }
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        ControlDispatcher controlDispatcher = this.controlDispatcher;
        if (controlDispatcher instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher).setRewindIncrementMs(i);
            invalidateMediaSessionPlaybackState();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        ControlDispatcher controlDispatcher = this.controlDispatcher;
        if (controlDispatcher instanceof DefaultControlDispatcher) {
            ((DefaultControlDispatcher) controlDispatcher).setFastForwardIncrementMs(i);
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setErrorMessageProvider(ErrorMessageProvider<? super ExoPlaybackException> errorMessageProvider) {
        if (this.errorMessageProvider != errorMessageProvider) {
            this.errorMessageProvider = errorMessageProvider;
            invalidateMediaSessionPlaybackState();
        }
    }

    public void setQueueNavigator(QueueNavigator queueNavigator) {
        QueueNavigator queueNavigator2 = this.queueNavigator;
        if (queueNavigator2 != queueNavigator) {
            unregisterCommandReceiver(queueNavigator2);
            this.queueNavigator = queueNavigator;
            registerCommandReceiver(queueNavigator);
        }
    }

    public void setQueueEditor(QueueEditor queueEditor) {
        QueueEditor queueEditor2 = this.queueEditor;
        if (queueEditor2 != queueEditor) {
            unregisterCommandReceiver(queueEditor2);
            this.queueEditor = queueEditor;
            registerCommandReceiver(queueEditor);
            this.mediaSession.setFlags(queueEditor == null ? 3 : 7);
        }
    }

    public void setRatingCallback(RatingCallback ratingCallback) {
        RatingCallback ratingCallback2 = this.ratingCallback;
        if (ratingCallback2 != ratingCallback) {
            unregisterCommandReceiver(ratingCallback2);
            this.ratingCallback = ratingCallback;
            registerCommandReceiver(ratingCallback);
        }
    }

    public void setCaptionCallback(CaptionCallback captionCallback) {
        CaptionCallback captionCallback2 = this.captionCallback;
        if (captionCallback2 != captionCallback) {
            unregisterCommandReceiver(captionCallback2);
            this.captionCallback = captionCallback;
            registerCommandReceiver(captionCallback);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        setCustomErrorMessage(charSequence, charSequence == null ? 0 : 1);
    }

    public void setCustomErrorMessage(CharSequence charSequence, int i) {
        setCustomErrorMessage(charSequence, i, null);
    }

    public void setCustomErrorMessage(CharSequence charSequence, int i, Bundle bundle) {
        this.customError = charSequence == null ? null : new Pair<>(Integer.valueOf(i), charSequence);
        if (charSequence == null) {
            bundle = null;
        }
        this.customErrorExtras = bundle;
        invalidateMediaSessionPlaybackState();
    }

    public void setCustomActionProviders(CustomActionProvider... customActionProviderArr) {
        if (customActionProviderArr == null) {
            customActionProviderArr = new CustomActionProvider[0];
        }
        this.customActionProviders = customActionProviderArr;
        invalidateMediaSessionPlaybackState();
    }

    public void setMediaMetadataProvider(MediaMetadataProvider mediaMetadataProvider) {
        if (this.mediaMetadataProvider != mediaMetadataProvider) {
            this.mediaMetadataProvider = mediaMetadataProvider;
            invalidateMediaSessionMetadata();
        }
    }

    public final void invalidateMediaSessionMetadata() {
        MediaMetadataCompat metadata;
        Player player;
        MediaMetadataProvider mediaMetadataProvider = this.mediaMetadataProvider;
        if (mediaMetadataProvider != null && (player = this.player) != null) {
            metadata = mediaMetadataProvider.getMetadata(player);
        } else {
            metadata = METADATA_EMPTY;
        }
        this.mediaSession.setMetadata(metadata);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fd A[PHI: r5
  0x00fd: PHI (r5v11 int) = (r5v9 int), (r5v10 int) binds: [B:38:0x00fb, B:41:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void invalidateMediaSessionPlaybackState() {
        ErrorMessageProvider<? super ExoPlaybackException> errorMessageProvider;
        int i;
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        Player player = this.player;
        if (player == null) {
            builder.setActions(buildPrepareActions()).setState(0, 0L, 0.0f, SystemClock.elapsedRealtime());
            this.mediaSession.setRepeatMode(0);
            this.mediaSession.setShuffleMode(0);
            this.mediaSession.setPlaybackState(builder.build());
            return;
        }
        HashMap map = new HashMap();
        for (CustomActionProvider customActionProvider : this.customActionProviders) {
            PlaybackStateCompat.CustomAction customAction = customActionProvider.getCustomAction(player);
            if (customAction != null) {
                map.put(customAction.getAction(), customActionProvider);
                builder.addCustomAction(customAction);
            }
        }
        this.customActionMap = Collections.unmodifiableMap(map);
        Bundle bundle = new Bundle();
        ExoPlaybackException playerError = player.getPlayerError();
        int mediaSessionPlaybackState = (playerError == null && this.customError == null) ? getMediaSessionPlaybackState(player.getPlaybackState(), player.getPlayWhenReady()) : 7;
        Pair<Integer, CharSequence> pair = this.customError;
        if (pair != null) {
            builder.setErrorMessage(((Integer) pair.first).intValue(), (CharSequence) this.customError.second);
            Bundle bundle2 = this.customErrorExtras;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        } else if (playerError != null && (errorMessageProvider = this.errorMessageProvider) != null) {
            Pair<Integer, String> errorMessage = errorMessageProvider.getErrorMessage(playerError);
            builder.setErrorMessage(((Integer) errorMessage.first).intValue(), (CharSequence) errorMessage.second);
        }
        QueueNavigator queueNavigator = this.queueNavigator;
        long activeQueueItemId = queueNavigator != null ? queueNavigator.getActiveQueueItemId(player) : -1L;
        float f = player.getPlaybackParameters().speed;
        bundle.putFloat(EXTRAS_SPEED, f);
        if (!player.isPlaying()) {
            f = 0.0f;
        }
        builder.setActions(buildPrepareActions() | buildPlaybackActions(player)).setActiveQueueItemId(activeQueueItemId).setBufferedPosition(player.getBufferedPosition()).setState(mediaSessionPlaybackState, player.getCurrentPosition(), f, SystemClock.elapsedRealtime()).setExtras(bundle);
        int repeatMode = player.getRepeatMode();
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        int i2 = 1;
        if (repeatMode != 1) {
            i2 = 2;
            i = repeatMode == 2 ? i2 : 0;
        }
        mediaSessionCompat.setRepeatMode(i);
        this.mediaSession.setShuffleMode(player.getShuffleModeEnabled() ? 1 : 0);
        this.mediaSession.setPlaybackState(builder.build());
    }

    public final void invalidateMediaSessionQueue() {
        Player player;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator == null || (player = this.player) == null) {
            return;
        }
        queueNavigator.onTimelineChanged(player);
    }

    public void registerCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.customCommandReceivers.contains(commandReceiver)) {
            return;
        }
        this.customCommandReceivers.add(commandReceiver);
    }

    public void unregisterCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.customCommandReceivers.remove(commandReceiver);
        }
    }

    private void registerCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.commandReceivers.contains(commandReceiver)) {
            return;
        }
        this.commandReceivers.add(commandReceiver);
    }

    private void unregisterCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.commandReceivers.remove(commandReceiver);
        }
    }

    private long buildPrepareActions() {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        if (playbackPreparer == null) {
            return 0L;
        }
        return playbackPreparer.getSupportedPrepareActions() & PlaybackPreparer.ACTIONS;
    }

    private long buildPlaybackActions(Player player) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (player.getCurrentTimeline().isEmpty() || player.isPlayingAd()) {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        } else {
            boolean zIsCurrentWindowSeekable = player.isCurrentWindowSeekable();
            z2 = zIsCurrentWindowSeekable && this.controlDispatcher.isRewindEnabled();
            z3 = zIsCurrentWindowSeekable && this.controlDispatcher.isFastForwardEnabled();
            z4 = this.ratingCallback != null;
            CaptionCallback captionCallback = this.captionCallback;
            if (captionCallback != null && captionCallback.hasCaptions(player)) {
                z5 = true;
            }
            boolean z6 = z5;
            z5 = zIsCurrentWindowSeekable;
            z = z6;
        }
        long j = z5 ? 6554375L : BASE_PLAYBACK_ACTIONS;
        if (z3) {
            j |= 64;
        }
        if (z2) {
            j |= 8;
        }
        long supportedQueueNavigatorActions = j & this.enabledPlaybackActions;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator != null) {
            supportedQueueNavigatorActions |= queueNavigator.getSupportedQueueNavigatorActions(player) & QueueNavigator.ACTIONS;
        }
        if (z4) {
            supportedQueueNavigatorActions |= 128;
        }
        return z ? supportedQueueNavigatorActions | 1048576 : supportedQueueNavigatorActions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player"}, result = true)
    public boolean canDispatchPlaybackAction(long j) {
        return (this.player == null || (j & this.enabledPlaybackActions) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"playbackPreparer"}, result = true)
    public boolean canDispatchToPlaybackPreparer(long j) {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        return (playbackPreparer == null || (j & playbackPreparer.getSupportedPrepareActions()) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player", "queueNavigator"}, result = true)
    public boolean canDispatchToQueueNavigator(long j) {
        QueueNavigator queueNavigator;
        Player player = this.player;
        return (player == null || (queueNavigator = this.queueNavigator) == null || (j & queueNavigator.getSupportedQueueNavigatorActions(player)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player", "ratingCallback"}, result = true)
    public boolean canDispatchSetRating() {
        return (this.player == null || this.ratingCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player", "captionCallback"}, result = true)
    public boolean canDispatchSetCaptioningEnabled() {
        return (this.player == null || this.captionCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player", "queueEditor"}, result = true)
    public boolean canDispatchQueueEdit() {
        return (this.player == null || this.queueEditor == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"player", "mediaButtonEventHandler"}, result = true)
    public boolean canDispatchMediaButtonEvent() {
        return (this.player == null || this.mediaButtonEventHandler == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(Player player, int i, long j) {
        this.controlDispatcher.dispatchSeekTo(player, i, j);
    }

    public static final class DefaultMediaMetadataProvider implements MediaMetadataProvider {
        private final MediaControllerCompat mediaController;
        private final String metadataExtrasPrefix;

        public DefaultMediaMetadataProvider(MediaControllerCompat mediaControllerCompat, String str) {
            this.mediaController = mediaControllerCompat;
            this.metadataExtrasPrefix = str == null ? "" : str;
        }

        @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.MediaMetadataProvider
        public MediaMetadataCompat getMetadata(Player player) {
            if (player.getCurrentTimeline().isEmpty()) {
                return MediaSessionConnector.METADATA_EMPTY;
            }
            MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder();
            if (player.isPlayingAd()) {
                builder.putLong(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, 1L);
            }
            builder.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, (player.isCurrentWindowDynamic() || player.getDuration() == C.TIME_UNSET) ? -1L : player.getDuration());
            long activeQueueItemId = this.mediaController.getPlaybackState().getActiveQueueItemId();
            if (activeQueueItemId != -1) {
                List<MediaSessionCompat.QueueItem> queue = this.mediaController.getQueue();
                for (int i = 0; queue != null && i < queue.size(); i++) {
                    MediaSessionCompat.QueueItem queueItem = queue.get(i);
                    if (queueItem.getQueueId() == activeQueueItemId) {
                        MediaDescriptionCompat description = queueItem.getDescription();
                        Bundle extras = description.getExtras();
                        if (extras != null) {
                            for (String str : extras.keySet()) {
                                Object obj = extras.get(str);
                                if (obj instanceof String) {
                                    builder.putString(this.metadataExtrasPrefix + str, (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    builder.putText(this.metadataExtrasPrefix + str, (CharSequence) obj);
                                } else if (obj instanceof Long) {
                                    builder.putLong(this.metadataExtrasPrefix + str, ((Long) obj).longValue());
                                } else if (obj instanceof Integer) {
                                    builder.putLong(this.metadataExtrasPrefix + str, ((Integer) obj).intValue());
                                } else if (obj instanceof Bitmap) {
                                    builder.putBitmap(this.metadataExtrasPrefix + str, (Bitmap) obj);
                                } else if (obj instanceof RatingCompat) {
                                    builder.putRating(this.metadataExtrasPrefix + str, (RatingCompat) obj);
                                }
                            }
                        }
                        CharSequence title = description.getTitle();
                        if (title != null) {
                            String strValueOf = String.valueOf(title);
                            builder.putString(MediaMetadataCompat.METADATA_KEY_TITLE, strValueOf);
                            builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, strValueOf);
                        }
                        CharSequence subtitle = description.getSubtitle();
                        if (subtitle != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, String.valueOf(subtitle));
                        }
                        CharSequence description2 = description.getDescription();
                        if (description2 != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, String.valueOf(description2));
                        }
                        Bitmap iconBitmap = description.getIconBitmap();
                        if (iconBitmap != null) {
                            builder.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, iconBitmap);
                        }
                        Uri iconUri = description.getIconUri();
                        if (iconUri != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, String.valueOf(iconUri));
                        }
                        String mediaId = description.getMediaId();
                        if (mediaId != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, mediaId);
                        }
                        Uri mediaUri = description.getMediaUri();
                        if (mediaUri == null) {
                            break;
                        }
                        builder.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, String.valueOf(mediaUri));
                        break;
                    }
                }
            }
            return builder.build();
        }
    }

    private class ComponentListener extends MediaSessionCompat.Callback implements Player.EventListener {
        private int currentWindowCount;
        private int currentWindowIndex;

        private ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (events.contains(12)) {
                if (this.currentWindowIndex != player.getCurrentWindowIndex()) {
                    if (MediaSessionConnector.this.queueNavigator != null) {
                        MediaSessionConnector.this.queueNavigator.onCurrentWindowIndexChanged(player);
                    }
                    z = true;
                } else {
                    z = false;
                }
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (events.contains(0)) {
                int windowCount = player.getCurrentTimeline().getWindowCount();
                int currentWindowIndex = player.getCurrentWindowIndex();
                if (MediaSessionConnector.this.queueNavigator != null) {
                    MediaSessionConnector.this.queueNavigator.onTimelineChanged(player);
                } else {
                    if (this.currentWindowCount != windowCount || this.currentWindowIndex != currentWindowIndex) {
                    }
                    this.currentWindowCount = windowCount;
                    z = true;
                }
                z2 = true;
                this.currentWindowCount = windowCount;
                z = true;
            }
            this.currentWindowIndex = player.getCurrentWindowIndex();
            if (events.containsAny(5, 6, 8, 9, 13)) {
                z2 = true;
            }
            if (events.containsAny(10)) {
                MediaSessionConnector.this.invalidateMediaSessionQueue();
            } else {
                z3 = z2;
            }
            if (z3) {
                MediaSessionConnector.this.invalidateMediaSessionPlaybackState();
            }
            if (z) {
                MediaSessionConnector.this.invalidateMediaSessionMetadata();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlay() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(4L)) {
                if (MediaSessionConnector.this.player.getPlaybackState() == 1) {
                    if (MediaSessionConnector.this.playbackPreparer != null) {
                        MediaSessionConnector.this.playbackPreparer.onPrepare(true);
                    } else {
                        MediaSessionConnector.this.controlDispatcher.dispatchPrepare(MediaSessionConnector.this.player);
                    }
                } else if (MediaSessionConnector.this.player.getPlaybackState() == 4) {
                    MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                    mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.getCurrentWindowIndex(), C.TIME_UNSET);
                }
                MediaSessionConnector.this.controlDispatcher.dispatchSetPlayWhenReady((Player) Assertions.checkNotNull(MediaSessionConnector.this.player), true);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPause() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(2L)) {
                MediaSessionConnector.this.controlDispatcher.dispatchSetPlayWhenReady(MediaSessionConnector.this.player, false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSeekTo(long j) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(256L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.getCurrentWindowIndex(), j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onFastForward() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(64L)) {
                MediaSessionConnector.this.controlDispatcher.dispatchFastForward(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onRewind() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(8L)) {
                MediaSessionConnector.this.controlDispatcher.dispatchRewind(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onStop() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(1L)) {
                MediaSessionConnector.this.controlDispatcher.dispatchStop(MediaSessionConnector.this.player, true);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetShuffleMode(int i) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
                boolean z = true;
                if (i != 1 && i != 2) {
                    z = false;
                }
                MediaSessionConnector.this.controlDispatcher.dispatchSetShuffleModeEnabled(MediaSessionConnector.this.player, z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetRepeatMode(int i) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2 && i != 3) {
                        i2 = 0;
                    }
                }
                MediaSessionConnector.this.controlDispatcher.dispatchSetRepeatMode(MediaSessionConnector.this.player, i2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetPlaybackSpeed(float f) {
            if (!MediaSessionConnector.this.canDispatchPlaybackAction(MediaSessionConnector.ACTION_SET_PLAYBACK_SPEED) || f <= 0.0f) {
                return;
            }
            MediaSessionConnector.this.controlDispatcher.dispatchSetPlaybackParameters(MediaSessionConnector.this.player, MediaSessionConnector.this.player.getPlaybackParameters().withSpeed(f));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToNext() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(32L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToNext(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToPrevious() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(16L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToPrevious(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToQueueItem(long j) {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                MediaSessionConnector.this.queueNavigator.onSkipToQueueItem(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher, j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onCustomAction(String str, Bundle bundle) {
            if (MediaSessionConnector.this.player == null || !MediaSessionConnector.this.customActionMap.containsKey(str)) {
                return;
            }
            ((CustomActionProvider) MediaSessionConnector.this.customActionMap.get(str)).onCustomAction(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher, str, bundle);
            MediaSessionConnector.this.invalidateMediaSessionPlaybackState();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (MediaSessionConnector.this.player != null) {
                int i = 0;
                while (i < MediaSessionConnector.this.commandReceivers.size()) {
                    String str2 = str;
                    Bundle bundle2 = bundle;
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (((CommandReceiver) MediaSessionConnector.this.commandReceivers.get(i)).onCommand(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher, str2, bundle2, resultReceiver2)) {
                        return;
                    }
                    i++;
                    str = str2;
                    bundle = bundle2;
                    resultReceiver = resultReceiver2;
                }
                String str3 = str;
                Bundle bundle3 = bundle;
                ResultReceiver resultReceiver3 = resultReceiver;
                for (int i2 = 0; i2 < MediaSessionConnector.this.customCommandReceivers.size() && !((CommandReceiver) MediaSessionConnector.this.customCommandReceivers.get(i2)).onCommand(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher, str3, bundle3, resultReceiver3); i2++) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepare() {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(16384L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepare(false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(1024L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetRating(RatingCompat ratingCompat) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat, i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onRemoveQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSetCaptioningEnabled(boolean z) {
            if (MediaSessionConnector.this.canDispatchSetCaptioningEnabled()) {
                MediaSessionConnector.this.captionCallback.onSetCaptioningEnabled(MediaSessionConnector.this.player, z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            return (MediaSessionConnector.this.canDispatchMediaButtonEvent() && MediaSessionConnector.this.mediaButtonEventHandler.onMediaButtonEvent(MediaSessionConnector.this.player, MediaSessionConnector.this.controlDispatcher, intent)) || super.onMediaButtonEvent(intent);
        }
    }
}
