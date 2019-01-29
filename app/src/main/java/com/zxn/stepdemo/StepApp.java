package com.zxn.stepdemo;

import android.app.Activity;
import android.app.Application;

//import com.zxn.steplib.LifecycleCallback;
//import com.zxn.steplib.TodayStepManager;

/**
 * Created by zxn on 2019/1/28.
 */
public class StepApp extends Application {

    private static StepApp mStepApp;
    private int mAppCount = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        mStepApp = this;

        /*registerActivityLifecycleCallbacks(new LifecycleCallback() {


            @Override
            public void onActivityStarted(Activity activity) {
                mAppCount++;
            }

            @Override
            public void onActivityStopped(Activity activity) {
                mAppCount--;
            }

        });*/
    }

    public boolean isForeground() {
        return mAppCount > 0;
    }

    public static StepApp getApp() {
        return mStepApp;
    }
}
