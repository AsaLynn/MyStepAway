package com.zxn.stepdemo;

import android.content.Context;
import android.content.Intent;

import com.zxn.steplib.BaseClickBroadcast;


//import com.zxn.steplib.BaseClickBroadcast;

/**
 * Created by zxn on 2019/1/28.
 */
public class MyReceiver extends BaseClickBroadcast {

    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        StepApp tsApplication = (StepApp) context.getApplicationContext();
        if (!tsApplication.isForeground()) {
            Intent mainIntent = new Intent(context, MainActivity.class);
            mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainIntent);
        }
    }
}
