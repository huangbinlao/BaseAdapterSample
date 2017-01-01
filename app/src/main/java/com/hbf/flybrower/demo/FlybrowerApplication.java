package com.hbf.flybrower.demo;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by hbf on 2016/12/31.
 */

public class FlybrowerApplication extends Application {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("flybrower", "onConfigurationChanged: ");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("flybrower","onCreate");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i("flybrower","onLowMemory");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.i("flybroweer","onTerminate");
    }

}
