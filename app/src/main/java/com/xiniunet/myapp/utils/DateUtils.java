package com.xiniunet.myapp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p/>
 * <pre>
 * ***************************************************************
 *  Copyright (c) 2014-2015 –苏州犀牛网络科技有限公司
 *  Package: com.showcal.support.utils
 *  Description:日期转换工具类
 *  @since 1.0.0
 *  @author 赵天恩
 *  @date 2015/10/14
 *  @time 13:27
 * ***************************************************************
 * </pre>
 */
public class DateUtils {
    /**
     * 输出“yyyy-MM-dd HH:mm:ss”格式的日期
     *
     * @return
     */
    public static String getYMDHMS() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }


    /**
     * 输出“yyyy-MM-dd”格式的日期
     *
     * @return
     */
    public static String getYMD() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }


    /**
     * 输出“HH:mm”格式的日期
     *
     * @return
     */
    public static String getHM() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }

    /**
     * 计算两个日期相差天数
     *
     * @param strDate
     * @return
     */
    public static int getDays(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Date dateDate = null;
        try {
            dateDate = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long l = now.getTime() - dateDate.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);

        return new Long(day).intValue();
    }

    /**
     * 获取两个日期相差年数
     *
     * @param strDate
     * @return
     */
    public static int getYears(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        Date dateDate = null;
        try {
            dateDate = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long l = now.getYear() - dateDate.getYear();
        return (int) l;
    }


    /**
     * 将string类型的日期转成date型
     *
     * @param data
     * @return
     */
    public static Date getDate(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 比较日期
     *
     * @param DATE1
     * @return
     */
    public static int compare_date(String DATE1) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = new Date();
            if (dt1.getTime() > dt2.getTime()) {
                System.out.println("dt1 在dt2前");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("dt1在dt2后");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

}
