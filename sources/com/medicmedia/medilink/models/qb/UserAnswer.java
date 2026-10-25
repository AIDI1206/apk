package com.medicmedia.medilink.models.qb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class UserAnswer implements Parcelable {
    public static final Parcelable.Creator<UserAnswer> CREATOR = new Parcelable.Creator<UserAnswer>() { // from class: com.medicmedia.medilink.models.qb.UserAnswer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserAnswer createFromParcel(Parcel parcel) {
            return new UserAnswer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserAnswer[] newArray(int i) {
            return new UserAnswer[i];
        }
    };
    public ArrayList<String> answersItems;
    public String id;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeStringList(this.answersItems);
    }

    public void readFromParcel(Parcel parcel) {
        this.id = parcel.readString();
        this.answersItems = parcel.createStringArrayList();
    }

    public UserAnswer() {
        this.answersItems = new ArrayList<>();
    }

    protected UserAnswer(Parcel parcel) {
        this.answersItems = new ArrayList<>();
        this.id = parcel.readString();
        this.answersItems = parcel.createStringArrayList();
    }
}
