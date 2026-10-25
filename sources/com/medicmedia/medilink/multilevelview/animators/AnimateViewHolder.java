package com.medicmedia.medilink.multilevelview.animators;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AnimateViewHolder extends RecyclerView.ViewHolder {
    public abstract void animateAddImpl(ViewPropertyAnimatorListener viewPropertyAnimatorListener);

    public abstract void animateRemoveImpl(ViewPropertyAnimatorListener viewPropertyAnimatorListener);

    public void preAnimateAddImpl() {
    }

    public void preAnimateRemoveImpl() {
    }

    public AnimateViewHolder(View view) {
        super(view);
    }
}
