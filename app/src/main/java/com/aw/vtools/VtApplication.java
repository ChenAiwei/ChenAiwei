package com.aw.vtools;

import android.app.Application;

import com.qmuiteam.qmui.arch.QMUISwipeBackActivityManager;

public class VtApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QMUISwipeBackActivityManager.init(this);
    }
}
