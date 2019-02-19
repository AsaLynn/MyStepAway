package com.zxn.steplib;

import java.util.List;

/**
 * Created by zxn on 2019/1/28.
 */
interface ITodayStepDBHelper {

    void createTable();

    void deleteTable();

    void clearCapacity(String curDate, int limit);

    boolean isExist(TodayStepData todayStepData);

    void insert(TodayStepData todayStepData);

    List<TodayStepData> getQueryAll();

    List<TodayStepData> getStepListByDate(String dateString);

    List<TodayStepData> getStepListByStartDateAndDays(String startDate, int days);

    /**
     * 获取指定日期endDate之前的days天的步数
     * @param endDate
     * @param days
     * @return
     */
    List<TodayStepData> getStepListByEndDateAndDays(String endDate, int days);
}
