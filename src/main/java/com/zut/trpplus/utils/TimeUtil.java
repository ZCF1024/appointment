package com.zut.trpplus.utils;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeUtil {

    /**
     * 获取下一个办理日期
     *
     * @param week 星期几办理
     * @return yyyy-mm-dd格式的日期
     */
    public static String getNextDate(Integer week) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);   //设置当前日期
        c.add(Calendar.DATE, 1); //日期+1
        while ((c.get(Calendar.DAY_OF_WEEK) - 1) != week) {
            c.add(Calendar.DATE, 1); //日期+1
        }
        date = c.getTime();
        return sdf.format(date);
    }

    /**
     * @param type 时间类型
     *             如：yyyy-mm-dd HH:mm:ss
     * @return 格式化后的当前时间
     */
    public static String getTime(String type) {
        SimpleDateFormat df = new SimpleDateFormat(type);// 设置日期格式
        return df.format(new Date());
    }

    /**
     * 日期加上或减去多少天
     *
     * @param date 原日期
     * @param num  +n/-n
     * @return 新的日期
     */
    public static String addDateDay(String date, int num) {
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        try {
            calendar.setTime(f.parse(date));
//          calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
//          calendar.add(calendar.DAY_OF_MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
            calendar.add(calendar.DATE, num);//把日期往后增加一天.整数往后推,负数往前移动
//        calendar.add(calendar.WEEK_OF_MONTH, 1);//把日期往后增加一个月.整数往后推,负数往前移动
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return f.format(calendar.getTime());
    }

    /**
     * 返回10位时间戳
     *
     * @return
     */
    public static String getTimeStamp() {
        return String.valueOf(new Date().getTime() / 1000);
    }

    public static void main(String[] args) {
        System.out.println(addDateDay("2018-03-25", 7));

    }

}
