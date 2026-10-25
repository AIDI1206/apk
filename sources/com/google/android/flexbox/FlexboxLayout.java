package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int position, View view) {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FlexboxLayout, defStyleAttr, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i != 0) {
            this.mShowDividerVertical = i;
            this.mShowDividerHorizontal = i;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i2 != 0) {
            this.mShowDividerVertical = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i3 != 0) {
            this.mShowDividerHorizontal = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i = this.mFlexDirection;
        if (i == 0 || i == 1) {
            measureHorizontal(widthMeasureSpec, heightMeasureSpec);
        } else {
            if (i == 2 || i == 3) {
                measureVertical(widthMeasureSpec, heightMeasureSpec);
                return;
            }
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int index) {
        return getChildAt(index);
    }

    public View getReorderedChildAt(int index) {
        if (index < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (index >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[index]);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int index) {
        return getReorderedChildAt(index);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(child, index, params, this.mOrderCache);
        super.addView(child, index, params);
    }

    private void measureHorizontal(int widthMeasureSpec, int heightMeasureSpec) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, widthMeasureSpec, heightMeasureSpec);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(widthMeasureSpec, heightMeasureSpec);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i = 0; i < flexLine.mItemCount; i++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        if (this.mFlexWrap != 2) {
                            iMax = Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.mMaxBaseline - reorderedChildAt.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            iMax = Math.max(iMax, reorderedChildAt.getMeasuredHeight() + layoutParams.topMargin + Math.max((flexLine.mMaxBaseline - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(widthMeasureSpec, heightMeasureSpec, getPaddingTop() + getPaddingBottom());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, widthMeasureSpec, heightMeasureSpec, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int widthMeasureSpec, int heightMeasureSpec) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, widthMeasureSpec, heightMeasureSpec);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(widthMeasureSpec, heightMeasureSpec);
        this.mFlexboxHelper.determineCrossSize(widthMeasureSpec, heightMeasureSpec, getPaddingLeft() + getPaddingRight());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, widthMeasureSpec, heightMeasureSpec, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int flexDirection, int widthMeasureSpec, int heightMeasureSpec, int childState) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (flexDirection == 0 || flexDirection == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (flexDirection == 2 || flexDirection == 3) {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                childState = View.combineMeasuredStates(childState, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, widthMeasureSpec, childState);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, widthMeasureSpec, childState);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                childState = View.combineMeasuredStates(childState, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, widthMeasureSpec, childState);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                childState = View.combineMeasuredStates(childState, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, heightMeasureSpec, childState);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, heightMeasureSpec, childState);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                childState = View.combineMeasuredStates(childState, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, heightMeasureSpec, childState);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.mFlexLines.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            FlexLine flexLine = this.mFlexLines.get(i4);
            if (hasDividerBeforeFlexLine(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i2 = this.mDividerHorizontalHeight;
                } else {
                    i2 = this.mDividerVerticalWidth;
                }
                i3 += i2;
            }
            if (hasEndDividerAfterFlexLine(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i = this.mDividerHorizontalHeight;
                } else {
                    i = this.mDividerVerticalWidth;
                }
                i3 += i;
            }
            i3 += flexLine.mCrossSize;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        boolean z;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.mFlexDirection;
        if (i == 0) {
            layoutHorizontal(layoutDirection == 1, left, top, right, bottom);
            return;
        }
        if (i == 1) {
            layoutHorizontal(layoutDirection != 1, left, top, right, bottom);
            return;
        }
        if (i == 2) {
            z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            layoutVertical(z, false, left, top, right, bottom);
            return;
        }
        if (i == 3) {
            z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            layoutVertical(z, true, left, top, right, bottom);
            return;
        }
        throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ed  */
    private void layoutHorizontal(boolean isRtl, int left, int top, int right, int bottom) {
        float measuredWidth;
        int i;
        float f;
        float f2;
        float fMax;
        int i2;
        int i3;
        View reorderedChildAt;
        boolean z;
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        float f5;
        int i7;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i8 = right - left;
        int paddingBottom = (bottom - top) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i9 = 0; i9 < size; i9++) {
            FlexLine flexLine2 = this.mFlexLines.get(i9);
            if (hasDividerBeforeFlexLine(i9)) {
                int i10 = this.mDividerHorizontalHeight;
                paddingBottom -= i10;
                paddingTop += i10;
            }
            int i11 = paddingBottom;
            int i12 = this.mJustifyContent;
            char c = 4;
            int i13 = 2;
            boolean z2 = true;
            if (i12 != 0) {
                if (i12 == 1) {
                    measuredWidth = (i8 - flexLine2.mMainSize) + paddingRight;
                    i = flexLine2.mMainSize - paddingLeft;
                } else if (i12 == 2) {
                    measuredWidth = paddingLeft + ((i8 - flexLine2.mMainSize) / 2.0f);
                    f = (i8 - paddingRight) - ((i8 - flexLine2.mMainSize) / 2.0f);
                    f2 = 0.0f;
                } else if (i12 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f2 = (i8 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f = i8 - paddingRight;
                } else if (i12 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    float f6 = itemCountNotGone2 != 0 ? (i8 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i8 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else if (i12 == 5) {
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f2 = itemCountNotGone3 != 0 ? (i8 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i8 - paddingRight) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                }
                fMax = Math.max(f2, 0.0f);
                i2 = 0;
                while (i2 < flexLine2.mItemCount) {
                    i3 = flexLine2.mFirstIndex + i2;
                    reorderedChildAt = getReorderedChildAt(i3);
                    char c2 = c;
                    if (reorderedChildAt != null) {
                        z = z2;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z = z;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f3 = measuredWidth + layoutParams.leftMargin;
                            f4 = f - layoutParams.rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                                int i14 = this.mDividerVerticalWidth;
                                float f9 = i14;
                                f3 += f9;
                                f4 -= f9;
                                i6 = i14;
                            } else {
                                i6 = 0;
                            }
                            f5 = f4;
                            if (i2 == flexLine2.mItemCount - 1 || (this.mShowDividerVertical & 4) <= 0) {
                                i7 = 0;
                            } else {
                                i7 = this.mDividerVerticalWidth;
                            }
                            if (this.mFlexWrap == i13) {
                                if (isRtl) {
                                    i5 = i13;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), i11 - reorderedChildAt.getMeasuredHeight(), Math.round(f5), i11);
                                } else {
                                    view = reorderedChildAt;
                                    i5 = i13;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f3), i11 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i11);
                                }
                                i4 = i11;
                            } else {
                                i2 = i2;
                                view = reorderedChildAt;
                                z = z;
                                i5 = i13;
                                i4 = i11;
                                if (isRtl) {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i15 = paddingTop;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f3), i15, view.getMeasuredWidth() + Math.round(f3), i15 + view.getMeasuredHeight());
                                    paddingTop = i15;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + layoutParams.rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + layoutParams.leftMargin);
                            if (isRtl) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i7, 0, i6, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i6, 0, i7, 0);
                            }
                            flexLine2 = flexLine;
                            f = measuredWidth2;
                        }
                        i2++;
                        c = c2;
                        i13 = i5;
                        z2 = z;
                        i11 = i4;
                    } else {
                        z = z2;
                    }
                    i5 = i13;
                    i2 = i2;
                    i4 = i11;
                    i2++;
                    c = c2;
                    i13 = i5;
                    z2 = z;
                    i11 = i4;
                }
                paddingTop += flexLine2.mCrossSize;
                paddingBottom = i11 - flexLine2.mCrossSize;
            } else {
                measuredWidth = paddingLeft;
                i = i8 - paddingRight;
            }
            f = i;
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i2 = 0;
            while (i2 < flexLine2.mItemCount) {
                i3 = flexLine2.mFirstIndex + i2;
                reorderedChildAt = getReorderedChildAt(i3);
                char c3 = c;
                if (reorderedChildAt != null) {
                    z = z2;
                    if (reorderedChildAt.getVisibility() == 8) {
                        z = z;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f3 = measuredWidth + layoutParams2.leftMargin;
                        f4 = f - layoutParams2.rightMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                            int i16 = this.mDividerVerticalWidth;
                            float f10 = i16;
                            f3 += f10;
                            f4 -= f10;
                            i6 = i16;
                        } else {
                            i6 = 0;
                        }
                        f5 = f4;
                        if (i2 == flexLine2.mItemCount - 1) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                        }
                        if (this.mFlexWrap == i13) {
                            if (isRtl) {
                                i5 = i13;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), i11 - reorderedChildAt.getMeasuredHeight(), Math.round(f5), i11);
                            } else {
                                view = reorderedChildAt;
                                i5 = i13;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f3), i11 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i11);
                            }
                            i4 = i11;
                        } else {
                            i2 = i2;
                            view = reorderedChildAt;
                            z = z;
                            i5 = i13;
                            i4 = i11;
                            if (isRtl) {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i17 = paddingTop;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f3), i17, view.getMeasuredWidth() + Math.round(f3), i17 + view.getMeasuredHeight());
                                paddingTop = i17;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + layoutParams2.rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + layoutParams2.leftMargin);
                        if (isRtl) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i7, 0, i6, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i6, 0, i7, 0);
                        }
                        flexLine2 = flexLine;
                        f = measuredWidth3;
                    }
                    i2++;
                    c = c3;
                    i13 = i5;
                    z2 = z;
                    i11 = i4;
                } else {
                    z = z2;
                }
                i5 = i13;
                i2 = i2;
                i4 = i11;
                i2++;
                c = c3;
                i13 = i5;
                z2 = z;
                i11 = i4;
            }
            paddingTop += flexLine2.mCrossSize;
            paddingBottom = i11 - flexLine2.mCrossSize;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    private void layoutVertical(boolean isRtl, boolean fromBottomToTop, int left, int top, int right, int bottom) {
        float measuredHeight;
        int i;
        float f;
        float f2;
        float fMax;
        int i2;
        int i3;
        int i4;
        View reorderedChildAt;
        char c;
        int i5;
        int i6;
        float f3;
        float f4;
        int i7;
        float f5;
        int i8;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = bottom - top;
        int i10 = (right - left) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine2 = this.mFlexLines.get(i11);
            if (hasDividerBeforeFlexLine(i11)) {
                int i12 = this.mDividerVerticalWidth;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = i10;
            int i14 = this.mJustifyContent;
            char c2 = 4;
            int i15 = 1;
            if (i14 != 0) {
                if (i14 == 1) {
                    measuredHeight = (i9 - flexLine2.mMainSize) + paddingBottom;
                    i = flexLine2.mMainSize - paddingTop;
                } else if (i14 == 2) {
                    measuredHeight = paddingTop + ((i9 - flexLine2.mMainSize) / 2.0f);
                    f = (i9 - paddingBottom) - ((i9 - flexLine2.mMainSize) / 2.0f);
                    f2 = 0.0f;
                } else if (i14 == 3) {
                    measuredHeight = paddingTop;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f2 = (i9 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f = i9 - paddingBottom;
                } else if (i14 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    f2 = itemCountNotGone2 != 0 ? (i9 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i9 - paddingBottom) - f6;
                } else if (i14 == 5) {
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f2 = itemCountNotGone3 != 0 ? (i9 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i9 - paddingBottom) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                }
                fMax = Math.max(f2, 0.0f);
                i2 = 0;
                while (i2 < flexLine2.mItemCount) {
                    i3 = flexLine2.mFirstIndex + i2;
                    i4 = i15;
                    reorderedChildAt = getReorderedChildAt(i3);
                    if (reorderedChildAt != null) {
                        c = c2;
                        if (reorderedChildAt.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f3 = measuredHeight + layoutParams.topMargin;
                            f4 = f - layoutParams.bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                                i7 = this.mDividerHorizontalHeight;
                                float f7 = i7;
                                f3 += f7;
                                f4 -= f7;
                            } else {
                                i7 = 0;
                            }
                            f5 = f4;
                            if (i2 == flexLine2.mItemCount - i4 || (this.mShowDividerHorizontal & 4) <= 0) {
                                i8 = 0;
                            } else {
                                i8 = this.mDividerHorizontalHeight;
                            }
                            if (isRtl) {
                                if (fromBottomToTop) {
                                    i5 = i2;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i13 - reorderedChildAt.getMeasuredWidth(), Math.round(f5) - reorderedChildAt.getMeasuredHeight(), i13, Math.round(f5));
                                } else {
                                    i5 = i2;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i13 - reorderedChildAt.getMeasuredWidth(), Math.round(f3), i13, Math.round(f3) + reorderedChildAt.getMeasuredHeight());
                                }
                                i6 = i13;
                            } else {
                                i5 = i2;
                                i4 = i4;
                                i6 = i13;
                                if (fromBottomToTop) {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f5) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f5));
                                } else {
                                    int i16 = paddingLeft;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i16, Math.round(f3), i16 + reorderedChildAt.getMeasuredWidth(), Math.round(f3) + reorderedChildAt.getMeasuredHeight());
                                    paddingLeft = i16;
                                }
                            }
                            measuredHeight = f3 + reorderedChildAt.getMeasuredHeight() + fMax + layoutParams.bottomMargin;
                            float measuredHeight2 = f5 - ((reorderedChildAt.getMeasuredHeight() + fMax) + layoutParams.topMargin);
                            if (fromBottomToTop) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i8, 0, i7);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i7, 0, i8);
                            }
                            flexLine2 = flexLine;
                            f = measuredHeight2;
                        }
                        i2 = i5 + 1;
                        c2 = c;
                        i15 = i4;
                        i13 = i6;
                    } else {
                        c = c2;
                    }
                    i5 = i2;
                    i4 = i4;
                    i6 = i13;
                    i2 = i5 + 1;
                    c2 = c;
                    i15 = i4;
                    i13 = i6;
                }
                paddingLeft += flexLine2.mCrossSize;
                i10 = i13 - flexLine2.mCrossSize;
            } else {
                measuredHeight = paddingTop;
                i = i9 - paddingBottom;
            }
            f = i;
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i2 = 0;
            while (i2 < flexLine2.mItemCount) {
                i3 = flexLine2.mFirstIndex + i2;
                i4 = i15;
                reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null) {
                    c = c2;
                    if (reorderedChildAt.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f3 = measuredHeight + layoutParams2.topMargin;
                        f4 = f - layoutParams2.bottomMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                            i7 = this.mDividerHorizontalHeight;
                            float f8 = i7;
                            f3 += f8;
                            f4 -= f8;
                        } else {
                            i7 = 0;
                        }
                        f5 = f4;
                        if (i2 == flexLine2.mItemCount - i4) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        if (isRtl) {
                            if (fromBottomToTop) {
                                i5 = i2;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i13 - reorderedChildAt.getMeasuredWidth(), Math.round(f5) - reorderedChildAt.getMeasuredHeight(), i13, Math.round(f5));
                            } else {
                                i5 = i2;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i13 - reorderedChildAt.getMeasuredWidth(), Math.round(f3), i13, Math.round(f3) + reorderedChildAt.getMeasuredHeight());
                            }
                            i6 = i13;
                        } else {
                            i5 = i2;
                            i4 = i4;
                            i6 = i13;
                            if (fromBottomToTop) {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f5) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f5));
                            } else {
                                int i17 = paddingLeft;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i17, Math.round(f3), i17 + reorderedChildAt.getMeasuredWidth(), Math.round(f3) + reorderedChildAt.getMeasuredHeight());
                                paddingLeft = i17;
                            }
                        }
                        measuredHeight = f3 + reorderedChildAt.getMeasuredHeight() + fMax + layoutParams2.bottomMargin;
                        float measuredHeight3 = f5 - ((reorderedChildAt.getMeasuredHeight() + fMax) + layoutParams2.topMargin);
                        if (fromBottomToTop) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i8, 0, i7);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i7, 0, i8);
                        }
                        flexLine2 = flexLine;
                        f = measuredHeight3;
                    }
                    i2 = i5 + 1;
                    c2 = c;
                    i15 = i4;
                    i13 = i6;
                } else {
                    c = c2;
                }
                i5 = i2;
                i4 = i4;
                i6 = i13;
                i2 = i5 + 1;
                c2 = c;
                i15 = i4;
                i13 = i6;
            }
            paddingLeft += flexLine2.mCrossSize;
            i10 = i13 - flexLine2.mCrossSize;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.mFlexDirection;
        if (i == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            drawDividersVertical(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z2 = !z2;
        }
        drawDividersVertical(canvas, z2, true);
    }

    private void drawDividersHorizontal(Canvas canvas, boolean isRtl, boolean fromBottomToTop) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i3 = 0; i3 < size; i3++) {
            FlexLine flexLine = this.mFlexLines.get(i3);
            for (int i4 = 0; i4 < flexLine.mItemCount; i4++) {
                int i5 = flexLine.mFirstIndex + i4;
                View reorderedChildAt = getReorderedChildAt(i5);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i5, i4)) {
                        if (isRtl) {
                            left = reorderedChildAt.getRight() + layoutParams.rightMargin;
                        } else {
                            left = (reorderedChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerVerticalWidth;
                        }
                        drawVerticalDivider(canvas, left, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i4 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        if (isRtl) {
                            right = (reorderedChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerVerticalWidth;
                        } else {
                            right = reorderedChildAt.getRight() + layoutParams.rightMargin;
                        }
                        drawVerticalDivider(canvas, right, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i3)) {
                if (fromBottomToTop) {
                    i2 = flexLine.mBottom;
                } else {
                    i2 = flexLine.mTop - this.mDividerHorizontalHeight;
                }
                drawHorizontalDivider(canvas, paddingLeft, i2, iMax);
            }
            if (hasEndDividerAfterFlexLine(i3) && (this.mShowDividerHorizontal & 4) > 0) {
                if (fromBottomToTop) {
                    i = flexLine.mTop - this.mDividerHorizontalHeight;
                } else {
                    i = flexLine.mBottom;
                }
                drawHorizontalDivider(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean isRtl, boolean fromBottomToTop) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i3 = 0; i3 < size; i3++) {
            FlexLine flexLine = this.mFlexLines.get(i3);
            for (int i4 = 0; i4 < flexLine.mItemCount; i4++) {
                int i5 = flexLine.mFirstIndex + i4;
                View reorderedChildAt = getReorderedChildAt(i5);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i5, i4)) {
                        if (fromBottomToTop) {
                            top = reorderedChildAt.getBottom() + layoutParams.bottomMargin;
                        } else {
                            top = (reorderedChildAt.getTop() - layoutParams.topMargin) - this.mDividerHorizontalHeight;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, top, flexLine.mCrossSize);
                    }
                    if (i4 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        if (fromBottomToTop) {
                            bottom = (reorderedChildAt.getTop() - layoutParams.topMargin) - this.mDividerHorizontalHeight;
                        } else {
                            bottom = reorderedChildAt.getBottom() + layoutParams.bottomMargin;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, bottom, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i3)) {
                if (isRtl) {
                    i2 = flexLine.mRight;
                } else {
                    i2 = flexLine.mLeft - this.mDividerVerticalWidth;
                }
                drawVerticalDivider(canvas, i2, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i3) && (this.mShowDividerVertical & 4) > 0) {
                if (isRtl) {
                    i = flexLine.mLeft - this.mDividerVerticalWidth;
                } else {
                    i = flexLine.mRight;
                }
                drawVerticalDivider(canvas, i, paddingTop, iMax);
            }
        }
    }

    private void drawVerticalDivider(Canvas canvas, int left, int top, int length) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(left, top, this.mDividerVerticalWidth + left, length + top);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private void drawHorizontalDivider(Canvas canvas, int left, int top, int length) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(left, top, length + left, this.mDividerHorizontalHeight + top);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        if (lp instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) lp);
        }
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) lp);
        }
        return new LayoutParams(lp);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int flexDirection) {
        if (this.mFlexDirection != flexDirection) {
            this.mFlexDirection = flexDirection;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int flexWrap) {
        if (this.mFlexWrap != flexWrap) {
            this.mFlexWrap = flexWrap;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int justifyContent) {
        if (this.mJustifyContent != justifyContent) {
            this.mJustifyContent = justifyContent;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int alignItems) {
        if (this.mAlignItems != alignItems) {
            this.mAlignItems = alignItems;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int alignContent) {
        if (this.mAlignContent != alignContent) {
            this.mAlignContent = alignContent;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int maxLine) {
        if (this.mMaxLine != maxLine) {
            this.mMaxLine = maxLine;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int index, int indexInFlexLine) {
        int i;
        int i2;
        if (isMainAxisDirectionHorizontal()) {
            i = hasDividerBeforeChildAtAlongMainAxis(index, indexInFlexLine) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i;
            }
            i2 = this.mDividerVerticalWidth;
        } else {
            i = hasDividerBeforeChildAtAlongMainAxis(index, indexInFlexLine) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i;
            }
            i2 = this.mDividerHorizontalHeight;
        }
        return i + i2;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                flexLine.mMainSize += this.mDividerVerticalWidth;
                flexLine.mDividerLengthInMainSize += this.mDividerVerticalWidth;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            flexLine.mMainSize += this.mDividerHorizontalHeight;
            flexLine.mDividerLengthInMainSize += this.mDividerHorizontalHeight;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int widthSpec, int padding, int childDimension) {
        return getChildMeasureSpec(widthSpec, padding, childDimension);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int heightSpec, int padding, int childDimension) {
        return getChildMeasureSpec(heightSpec, padding, childDimension);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int index, int indexInFlexLine, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(index, indexInFlexLine)) {
            if (isMainAxisDirectionHorizontal()) {
                flexLine.mMainSize += this.mDividerVerticalWidth;
                flexLine.mDividerLengthInMainSize += this.mDividerVerticalWidth;
            } else {
                flexLine.mMainSize += this.mDividerHorizontalHeight;
                flexLine.mDividerLengthInMainSize += this.mDividerHorizontalHeight;
            }
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> flexLines) {
        this.mFlexLines = flexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    public void setDividerDrawable(Drawable divider) {
        setDividerDrawableHorizontal(divider);
        setDividerDrawableVertical(divider);
    }

    public void setDividerDrawableHorizontal(Drawable divider) {
        if (divider == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = divider;
        if (divider != null) {
            this.mDividerHorizontalHeight = divider.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable divider) {
        if (divider == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = divider;
        if (divider != null) {
            this.mDividerVerticalWidth = divider.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public void setShowDivider(int dividerMode) {
        setShowDividerVertical(dividerMode);
        setShowDividerHorizontal(dividerMode);
    }

    public void setShowDividerVertical(int dividerMode) {
        if (dividerMode != this.mShowDividerVertical) {
            this.mShowDividerVertical = dividerMode;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int dividerMode) {
        if (dividerMode != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = dividerMode;
            requestLayout();
        }
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int index, int indexInFlexLine) {
        if (allViewsAreGoneBefore(index, indexInFlexLine)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerVertical & 1) != 0;
            }
            return (this.mShowDividerHorizontal & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerVertical & 2) != 0;
        }
        return (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean allViewsAreGoneBefore(int index, int indexInFlexLine) {
        for (int i = 1; i <= indexInFlexLine; i++) {
            View reorderedChildAt = getReorderedChildAt(index - i);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDividerBeforeFlexLine(int flexLineIndex) {
        if (flexLineIndex >= 0 && flexLineIndex < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(flexLineIndex)) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.mShowDividerHorizontal & 1) != 0;
                }
                return (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean allFlexLinesAreDummyBefore(int flexLineIndex) {
        for (int i = 0; i < flexLineIndex; i++) {
            if (this.mFlexLines.get(i).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean hasEndDividerAfterFlexLine(int flexLineIndex) {
        if (flexLineIndex >= 0 && flexLineIndex < this.mFlexLines.size()) {
            for (int i = flexLineIndex + 1; i < this.mFlexLines.size(); i++) {
                if (this.mFlexLines.get(i).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel source) {
                return new LayoutParams(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int size) {
                return new LayoutParams[size];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private int mOrder;
        private boolean mWrapBefore;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LayoutParams(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = source.mOrder;
            this.mFlexGrow = source.mFlexGrow;
            this.mFlexShrink = source.mFlexShrink;
            this.mAlignSelf = source.mAlignSelf;
            this.mFlexBasisPercent = source.mFlexBasisPercent;
            this.mMinWidth = source.mMinWidth;
            this.mMinHeight = source.mMinHeight;
            this.mMaxWidth = source.mMaxWidth;
            this.mMaxHeight = source.mMaxHeight;
            this.mWrapBefore = source.mWrapBefore;
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int width, int height) {
            super(new ViewGroup.LayoutParams(width, height));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int width) {
            this.width = width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int height) {
            this.height = height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.mOrder;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int order) {
            this.mOrder = order;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float flexGrow) {
            this.mFlexGrow = flexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float flexShrink) {
            this.mFlexShrink = flexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int alignSelf) {
            this.mAlignSelf = alignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int minWidth) {
            this.mMinWidth = minWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int minHeight) {
            this.mMinHeight = minHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int maxWidth) {
            this.mMaxWidth = maxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int maxHeight) {
            this.mMaxHeight = maxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean wrapBefore) {
            this.mWrapBefore = wrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float flexBasisPercent) {
            this.mFlexBasisPercent = flexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mOrder);
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected LayoutParams(Parcel in) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = in.readInt();
            this.mFlexGrow = in.readFloat();
            this.mFlexShrink = in.readFloat();
            this.mAlignSelf = in.readInt();
            this.mFlexBasisPercent = in.readFloat();
            this.mMinWidth = in.readInt();
            this.mMinHeight = in.readInt();
            this.mMaxWidth = in.readInt();
            this.mMaxHeight = in.readInt();
            this.mWrapBefore = in.readByte() != 0;
            this.bottomMargin = in.readInt();
            this.leftMargin = in.readInt();
            this.rightMargin = in.readInt();
            this.topMargin = in.readInt();
            this.height = in.readInt();
            this.width = in.readInt();
        }
    }
}
