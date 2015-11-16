package com.xiniunet.myapp.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * <pre>
 * ***************************************************************
 *  Copyright (c) 2014-2015 –苏州犀牛网络科技有限公司
 *  Package: com.xiniunet.myapp.utils
 *  Description:Activity管理类
 *  @since 1.0.0
 *  @author 赵天恩
 *  @date 2015/11/16
 *  @time 11:01
 * ***************************************************************
 * </pre>
 * <p/>
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 */
public class ActivityManagerUtils {
    public static List<Activity> activityList = new ArrayList<Activity>();

    /**
     * 添加activity
     *
     * @param activity
     */
    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    /**
     * 获取activityList
     *
     * @return
     */
    public static List<Activity> getActivityList() {
        if (activityList.size() > 0) {
            return activityList;
        }
        return null;

    }

    /**
     * 移除activity
     */
    public static void killAllActivity() {
        if (activityList.size() > 0) {
            for (Activity activity : activityList) {
                activity.finish();
            }
        }

    }
}
