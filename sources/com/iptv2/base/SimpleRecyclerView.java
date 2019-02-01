package com.iptv2.base;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import com.iptv2.base.RecyclerView.C1102a;
import java.util.ArrayList;

public class SimpleRecyclerView extends RecyclerView {
    /* renamed from: a */
    private int f2455a = -1;
    /* renamed from: b */
    private Adapter f2456b;
    /* renamed from: c */
    private LayoutManager f2457c;
    /* renamed from: d */
    private LinearLayoutManager f2458d;
    /* renamed from: e */
    private GridLayoutManager f2459e;
    /* renamed from: f */
    private C0604b f2460f;
    /* renamed from: g */
    private boolean f2461g;
    /* renamed from: h */
    private int f2462h = 0;
    /* renamed from: i */
    private SparseBooleanArray f2463i = new SparseBooleanArray();
    /* renamed from: j */
    private ArrayList<C0603a> f2464j = new ArrayList();
    /* renamed from: k */
    private int f2465k = 0;
    /* renamed from: l */
    private boolean f2466l = false;

    /* renamed from: com.iptv2.base.SimpleRecyclerView$a */
    public static abstract class C0603a {
        /* renamed from: a */
        public void mo1316a(int i, int i2) {
        }
    }

    /* renamed from: com.iptv2.base.SimpleRecyclerView$b */
    private interface C0604b extends OnClickListener, OnFocusChangeListener, OnLongClickListener {
    }

    /* renamed from: com.iptv2.base.SimpleRecyclerView$c */
    public enum C0605c {
        Top,
        Middle,
        None
    }

    /* renamed from: com.iptv2.base.SimpleRecyclerView$1 */
    class C11031 implements C0604b {
        /* renamed from: a */
        final /* synthetic */ SimpleRecyclerView f1929a;

        C11031(SimpleRecyclerView simpleRecyclerView) {
            this.f1929a = simpleRecyclerView;
        }

        public void onClick(View view) {
            ((C1102a) view.getTag()).mo1855b();
        }

        public void onFocusChange(View view, boolean z) {
            ((C1102a) view.getTag()).mo1854a(z);
        }

        public boolean onLongClick(View view) {
            return ((C1102a) view.getTag()).mo1859e();
        }
    }

    /* renamed from: com.iptv2.base.SimpleRecyclerView$2 */
    class C11042 implements OnChildAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ SimpleRecyclerView f1930a;

        public void onChildViewDetachedFromWindow(View view) {
        }

        C11042(SimpleRecyclerView simpleRecyclerView) {
            this.f1930a = simpleRecyclerView;
        }

        public void onChildViewAttachedToWindow(View view) {
            view.setOnClickListener(this.f1930a.f2460f);
            view.setOnFocusChangeListener(this.f1930a.f2460f);
            view.setOnLongClickListener(this.f1930a.f2460f);
            C1102a c1102a = (C1102a) view.getTag();
            c1102a.mo1858a();
            int adapterPosition = c1102a.getAdapterPosition();
            c1102a.m2343b(adapterPosition == this.f1930a.f2455a);
            if (this.f1930a.f2462h != 0) {
                c1102a.m2345c(this.f1930a.m3147b(adapterPosition));
            }
        }
    }

    public SimpleRecyclerView(Context context) {
        super(context);
        m3133a(context);
    }

    public SimpleRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3133a(context);
    }

    public SimpleRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3133a(context);
    }

    /* renamed from: a */
    private void m3133a(Context context) {
        setItemAnimator(null);
        this.f2460f = new C11031(this);
        addOnChildAttachStateChangeListener(new C11042(this));
    }

    /* renamed from: a */
    public void m3144a(C0603a c0603a) {
        this.f2464j.add(c0603a);
    }

    public void setChoiceMode(int i) {
        this.f2462h = i;
    }

    public void setNavigationLoop(boolean z) {
        this.f2461g = z;
    }

    public void setActivedChildOnTop(boolean z) {
        this.f2466l = z;
        setChildrenDrawingOrderEnabled(z);
    }

    public void setItemHeight(int i) {
        this.f2465k = i;
    }

    public int getSelectedIndex() {
        return this.f2455a;
    }

    public C1102a getSelectedViewHolder() {
        if (!(this.f2455a == -1 || this.f2456b == null)) {
            if (this.f2456b.getItemCount() != 0) {
                return (C1102a) findViewHolderForAdapterPosition(this.f2455a);
            }
        }
        return null;
    }

    /* renamed from: a */
    public C1102a m3140a(int i) {
        if (this.f2456b != null) {
            if (this.f2456b.getItemCount() != 0) {
                return (C1102a) findViewHolderForAdapterPosition(i);
            }
        }
        return 0;
    }

    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
        this.f2456b = adapter;
        if (this.f2456b == null) {
            this.f2455a = -1;
        }
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        this.f2457c = layoutManager;
        this.f2458d = null;
        this.f2459e = null;
        if (this.f2457c != null) {
            if ((this.f2457c instanceof LinearLayoutManager) != null) {
                this.f2458d = (LinearLayoutManager) this.f2457c;
            }
            if ((this.f2457c instanceof GridLayoutManager) != null) {
                this.f2459e = (GridLayoutManager) this.f2457c;
            }
        }
    }

    /* renamed from: b */
    public boolean m3147b(int i) {
        return this.f2463i.get(i);
    }

    /* renamed from: a */
    public void m3141a() {
        this.f2463i.clear();
    }

    /* renamed from: a */
    public void m3143a(int i, boolean z) {
        if (!(this.f2462h == 0 || this.f2456b == null)) {
            if (this.f2456b.getItemCount() != 0) {
                if (m3147b(i) != z) {
                    if (z) {
                        int size = this.f2463i.size();
                        if (size > 0 && this.f2462h == 1) {
                            for (int i2 = 0; i2 < size; i2++) {
                                C1102a c1102a = (C1102a) findViewHolderForAdapterPosition(this.f2463i.keyAt(i2));
                                if (c1102a != null) {
                                    c1102a.m2345c(false);
                                }
                            }
                            this.f2463i.clear();
                        }
                        this.f2463i.put(i, true);
                    } else {
                        this.f2463i.delete(i);
                    }
                    C1102a c1102a2 = (C1102a) findViewHolderForAdapterPosition(i);
                    if (c1102a2 != null) {
                        c1102a2.m2345c(z);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m3146b(int i, boolean z) {
        m3135b(i, z ? C0605c.Middle : C0605c.None);
    }

    /* renamed from: a */
    public void m3142a(int i, C0605c c0605c) {
        m3135b(i, c0605c);
    }

    /* renamed from: b */
    private void m3135b(int i, C0605c c0605c) {
        int i2 = 0;
        if (this.f2456b != null) {
            if (this.f2456b.getItemCount() != 0) {
                int itemCount = this.f2456b.getItemCount();
                if (i == -1) {
                    if (this.f2455a == i) {
                        return;
                    }
                } else if (i < 0) {
                    i = 0;
                } else if (i >= itemCount) {
                    i = itemCount - 1;
                }
                if (this.f2455a != i) {
                    itemCount = this.f2455a;
                    this.f2455a = i;
                    if (itemCount != -1) {
                        C1102a c1102a = (C1102a) findViewHolderForAdapterPosition(itemCount);
                        if (c1102a != null) {
                            c1102a.m2343b(false);
                        }
                    }
                    if (i != -1) {
                        C1102a c1102a2 = (C1102a) findViewHolderForAdapterPosition(i);
                        if (c1102a2 != null) {
                            c1102a2.m2343b(true);
                        }
                        if (getHeight() <= 0) {
                            scrollToPosition(i);
                        } else if (c0605c == C0605c.Middle) {
                            this.f2458d.scrollToPositionWithOffset(i, (getHeight() - this.f2465k) / 2);
                        } else if (c0605c == C0605c.Top) {
                            this.f2458d.scrollToPositionWithOffset(i, 0);
                        } else {
                            scrollToPosition(i);
                        }
                    }
                    c0605c = this.f2464j.size();
                    while (i2 < c0605c) {
                        ((C0603a) this.f2464j.get(i2)).mo1316a(i, itemCount);
                        i2++;
                    }
                    return;
                }
                return;
            }
        }
        if (this.f2455a != -1) {
            i = this.f2455a;
            this.f2455a = -1;
            c0605c = this.f2464j.size();
            while (i2 < c0605c) {
                ((C0603a) this.f2464j.get(i2)).mo1316a(this.f2455a, i);
                i2++;
            }
        }
    }

    /* renamed from: b */
    public void m3145b() {
        if (this.f2456b != null) {
            if (this.f2456b.getItemCount() != 0) {
                if (this.f2456b.getItemCount() != 0) {
                    int d = m3150d();
                    for (int c = m3148c(); c <= d; c++) {
                        C1102a c1102a = (C1102a) findViewHolderForAdapterPosition(c);
                        if (c1102a != null) {
                            c1102a.mo1858a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public int m3148c() {
        return this.f2458d == null ? -1 : this.f2458d.findFirstVisibleItemPosition();
    }

    /* renamed from: d */
    public int m3150d() {
        return this.f2458d == null ? -1 : this.f2458d.findLastVisibleItemPosition();
    }

    /* renamed from: c */
    public boolean m3149c(int i) {
        if (!(this.f2457c == null || this.f2456b == null || this.f2456b.getItemCount() == 0)) {
            if (this.f2455a != -1) {
                if (i == 21 || i == 22 || i == 19 || i == 20) {
                    if (this.f2459e != null) {
                        if (this.f2459e.getOrientation() == 1) {
                            return m3137d(i);
                        }
                    } else if (this.f2458d != null) {
                        if (this.f2458d.getOrientation() == 1) {
                            return m3138e(i);
                        }
                        return m3139f(i);
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m3137d(int i) {
        int itemCount = this.f2456b.getItemCount();
        int spanCount = this.f2459e.getSpanCount();
        int i2 = this.f2455a;
        if (i == 19) {
            if (this.f2461g == 0) {
                if (this.f2455a <= spanCount - 1) {
                    i2 = 0;
                }
            }
            i2 = ((this.f2455a - spanCount) + itemCount) % itemCount;
        } else if (i == 20) {
            if (this.f2461g == 0) {
                if (this.f2455a >= itemCount - spanCount) {
                    i2 = itemCount - 1;
                }
            }
            i2 = (this.f2455a + spanCount) % itemCount;
        } else if (i == 21) {
            if (this.f2461g != 0 || this.f2455a > 0) {
                i2 = ((this.f2455a - 1) + itemCount) % itemCount;
            }
        } else if (i == 22 && (this.f2461g != 0 || this.f2455a < itemCount - 1)) {
            i2 = (this.f2455a + 1) % itemCount;
        }
        if (this.f2455a == i2) {
            return false;
        }
        m3146b(i2, false);
        return true;
    }

    /* renamed from: e */
    private boolean m3138e(int i) {
        int itemCount = this.f2456b.getItemCount();
        int i2 = this.f2455a;
        if (i == 19) {
            if (this.f2461g != 0 || this.f2455a > 0) {
                i2 = ((this.f2455a - 1) + itemCount) % itemCount;
            }
        } else if (i == 20 && (this.f2461g != 0 || this.f2455a < itemCount - 1)) {
            i2 = (this.f2455a + 1) % itemCount;
        }
        if (this.f2455a == i2) {
            return false;
        }
        m3146b(i2, false);
        return true;
    }

    /* renamed from: f */
    private boolean m3139f(int i) {
        int itemCount = this.f2456b.getItemCount();
        int i2 = this.f2455a;
        if (i == 21) {
            if (this.f2461g != 0 || this.f2455a > 0) {
                i2 = ((this.f2455a - 1) + itemCount) % itemCount;
            }
        } else if (i == 22 && (this.f2461g != 0 || this.f2455a < itemCount - 1)) {
            i2 = (this.f2455a + 1) % itemCount;
        }
        if (this.f2455a == i2) {
            return false;
        }
        m3146b(i2, false);
        return true;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = -1;
        if (this.f2455a != -1) {
            C1102a c1102a = (C1102a) findViewHolderForAdapterPosition(this.f2455a);
            if (c1102a != null) {
                i3 = indexOfChild(c1102a.itemView);
            }
        } else {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                i3 = indexOfChild(focusedChild);
            }
        }
        if (i3 >= 0) {
            i--;
            if (i2 == i) {
                if (i3 <= i2) {
                    i2 = i3;
                }
                return i2;
            } else if (i2 == i3) {
                return i;
            }
        }
        return i2;
    }
}
