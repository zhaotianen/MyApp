package com.xiniunet.myapp.module.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.xiniunet.myapp.utils.ActivityManagerUtils;

import butterknife.ButterKnife;

/**
 * <p/>
 * <pre>
 * ***************************************************************
 *  Copyright (c) 2014-2015 –苏州犀牛网络科技有限公司
 *  Package: com.xiniunet.myapp.module.base
 *  Description:
 *  @since 1.0.0
 *  @author 赵天恩
 *  @date 2015/11/3
 *  @time 10:20
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
public class BaseActivity extends Activity {
    private Context context;

    public BaseActivity() {
        ActivityManagerUtils.addActivity(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        initView();
        initData();
    }

    /**
     * 初始化视图
     */
    public void initView() {
        ButterKnife.bind(this);
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

}
