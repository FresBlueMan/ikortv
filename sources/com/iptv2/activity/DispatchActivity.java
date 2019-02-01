package com.iptv2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import com.iptv2.base.Activity;

public class DispatchActivity extends Activity {
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return true;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        finish();
        this.c.f1251F.m1346a(this.c.f1248C.m1291a());
        this.c.f1249D.m1236a();
        if (this.c.f1262j == null || this.c.f1262j.m3163c() != null) {
            if (this.c.f1248C.m1323i() != null) {
                this.c.f1248C.m1306b(false);
                startActivity(new Intent(this, IntroActivity.class));
            } else {
                startActivity(new Intent(this, WelcomeActivity.class));
            }
        }
    }
}
