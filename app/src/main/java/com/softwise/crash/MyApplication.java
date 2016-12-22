package com.softwise.crash;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by softwise on 2016/12/15.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        CrashReport.initCrashReport	(getApplicationContext(), "e702082ad9", true);
    }

}
