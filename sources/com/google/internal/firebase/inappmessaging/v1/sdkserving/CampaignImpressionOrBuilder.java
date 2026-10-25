package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface CampaignImpressionOrBuilder extends MessageLiteOrBuilder {
    String getCampaignId();

    ByteString getCampaignIdBytes();

    long getImpressionTimestampMillis();
}
