package com.zut.trpplus.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间
 * @Author xiumu
 * @Date 2018/10/28 16:01
 */
public class DateUtil {
    /**
     * 将当前时间转换为String字符串
     * @return yyyy年MM月dd日 HH:mm:ss
     */
    public static String DateToString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String  date = dateFormat.format(new Date());
        return date;
    }
}
