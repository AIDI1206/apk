package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1nSDK implements AFj1lSDK {
    private static final BitSet areAllFieldsValid;
    final Runnable AFAdRevenueData;
    private final SensorManager component1;
    private final Map<AFj1pSDK, Map<String, Object>> component2;
    private final Map<AFj1pSDK, AFj1pSDK> component3;
    private final ExecutorService component4;
    private boolean equals;
    boolean getCurrencyIso4217Code;
    final Object getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Handler getRevenue;
    private final Runnable hashCode;

    static {
        BitSet bitSet = new BitSet(6);
        areAllFieldsValid = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        synchronized (this.getMediationNetwork) {
            this.getRevenue.post(new AFj1nSDK$$ExternalSyntheticLambda0(this));
        }
    }

    private AFj1nSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMediationNetwork = new Object();
        BitSet bitSet = areAllFieldsValid;
        this.component3 = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.AFAdRevenueData = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.getMediationNetwork) {
                    AFj1nSDK.this.getMonetizationNetwork();
                    AFj1nSDK.this.getRevenue.postDelayed(AFj1nSDK.this.getMonetizationNetwork, 150L);
                    AFj1nSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.component4();
            }
        };
        this.hashCode = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.getMediationNetwork) {
                    if (AFj1nSDK.this.getCurrencyIso4217Code) {
                        AFj1nSDK.this.getRevenue.removeCallbacks(AFj1nSDK.this.AFAdRevenueData);
                        AFj1nSDK.this.getRevenue.removeCallbacks(AFj1nSDK.this.getMonetizationNetwork);
                        AFj1nSDK.this.getMediationNetwork();
                        AFj1nSDK.this.getCurrencyIso4217Code = false;
                    }
                }
            }
        };
        this.component1 = sensorManager;
        this.getRevenue = handler;
        this.component4 = executorService;
    }

    private static boolean getMonetizationNetwork(int i) {
        return i >= 0 && areAllFieldsValid.get(i);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final void getCurrencyIso4217Code() {
        this.getRevenue.post(this.hashCode);
        this.getRevenue.post(this.AFAdRevenueData);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final synchronized void getRevenue() {
        this.getRevenue.post(this.hashCode);
    }

    final void getMonetizationNetwork() {
        this.getRevenue.post(new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.component1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getMonetizationNetwork(sensor.getType())) {
                    AFj1pSDK aFj1pSDK = new AFj1pSDK(sensor, this.component4);
                    if (!this.component3.containsKey(aFj1pSDK)) {
                        this.component3.put(aFj1pSDK, aFj1pSDK);
                    }
                    this.component1.registerListener(this.component3.get(aFj1pSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.equals = true;
    }

    final void getMediationNetwork() {
        this.getRevenue.post(new AFj1nSDK$$ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid() {
        try {
            if (!this.component3.isEmpty()) {
                for (AFj1pSDK aFj1pSDK : this.component3.values()) {
                    this.component1.unregisterListener(aFj1pSDK);
                    aFj1pSDK.getMonetizationNetwork(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.equals = false;
    }

    private List<Map<String, Object>> component2() {
        synchronized (this.getMediationNetwork) {
            Iterator<AFj1pSDK> it = this.component3.values().iterator();
            while (it.hasNext()) {
                it.next().getMonetizationNetwork(this.component2, true);
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    private List<Map<String, Object>> component3() {
        synchronized (this.getMediationNetwork) {
            if (!this.component3.isEmpty() && this.equals) {
                Iterator<AFj1pSDK> it = this.component3.values().iterator();
                while (it.hasNext()) {
                    it.next().getMonetizationNetwork(this.component2, false);
                }
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listComponent3 = component3();
        if (!listComponent3.isEmpty()) {
            concurrentHashMap.put(HardwareSignalConstantsKt.SENSORS_INFO_KEY, listComponent3);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent2 = component2();
        if (!listComponent2.isEmpty()) {
            concurrentHashMap.put(HardwareSignalConstantsKt.SENSORS_INFO_KEY, listComponent2);
        }
        return concurrentHashMap;
    }

    public AFj1nSDK(Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
