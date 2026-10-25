package com.medicmedia.medilink;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.medicmedia.medilink.database.models.newitem.VideoCourseRealm;
import com.medicmedia.medilink.database.models.newitem.VideoSubRealm;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.model.ZipUnpackWorkerItem;
import com.medicmedia.medilink.fragment.MLCustomBottomSheetDialog;
import com.medicmedia.medilink.ui.download.DownloadViewModel;
import com.medicmedia.medilink.ui.extension.ContextExtensionKt;
import com.medicmedia.medilink.ui.scan.ScanError;
import com.medicmedia.medilink.worker.ZipUnpackWorker;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class MLDownloadActivity extends Hilt_MLDownloadActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String CONTENTS_DIR = "contents_files";
    private static final String TAG = "MLDownloadActivity";
    public static DownloadManager downloadManager;
    public MLCustomBottomSheetDialog mBottomSheetDialog;
    BroadcastReceiver onComplete = new BroadcastReceiver() { // from class: com.medicmedia.medilink.MLDownloadActivity.1
        /* JADX WARN: Code duplicated, block: B:24:0x010a  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.d("BroadcastReceiver ", "start BroadcastReceiver ");
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(action)) {
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                if (longExtra == -1) {
                    return;
                }
                Log.d("BroadcastReceiver ", "End Download download Id = " + longExtra);
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterByStatus(16);
                query.setFilterByStatus(8);
                query.setFilterById(longExtra);
                Cursor cursorQuery = MLDownloadActivity.downloadManager.query(query);
                if (cursorQuery.moveToFirst()) {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                    Log.d(NotificationCompat.CATEGORY_STATUS, Integer.toString(i));
                    Log.d("reason", Integer.toString(i2));
                    Log.d("BroadcastReceiver ", "status = " + i);
                    if (i == 16) {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (i == 8) {
                        BookShelfViewItem bookShelfViewItemFindBookShelfItem = MLDownloadActivity.this.viewModel.findBookShelfItem(longExtra);
                        if (bookShelfViewItemFindBookShelfItem != null) {
                            MLDownloadActivity mLDownloadActivity = MLDownloadActivity.this;
                            if (mLDownloadActivity.makecontentsDir(mLDownloadActivity.getFilesDir().getAbsolutePath(), bookShelfViewItemFindBookShelfItem.getId())) {
                                bookShelfViewItemFindBookShelfItem.setStatus(1);
                                MLDownloadActivity.this.viewModel.updateDownloadStatus(bookShelfViewItemFindBookShelfItem);
                                ZipUnpackWorkerItem zipUnpackWorkerItem = new ZipUnpackWorkerItem(bookShelfViewItemFindBookShelfItem.getId(), bookShelfViewItemFindBookShelfItem.getVersion(), MLDownloadActivity.this.getFilesDir().getAbsolutePath() + File.separator + "contents_files", longExtra);
                                if (context instanceof MLDownloadActivity) {
                                    MLDownloadActivity.this.viewModel.startWorker((MLDownloadActivity) context, ZipUnpackWorker.class, zipUnpackWorkerItem);
                                }
                            } else {
                                Log.d("BroadcastReceiver ", "Realm read nothing");
                            }
                        } else {
                            Log.d("BroadcastReceiver ", "Realm read nothing");
                        }
                    }
                }
                cursorQuery.close();
            }
        }
    };
    private DownloadViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean makecontentsDir(String str, String str2) {
        File file = new File(str + File.separator + "contents_files" + File.separator + str2 + File.separator);
        if (file.exists()) {
            return true;
        }
        if (file.mkdirs()) {
            Log.i(TAG, "フォルダ作成に成功");
            return true;
        }
        Log.i(TAG, "フォルダ作成に失敗");
        return false;
    }

    @Override // com.medicmedia.medilink.MLSessionActivity, com.medicmedia.medilink.Hilt_MLSessionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        downloadManager = (DownloadManager) getSystemService("download");
        this.viewModel = (DownloadViewModel) new ViewModelProvider(this).get(DownloadViewModel.class);
        subscribeViewModel();
    }

    private void subscribeViewModel() {
        this.viewModel.getNotFoundErrorMessageId().observe(this, new Observer() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.m9979xa35c6eca((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$subscribeViewModel$0$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9979xa35c6eca(Integer num) {
        ContextExtensionKt.showLongTextToastWithMessageId(this, num.intValue());
    }

    protected class UpdateVideoReceiver extends BroadcastReceiver {
        protected UpdateVideoReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MLDownloadActivity.this.compDownload(((Bundle) Objects.requireNonNull(intent.getExtras())).getString("message"));
        }
    }

    public static String dateToString(Date date, String str) {
        return new SimpleDateFormat(str, Locale.JAPAN).format(date);
    }

    public void compDownload(String str) {
        try {
            MLCustomBottomSheetDialog mLCustomBottomSheetDialog = this.mBottomSheetDialog;
            if (mLCustomBottomSheetDialog != null && mLCustomBottomSheetDialog.isShowing()) {
                this.mBottomSheetDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mBottomSheetDialog = new MLCustomBottomSheetDialog(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_download_comp, (ViewGroup) null);
        this.mBottomSheetDialog.setContentView(viewInflate);
        BottomSheetBehavior.from((View) viewInflate.getParent()).setPeekHeight(MLConst.MLBottomsSheet.MAX_WIDTH);
        final VideoSubRealm videoSubRealmFindVideoSubRealm = this.viewModel.findVideoSubRealm(str);
        VideoCourseRealm videoCourseRealmFindVideoCourseRealm = this.viewModel.findVideoCourseRealm(videoSubRealmFindVideoSubRealm.getCourseId());
        if (videoCourseRealmFindVideoCourseRealm == null || !videoCourseRealmFindVideoCourseRealm.isUserNotPurchase()) {
            Button button = (Button) viewInflate.findViewById(R.id.button7);
            Button button2 = (Button) viewInflate.findViewById(R.id.button6);
            viewInflate.findViewById(R.id.edtSerial).setVisibility(8);
            button2.setText(getString(R.string.movie_download_play));
            Button button3 = (Button) viewInflate.findViewById(R.id.button5);
            TextView textView = (TextView) viewInflate.findViewById(R.id.textView2);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.download_comp_message);
            ((TextView) viewInflate.findViewById(R.id.textView3)).setText(videoSubRealmFindVideoSubRealm.getVideoTitle());
            final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkBox2);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MLDownloadActivity.lambda$compDownload$1(checkBox, compoundButton, z);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m9974lambda$compDownload$2$commedicmediamedilinkMLDownloadActivity(videoSubRealmFindVideoSubRealm, view);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m9975lambda$compDownload$3$commedicmediamedilinkMLDownloadActivity(view);
                }
            });
            checkBox.setVisibility(8);
            button.setVisibility(8);
            textView.setVisibility(4);
            textView2.setVisibility(0);
            try {
                this.mBottomSheetDialog.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static /* synthetic */ void lambda$compDownload$1(CheckBox checkBox, CompoundButton compoundButton, boolean z) {
        if (checkBox.isChecked()) {
            Log.v("OnCheckedChanged", "Check true");
            MLSessionActivity.setResumeToggle(false);
        } else {
            MLSessionActivity.setResumeToggle(true);
        }
    }

    /* JADX INFO: renamed from: lambda$compDownload$2$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9974lambda$compDownload$2$commedicmediamedilinkMLDownloadActivity(VideoSubRealm videoSubRealm, View view) {
        this.viewModel.startVideo(this, videoSubRealm);
        this.mBottomSheetDialog.dismiss();
    }

    /* JADX INFO: renamed from: lambda$compDownload$3$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9975lambda$compDownload$3$commedicmediamedilinkMLDownloadActivity(View view) {
        this.mBottomSheetDialog.dismiss();
    }

    public void compDownload(boolean z, boolean z2, String str, String str2) {
        try {
            MLCustomBottomSheetDialog mLCustomBottomSheetDialog = this.mBottomSheetDialog;
            if (mLCustomBottomSheetDialog != null && mLCustomBottomSheetDialog.isShowing()) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mBottomSheetDialog = new MLCustomBottomSheetDialog(this);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottomsheet_download_comp, (ViewGroup) null);
        this.mBottomSheetDialog.setContentView(viewInflate);
        BottomSheetBehavior.from((View) viewInflate.getParent()).setPeekHeight(MLConst.MLBottomsSheet.MAX_WIDTH);
        Button button = (Button) viewInflate.findViewById(R.id.button7);
        Button button2 = (Button) viewInflate.findViewById(R.id.button6);
        button2.setText(getString(R.string.movie_download_play));
        Button button3 = (Button) viewInflate.findViewById(R.id.button5);
        TextView textView = (TextView) viewInflate.findViewById(R.id.textView2);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.download_comp_message);
        textView2.setText(str);
        ((TextView) viewInflate.findViewById(R.id.textView3)).setText(str2);
        viewInflate.findViewById(R.id.checkBox2).setVisibility(8);
        EditText editText = (EditText) viewInflate.findViewById(R.id.edtSerial);
        if (!z) {
            editText.setVisibility(8);
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m9976lambda$compDownload$4$commedicmediamedilinkMLDownloadActivity(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m9977lambda$compDownload$5$commedicmediamedilinkMLDownloadActivity(view);
            }
        });
        if (z2) {
            button3.setVisibility(8);
            button2.setText("戻る");
        } else {
            if (str.contains(ScanError.AP43_001)) {
                button2.setText(getString(R.string.dialog_how_to_use));
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.medicmedia.medilink.MLDownloadActivity$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m9978lambda$compDownload$6$commedicmediamedilinkMLDownloadActivity(view);
                    }
                });
            } else {
                button2.setVisibility(8);
            }
            button3.setText("戻る");
        }
        button.setVisibility(8);
        textView.setVisibility(4);
        textView2.setVisibility(0);
        try {
            this.mBottomSheetDialog.show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: lambda$compDownload$4$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9976lambda$compDownload$4$commedicmediamedilinkMLDownloadActivity(View view) {
        this.mBottomSheetDialog.dismiss();
    }

    /* JADX INFO: renamed from: lambda$compDownload$5$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9977lambda$compDownload$5$commedicmediamedilinkMLDownloadActivity(View view) {
        this.mBottomSheetDialog.dismiss();
    }

    /* JADX INFO: renamed from: lambda$compDownload$6$com-medicmedia-medilink-MLDownloadActivity, reason: not valid java name */
    /* synthetic */ void m9978lambda$compDownload$6$commedicmediamedilinkMLDownloadActivity(View view) {
        this.viewModel.startQrHelpPage(this);
        this.mBottomSheetDialog.dismiss();
    }
}
