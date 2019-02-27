package com.zxn.steplib;

import android.content.Context;

import com.zcommon.lib.SdSpUtil;

/**
 * Created by zxn on 2019/2/27.
 */
public class ConfigHelper {


    private static final String TAG = "ConfigHelper";

    public static final String APP_SHARD = "today_step_share_prefs";

    // 上一次计步器的步数
    public static final String LAST_SENSOR_TIME = "last_sensor_time";
    // 步数补偿数值，每次传感器返回的步数-offset=当前步数
    public static final String STEP_OFFSET = "step_offset";
    // 当天，用来判断是否跨天
    public static final String STEP_TODAY = "step_today";
    // 清除步数
    public static final String CLEAN_STEP = "clean_step";
    // 当前步数
    public static final String CURR_STEP = "curr_step";
    //手机关机监听
    public static final String SHUTDOWN = "shutdown";
    //系统运行时间
    public static final String ELAPSED_REALTIMEl = "elapsed_realtime";

    //是否显示状态栏
    public static final String IS_SHOW_NOTIFICATION = "is_show_notification";

//    /**
//     * Get SharedPreferences
//     */
//    private static SharedPreferences getSharedPreferences(Context context) {
//        return context.getSharedPreferences(APP_SHARD, Context.MODE_PRIVATE);
//    }

    public static void configPath(Context context) {
        SdSpUtil.configXmlPath(context.getPackageName());
    }

    public static void setLastSensorStep(Context context, float lastSensorStep) {
        Logger.e(TAG, "setLastSensorStep");
        SdSpUtil.saveData(context, LAST_SENSOR_TIME, lastSensorStep);
        //getSharedPreferences(context).edit().putFloat(LAST_SENSOR_TIME, lastSensorStep).commit();
    }

    public static float getLastSensorStep(Context context) {
        Logger.e(TAG, "getLastSensorStep");
        //return getSharedPreferences(context).getFloat(LAST_SENSOR_TIME, 0.0f);
        return (float) SdSpUtil.getData(context, LAST_SENSOR_TIME, 0.0f);
    }

    public static void setStepOffset(Context context, float stepOffset) {
        Logger.e(TAG, "setStepOffset");
        //getSharedPreferences(context).edit().putFloat(STEP_OFFSET, stepOffset).commit();
        SdSpUtil.saveData(context, STEP_OFFSET, stepOffset);
    }

    public static float getStepOffset(Context context) {
        Logger.e(TAG, "getStepOffset");
        //return getSharedPreferences(context).getFloat(STEP_OFFSET, 0.0f);
        return (float) SdSpUtil.getData(context, STEP_OFFSET, 0.0f);
    }

    public static void setStepToday(Context context, String stepToday) {
        Logger.e(TAG, "setStepToday");
        //getSharedPreferences(context).edit().putString(STEP_TODAY, stepToday).commit();
        SdSpUtil.saveData(context, STEP_TODAY, stepToday);
    }

    public static String getStepToday(Context context) {
        Logger.e(TAG, "getStepToday");
        //return getSharedPreferences(context).getString(STEP_TODAY, "");
        return (String) SdSpUtil.getData(context, STEP_TODAY, "");
    }

    /**
     * true清除步数从0开始，false否
     *
     * @param context
     * @param cleanStep
     */
    public static void setCleanStep(Context context, boolean cleanStep) {
        Logger.e(TAG, "setCleanStep:cleanStep:" + cleanStep);
        //getSharedPreferences(context).edit().putBoolean(CLEAN_STEP, cleanStep).commit();
        SdSpUtil.saveData(context, CLEAN_STEP, cleanStep);
    }

    /**
     * true 清除步数，false否
     *
     * @param context
     * @return
     */
    public static boolean getCleanStep(Context context) {
        Logger.e(TAG, "getCleanStep");
        //return getSharedPreferences(context).getBoolean(CLEAN_STEP, true);
        //return getSharedPreferences(context).getBoolean(CLEAN_STEP, false);
        return (boolean) SdSpUtil.getData(context, CLEAN_STEP, "");
    }

    public static void setCurrentStep(Context context, float currStep) {
        Logger.e(TAG, "setCurrentStep");
        //getSharedPreferences(context).edit().putFloat(CURR_STEP, currStep).commit();
        SdSpUtil.saveData(context, CURR_STEP, currStep);
    }

    public static float getCurrentStep(Context context) {
        Logger.e(TAG, "getCurrentStep");
        //return getSharedPreferences(context).getFloat(CURR_STEP, 0.0f);
        return (float) SdSpUtil.getData(context, CURR_STEP, 0.0f);
    }

    public static void setShutdown(Context context, boolean shutdown) {
        Logger.e(TAG, "setShutdown");
        //getSharedPreferences(context).edit().putBoolean(SHUTDOWN, shutdown).commit();
        SdSpUtil.saveData(context, SHUTDOWN, shutdown);
    }

    public static boolean getShutdown(Context context) {
        Logger.e(TAG, "getShutdown");
        //return getSharedPreferences(context).getBoolean(SHUTDOWN, false);
        return (boolean) SdSpUtil.getData(context, SHUTDOWN, false);
    }

    public static void setElapsedRealtime(Context context, long elapsedRealtime) {
        Logger.e(TAG, "setElapsedRealtime");
        //getSharedPreferences(context).edit().putLong(ELAPSED_REALTIMEl, elapsedRealtime).commit();
        SdSpUtil.saveData(context, ELAPSED_REALTIMEl, elapsedRealtime);
    }

    public static long getElapsedRealtime(Context context) {
        Logger.e(TAG, "getElapsedRealtime");
        //return getSharedPreferences(context).getLong(ELAPSED_REALTIMEl, 0L);
        return (long) SdSpUtil.getData(context, ELAPSED_REALTIMEl, 0L);
    }

    public static void setShowNotification(Context context, boolean show) {
        Logger.e(TAG, "setShowNotification");
        //getSharedPreferences(context).edit().putBoolean(IS_SHOW_NOTIFICATION, show).commit();
        SdSpUtil.saveData(context, IS_SHOW_NOTIFICATION, show);
    }

    public static boolean iSShowNotification(Context context) {
        Logger.e(TAG, "iSShowNotification");
        //return getSharedPreferences(context).getBoolean(IS_SHOW_NOTIFICATION, false);
        return (boolean) SdSpUtil.getData(context, IS_SHOW_NOTIFICATION, false);
    }

}
