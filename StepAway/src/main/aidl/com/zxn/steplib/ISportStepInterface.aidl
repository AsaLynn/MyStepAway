// ISportStepInterface.aidl
package com.zxn.steplib;

// Declare any non-default types here with import statements

interface ISportStepInterface {

    /**
     * 获取当前时间运动步数
     */
     int getCurrentTimeSportStep();

    /**
     *更新当前时间运动步数
     */
      void setCurrentTimeSportStep(int stepNum);

     /**
      * 获取所有步数列表，json格式，如果数据过多建议在线程中获取，否则会阻塞UI线程
      */
     String getTodaySportStepArray();

    /**
     * 根据时间获取步数列表
     *
     * @param dateString 格式yyyy-MM-dd
     * @return
     */
     String getTodaySportStepArrayByDate(String date);

     /**
      * 根据时间和天数获取步数列表
      * 例如：
      * startDate = 2018-01-15
      * days = 3
      * 获取 2018-01-15、2018-01-16、2018-01-17三天的步数
      *
      * @param startDate 格式yyyy-MM-dd
      * @param days
      * @return
      */
      String getTodaySportStepArrayByStartDateAndDays(String date, int days);

     /**
      * 根据时间和天数获取步数列表
      * 例如：
      * endDate = 2018-01-15
      * days = 3
      * 获取 2018-01-15、2018-01-14、2018-01-13三天的步数
      *
      * @param endDate 格式yyyy-MM-dd
      * @param days
      * @return
      */
      String getTodaySportStepArrayByEndDateAndDays(String date, int days);
      /**
      *
      * 获取当前时间运动的卡路里
      */
      String getCurrentCalorie();

       /**
       * 获取当前时间运动的距离
        */
       String getCurrentDistance();
}
