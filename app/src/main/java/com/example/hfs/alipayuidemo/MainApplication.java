package com.example.hfs.alipayuidemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/4/20.
 */

public class MainApplication extends Application {

    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
