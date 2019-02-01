package com.github.florent37.viewanimator;

import android.view.View;

public class AnimationListener {

    public interface Start {
        void onStart();
    }

    public interface Stop {
        void onStop();
    }

    public interface Update<V extends View> {
        void update(V v, float f);
    }

    private AnimationListener() {
    }
}
