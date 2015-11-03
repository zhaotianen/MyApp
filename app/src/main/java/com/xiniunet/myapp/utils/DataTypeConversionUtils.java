package com.xiniunet.myapp.utils;

/**
 * <p/>
 * <pre>
 * ***************************************************************
 *  Copyright (c) 2014-2015 –苏州犀牛网络科技有限公司
 *  Package: com.showcal.support.utils
 *  Description:数据类型转化
 *  @since 1.0.0
 *  @author 赵天恩
 *  @date 2015/9/25
 *  @time 11:53
 * ***************************************************************
 * </pre>
 */
public class DataTypeConversionUtils {

    /**
     * String转int
     *
     * @param string
     * @return
     */
    public static int stringToInt(String string) {
        String str = string.substring(0, string.indexOf(".")) + string.substring(string.indexOf(".") + 1);
        int intgeo = Integer.parseInt(str);
        return intgeo;
    }

    /**
     * String转Double
     *
     * @param string
     * @return
     */
    public static Double stringToDouble(String string) {
        return Double.valueOf(string);
    }


    /**
     * Double转string
     *
     * @param d
     * @return
     */
    public static String double2String(Double d) {
        String data = "";
        if (d == null || d.equals("null")) {
            data = "";
        } else {
            data = String.valueOf(d.doubleValue());
        }
        return data;
    }

    /**
     * String判断是否为空
     *
     * @param str
     * @return
     */
    public static String isNull(String str) {
        String data = "";
        if (str.length() < 1 || "".equals(str) || str == null || "null".equals(str)) {
            data = "-";
        } else {
            data = str;
        }
        return data;

    }
}
