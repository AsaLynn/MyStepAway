package com.zxn.stepdemo;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;

import com.zxn.steplib.TodayStepManager;
import com.zxn.steplib.TodayStepService;

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

//        Intent intent = new Intent(this, TodayStepService.class);
//        startService(intent);
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

        //TodayStepManager.init(this);
    }

    public boolean isForeground() {
        return mAppCount > 0;
    }

    public static StepApp getApp() {
        return mStepApp;
    }
}
