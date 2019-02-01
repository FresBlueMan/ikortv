package com.iptv2.p042a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.github.florent37.viewanimator.ViewAnimator;
import com.iptv2.base.C1338a;
import com.iptv2.base.RecyclerView.C1102a;
import com.iptv2.base.SimpleRecyclerView;
import com.iptv2.base.SimpleRecyclerView.C0603a;
import com.iptv2.core.DataEntity.C0702m;
import com.iptv2.core.DataEntity.C0703n;
import com.iptv2.ikortv.R;
import com.iptv2.p043b.C0595e;
import java.text.MessageFormat;

/* compiled from: VodClipsDialog */
/* renamed from: com.iptv2.a.i */
public class C1357i extends C1338a {
    /* renamed from: e */
    private View f2449e;
    /* renamed from: f */
    private C0702m f2450f;
    /* renamed from: g */
    private SimpleRecyclerView f2451g;
    /* renamed from: h */
    private TextView f2452h;
    /* renamed from: i */
    private C0554b f2453i;
    /* renamed from: j */
    private C0703n f2454j;

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$1 */
    class C05511 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1357i f586a;

        C05511(C1357i c1357i) {
            this.f586a = c1357i;
        }

        public void onClick(View view) {
            view = this.f586a.f2451g.getSelectedViewHolder();
            if (view != null) {
                view.mo1855b();
            }
        }
    }

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$2 */
    class C05522 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1357i f587a;

        C05522(C1357i c1357i) {
            this.f587a = c1357i;
        }

        public void run() {
            this.f587a.f2451g.m3146b(this.f587a.a.f1248C.m1289a(this.f587a.f2450f).f1130c, false);
        }
    }

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$3 */
    class C05533 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1357i f588a;

        C05533(C1357i c1357i) {
            this.f588a = c1357i;
        }

        public void onClick(View view) {
            this.f588a.dismiss();
        }
    }

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$b */
    public interface C0554b {
        /* renamed from: a */
        void mo1337a(C0703n c0703n);
    }

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$5 */
    class C10615 extends C0603a {
        /* renamed from: a */
        final /* synthetic */ C1357i f1874a;

        C10615(C1357i c1357i) {
            this.f1874a = c1357i;
        }

        /* renamed from: a */
        public void mo1316a(int i, int i2) {
            i = this.f1874a.f2451g.getSelectedIndex();
            i2 = this.f1874a.f2452h;
            String str = "{0}/{1}";
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i == -1 ? 1 : i + 1);
            objArr[1] = Integer.valueOf(this.f1874a.f2450f.f1125o.size());
            i2.setText(MessageFormat.format(str, objArr));
        }
    }

    /* compiled from: VodClipsDialog */
    /* renamed from: com.iptv2.a.i$a */
    private class C1305a extends C1102a<C0703n> {
        /* renamed from: a */
        public TextView f2214a;
        /* renamed from: b */
        final /* synthetic */ C1357i f2215b;
        /* renamed from: c */
        private ViewAnimator f2216c;

        public C1305a(C1357i c1357i, View view) {
            this.f2215b = c1357i;
            super(view);
            this.f2214a = (TextView) view.findViewById(R.id.text);
        }

        /* renamed from: b */
        public void mo1855b() {
            this.f2215b.f2451g.m3146b(getAdapterPosition(), false);
            this.f2215b.f2454j = (C0703n) this.h;
            this.f2215b.dismiss();
        }

        /* renamed from: a */
        public void m2722a(C0703n c0703n) {
            this.h = c0703n;
            boolean z = true;
            this.f2214a.setText(String.valueOf(((C0703n) this.h).f1130c + 1));
            c0703n = this.f2215b.a.f1248C.m1286a((C0703n) this.h);
            TextView textView = this.f2214a;
            if (c0703n <= 0.0f || c0703n >= 1.0f) {
                z = false;
            }
            textView.setActivated(z);
        }

        /* renamed from: c */
        public void mo1856c() {
            if (this.f2216c != null) {
                this.f2216c.cancel();
            }
            this.f2216c = new ViewAnimator();
            this.f2216c.addAnimationBuilder(this.itemView).scaleX(1.1f).scaleY(1.1f).duration(200).start();
        }

        /* renamed from: d */
        public void mo1857d() {
            if (this.f2216c != null) {
                this.f2216c.cancel();
            }
            this.f2216c = new ViewAnimator();
            this.f2216c.addAnimationBuilder(this.itemView).scaleX(1.0f).scaleY(1.0f).duration(200).start();
        }
    }

    /* renamed from: a */
    public void m3130a(C0702m c0702m) {
        this.f2450f = c0702m;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(null, R.style.Dialog);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f2449e = layoutInflater.inflate(R.layout.dialog_vodclips, viewGroup, false);
        this.f2452h = (TextView) this.f2449e.findViewById(R.id.pageno);
        this.f2451g = (SimpleRecyclerView) this.f2449e.findViewById(R.id.clip_list);
        m3125c();
        if (this.a.f1248C.m1321h() == null) {
            this.f2449e.setFocusable(true);
            this.f2449e.setOnClickListener(new C05511(this));
        }
        C0595e.m810a(this.f2451g, new C05522(this));
        this.f2449e.setOnClickListener(new C05533(this));
        return this.f2449e;
    }

    /* renamed from: a */
    public void m3129a(C0554b c0554b) {
        this.f2453i = c0554b;
    }

    /* renamed from: c */
    private void m3125c() {
        this.f2451g.setChoiceMode(1);
        int dimensionPixelSize = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_vodclips_clip_item_hmargin);
        int dimensionPixelSize2 = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_vodclips_clip_item_vmargin);
        int dimensionPixelSize3 = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_vodclips_clip_item_width);
        int dimensionPixelSize4 = this.a.f1265m.getDimensionPixelSize(R.dimen.dialog_vodclips_clip_item_height);
        final int size = this.f2450f.f1125o.size();
        dimensionPixelSize3 += dimensionPixelSize * 2;
        dimensionPixelSize = Math.min((int) ((((float) this.a.f1266n.widthPixels) * 0.7f) / ((float) dimensionPixelSize3)), size);
        int i = size / dimensionPixelSize;
        if (size % dimensionPixelSize > 0) {
            i++;
        }
        i = Math.min(i, 3);
        LayoutParams layoutParams = this.f2451g.getLayoutParams();
        layoutParams.width = dimensionPixelSize3 * dimensionPixelSize;
        layoutParams.height = i * (dimensionPixelSize4 + (dimensionPixelSize2 * 2));
        this.f2451g.setLayoutManager(new GridLayoutManager(this.b, dimensionPixelSize));
        this.f2451g.setAdapter(new Adapter<C1305a>(this) {
            /* renamed from: b */
            final /* synthetic */ C1357i f1873b;

            public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
                m2264a((C1305a) viewHolder, i);
            }

            public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m2263a(viewGroup, i);
            }

            /* renamed from: a */
            public C1305a m2263a(ViewGroup viewGroup, int i) {
                return new C1305a(this.f1873b, this.f1873b.a.f1264l.inflate(R.layout.dialog_vodclips_clip_item, viewGroup, false));
            }

            /* renamed from: a */
            public void m2264a(C1305a c1305a, int i) {
                c1305a.m2722a((C0703n) this.f1873b.f2450f.f1125o.get(i));
            }

            public int getItemCount() {
                return size;
            }
        });
        this.f2451g.m3144a(new C10615(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f2453i != null) {
            this.f2453i.mo1337a(this.f2454j);
        }
    }

    /* renamed from: a */
    public boolean mo2081a(int i, KeyEvent keyEvent) {
        if (this.f2451g.m3149c(i)) {
            return true;
        }
        if (i != 23) {
            if (i != 66) {
                return super.mo2081a(i, keyEvent);
            }
        }
        i = this.f2451g.getSelectedViewHolder();
        if (i != 0) {
            i.mo1855b();
        }
        return true;
    }
}
