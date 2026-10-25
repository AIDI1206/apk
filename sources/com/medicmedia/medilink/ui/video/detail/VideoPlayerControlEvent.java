package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDetailEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "", "ToggleController", "ControllerInteraction", "PlayPause", "Pause", "SeekBack", "SeekForward", "SeekBackTriggered", "SeekForwardTriggered", "SkipPrevious", "SkipNext", "SeekTo", "ChangeSpeed", "ToggleFullscreen", "ExitFullscreen", "EnterAutoFullscreen", "ExitAutoFullscreen", "Back", "Pip", "Setting", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Back;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ChangeSpeed;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ControllerInteraction;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$EnterAutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ExitAutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ExitFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Pause;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Pip;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$PlayPause;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekBack;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekBackTriggered;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekForward;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekForwardTriggered;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekTo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Setting;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SkipNext;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SkipPrevious;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ToggleController;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ToggleFullscreen;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface VideoPlayerControlEvent {

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ToggleController;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ToggleController implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final ToggleController INSTANCE = new ToggleController();

        private ToggleController() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ControllerInteraction;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ControllerInteraction implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final ControllerInteraction INSTANCE = new ControllerInteraction();

        private ControllerInteraction() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$PlayPause;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PlayPause implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final PlayPause INSTANCE = new PlayPause();

        private PlayPause() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Pause;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Pause implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final Pause INSTANCE = new Pause();

        private Pause() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekBack;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SeekBack implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final SeekBack INSTANCE = new SeekBack();

        private SeekBack() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekForward;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SeekForward implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final SeekForward INSTANCE = new SeekForward();

        private SeekForward() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekBackTriggered;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", AnalyticsEvent.Param.TRIGGER, "Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;", "<init>", "(Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;)V", "getTrigger", "()Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SeekBackTriggered implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        private final VideoSkipTrigger trigger;

        public static /* synthetic */ SeekBackTriggered copy$default(SeekBackTriggered seekBackTriggered, VideoSkipTrigger videoSkipTrigger, int i, Object obj) {
            if ((i & 1) != 0) {
                videoSkipTrigger = seekBackTriggered.trigger;
            }
            return seekBackTriggered.copy(videoSkipTrigger);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoSkipTrigger getTrigger() {
            return this.trigger;
        }

        public final SeekBackTriggered copy(VideoSkipTrigger trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return new SeekBackTriggered(trigger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeekBackTriggered) && this.trigger == ((SeekBackTriggered) other).trigger;
        }

        public int hashCode() {
            return this.trigger.hashCode();
        }

        public String toString() {
            return "SeekBackTriggered(trigger=" + this.trigger + ")";
        }

        public SeekBackTriggered(VideoSkipTrigger trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            this.trigger = trigger;
        }

        public final VideoSkipTrigger getTrigger() {
            return this.trigger;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekForwardTriggered;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", AnalyticsEvent.Param.TRIGGER, "Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;", "<init>", "(Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;)V", "getTrigger", "()Lcom/medicmedia/medilink/ui/video/detail/VideoSkipTrigger;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SeekForwardTriggered implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        private final VideoSkipTrigger trigger;

        public static /* synthetic */ SeekForwardTriggered copy$default(SeekForwardTriggered seekForwardTriggered, VideoSkipTrigger videoSkipTrigger, int i, Object obj) {
            if ((i & 1) != 0) {
                videoSkipTrigger = seekForwardTriggered.trigger;
            }
            return seekForwardTriggered.copy(videoSkipTrigger);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VideoSkipTrigger getTrigger() {
            return this.trigger;
        }

        public final SeekForwardTriggered copy(VideoSkipTrigger trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return new SeekForwardTriggered(trigger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeekForwardTriggered) && this.trigger == ((SeekForwardTriggered) other).trigger;
        }

        public int hashCode() {
            return this.trigger.hashCode();
        }

        public String toString() {
            return "SeekForwardTriggered(trigger=" + this.trigger + ")";
        }

        public SeekForwardTriggered(VideoSkipTrigger trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            this.trigger = trigger;
        }

        public final VideoSkipTrigger getTrigger() {
            return this.trigger;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SkipPrevious;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SkipPrevious implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final SkipPrevious INSTANCE = new SkipPrevious();

        private SkipPrevious() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SkipNext;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SkipNext implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final SkipNext INSTANCE = new SkipNext();

        private SkipNext() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$SeekTo;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "positionMs", "", "<init>", "(J)V", "getPositionMs", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SeekTo implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        private final long positionMs;

        public static /* synthetic */ SeekTo copy$default(SeekTo seekTo, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = seekTo.positionMs;
            }
            return seekTo.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getPositionMs() {
            return this.positionMs;
        }

        public final SeekTo copy(long positionMs) {
            return new SeekTo(positionMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeekTo) && this.positionMs == ((SeekTo) other).positionMs;
        }

        public int hashCode() {
            return Long.hashCode(this.positionMs);
        }

        public String toString() {
            return "SeekTo(positionMs=" + this.positionMs + ")";
        }

        public SeekTo(long j) {
            this.positionMs = j;
        }

        public final long getPositionMs() {
            return this.positionMs;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ChangeSpeed;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "speed", "", "<init>", "(F)V", "getSpeed", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ChangeSpeed implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        private final float speed;

        public static /* synthetic */ ChangeSpeed copy$default(ChangeSpeed changeSpeed, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = changeSpeed.speed;
            }
            return changeSpeed.copy(f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getSpeed() {
            return this.speed;
        }

        public final ChangeSpeed copy(float speed) {
            return new ChangeSpeed(speed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeSpeed) && Float.compare(this.speed, ((ChangeSpeed) other).speed) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.speed);
        }

        public String toString() {
            return "ChangeSpeed(speed=" + this.speed + ")";
        }

        public ChangeSpeed(float f) {
            this.speed = f;
        }

        public final float getSpeed() {
            return this.speed;
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ToggleFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ToggleFullscreen implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final ToggleFullscreen INSTANCE = new ToggleFullscreen();

        private ToggleFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ExitFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ExitFullscreen implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final ExitFullscreen INSTANCE = new ExitFullscreen();

        private ExitFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$EnterAutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class EnterAutoFullscreen implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final EnterAutoFullscreen INSTANCE = new EnterAutoFullscreen();

        private EnterAutoFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$ExitAutoFullscreen;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ExitAutoFullscreen implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final ExitAutoFullscreen INSTANCE = new ExitAutoFullscreen();

        private ExitAutoFullscreen() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Back;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Back implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final Back INSTANCE = new Back();

        private Back() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Pip;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Pip implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final Pip INSTANCE = new Pip();

        private Pip() {
        }
    }

    /* JADX INFO: compiled from: VideoDetailEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent$Setting;", "Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerControlEvent;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Setting implements VideoPlayerControlEvent {
        public static final int $stable = 0;
        public static final Setting INSTANCE = new Setting();

        private Setting() {
        }
    }
}
