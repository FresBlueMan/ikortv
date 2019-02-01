package com.shizhefei.view.viewpager;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;

/* compiled from: RecycleBin */
/* renamed from: com.shizhefei.view.viewpager.b */
public class C0791b {
    /* renamed from: a */
    private View[] f1402a = new View[0];
    /* renamed from: b */
    private int[] f1403b = new int[0];
    /* renamed from: c */
    private SparseArray<View>[] f1404c;
    /* renamed from: d */
    private int f1405d;
    /* renamed from: e */
    private SparseArray<View> f1406e;

    /* renamed from: b */
    protected boolean m1443b(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public void m1441a(int i) {
        if (i >= 1) {
            SparseArray[] sparseArrayArr = new SparseArray[i];
            for (int i2 = 0; i2 < i; i2++) {
                sparseArrayArr[i2] = new SparseArray();
            }
            this.f1405d = i;
            this.f1406e = sparseArrayArr[0];
            this.f1404c = sparseArrayArr;
            return;
        }
        throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
    }

    /* renamed from: a */
    View m1439a(int i, int i2) {
        if (this.f1405d == 1) {
            return C0791b.m1437a(this.f1406e, i);
        }
        return (i2 < 0 || i2 >= this.f1404c.length) ? 0 : C0791b.m1437a(this.f1404c[i2], i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    void m1442a(View view, int i, int i2) {
        if (this.f1405d == 1) {
            this.f1406e.put(i, view);
        } else {
            this.f1404c[i2].put(i, view);
        }
        if (VERSION.SDK_INT >= 14) {
            view.setAccessibilityDelegate(0);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    void m1440a() {
        View[] viewArr = this.f1402a;
        int[] iArr = this.f1403b;
        Object obj = this.f1405d > 1 ? 1 : null;
        SparseArray sparseArray = this.f1406e;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            View view = viewArr[length];
            if (view != null) {
                int i = iArr[length];
                viewArr[length] = null;
                iArr[length] = -1;
                if (m1443b(i)) {
                    if (obj != null) {
                        sparseArray = this.f1404c[i];
                    }
                    sparseArray.put(length, view);
                    if (VERSION.SDK_INT >= 14) {
                        view.setAccessibilityDelegate(null);
                    }
                }
            }
        }
        m1438b();
    }

    /* renamed from: b */
    private void m1438b() {
        int length = this.f1402a.length;
        int i = this.f1405d;
        SparseArray[] sparseArrayArr = this.f1404c;
        for (int i2 = 0; i2 < i; i2++) {
            SparseArray sparseArray = sparseArrayArr[i2];
            int size = sparseArray.size();
            int i3 = size - length;
            int i4 = size - 1;
            size = 0;
            while (size < i3) {
                int i5 = i4 - 1;
                sparseArray.remove(sparseArray.keyAt(i4));
                size++;
                i4 = i5;
            }
        }
    }

    /* renamed from: a */
    static View m1437a(SparseArray<View> sparseArray, int i) {
        int size = sparseArray.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            View view = (View) sparseArray.get(keyAt);
            if (keyAt == i) {
                sparseArray.remove(keyAt);
                return view;
            }
        }
        size--;
        View view2 = (View) sparseArray.valueAt(size);
        sparseArray.remove(sparseArray.keyAt(size));
        return view2;
    }
}
