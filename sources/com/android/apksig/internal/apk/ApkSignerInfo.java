package com.android.apksig.internal.apk;

import com.android.apksig.ApkVerificationIssue;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSignerInfo {
    public int index;
    public long timestamp;
    public List<X509Certificate> certs = new ArrayList();
    public List<X509Certificate> certificateLineage = new ArrayList();
    private final List<ApkVerificationIssue> mInfoMessages = new ArrayList();
    private final List<ApkVerificationIssue> mWarnings = new ArrayList();
    private final List<ApkVerificationIssue> mErrors = new ArrayList();

    public void addError(int issueId, Object... params) {
        this.mErrors.add(new ApkVerificationIssue(issueId, params));
    }

    public void addWarning(int issueId, Object... params) {
        this.mWarnings.add(new ApkVerificationIssue(issueId, params));
    }

    public void addInfoMessage(int issueId, Object... params) {
        this.mInfoMessages.add(new ApkVerificationIssue(issueId, params));
    }

    public boolean containsErrors() {
        return !this.mErrors.isEmpty();
    }

    public boolean containsWarnings() {
        return !this.mWarnings.isEmpty();
    }

    public boolean containsInfoMessages() {
        return !this.mInfoMessages.isEmpty();
    }

    public List<? extends ApkVerificationIssue> getErrors() {
        return this.mErrors;
    }

    public List<? extends ApkVerificationIssue> getWarnings() {
        return this.mWarnings;
    }

    public List<? extends ApkVerificationIssue> getInfoMessages() {
        return this.mInfoMessages;
    }
}
