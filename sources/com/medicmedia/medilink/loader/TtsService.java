package com.medicmedia.medilink.loader;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class TtsService extends Service implements TextToSpeech.OnInitListener {
    public static final String EXTRA_MEANING = "meaning";
    public static final String EXTRA_WORD = "word";
    private Handler handler;
    private boolean isInit;
    private String meaning;
    private TextToSpeech tts;
    private String word;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.tts = new TextToSpeech(getApplicationContext(), this);
        this.handler = new Handler();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.handler.removeCallbacksAndMessages(null);
        this.word = intent.getStringExtra(EXTRA_WORD);
        this.meaning = intent.getStringExtra(EXTRA_MEANING);
        if (this.isInit) {
            speak();
        }
        this.handler.postDelayed(new Runnable() { // from class: com.medicmedia.medilink.loader.TtsService.1
            @Override // java.lang.Runnable
            public void run() {
                TtsService.this.stopSelf();
            }
        }, 15000L);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.tts.shutdown();
        }
        super.onDestroy();
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        int language;
        if (i != 0 || (language = this.tts.setLanguage(Locale.JAPAN)) == -1 || language == -2) {
            return;
        }
        speak();
        this.isInit = true;
    }

    private void speak() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.speak(this.word, 0, null);
            this.tts.speak(this.meaning, 1, null);
        }
    }
}
