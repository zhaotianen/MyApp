package com.xiniunet.myapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.xiniunet.myapp.R;

/**
 * <p/>
 * <pre>
 * ***************************************************************
 *  Copyright (c) 2014-2015 –苏州犀牛网络科技有限公司
 *  Package: com.xiniunet.myapp.utils
 *  Description:自定义工具类
 *  @since 1.0.0
 *  @author 赵天恩
 *  @date 2015/11/3
 *  @time 13:03
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
public class MyUtils {

    /**
     * 使用universal-image-loder框架来加载图片
     * <p/>
     * 加载路径:
     * "http://site.com/image.png" // from Web
     * "file:///mnt/sdcard/image.png" // from SD card
     * "file:///mnt/sdcard/video.mp4" // from SD card (video thumbnail)
     * "content://media/external/images/media/13" // from content provider
     * "content://media/external/video/media/13" // from content provider (video thumbnail)
     * "assets://image.png" // from assets
     * "drawable://" + R.drawable.img // from drawables (non-9patch images)
     *
     * @param url
     * @param imageView
     */
    public static void loadImage(final String url, final ImageView imageView) {
        final ImageLoader imageLoader = ImageLoader.getInstance(); // Get singleton instance
        final Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                if (msg.what == 1) {
                    imageLoader.displayImage(url, imageView);
                } else {
                    //设置本地默认图片
                    imageLoader.displayImage("drawable://" + R.mipmap.ic_launcher, imageView);
                }
            }
        };
        new Thread() {
            public void run() {
                Message msg = new Message();
                if ("".equals(url) || url.length() < 1) {
                    msg.what = 0;
                } else {
                    msg.what = 1;
                }
                handler.sendMessage(msg);
            }
        }.start();

    }

    /**
     * 使用Volley加载、缓存图片
     * 参见：http://www.jianshu.com/p/d9072d3d00be
     * @param url
     * @param context
     * @param imageView
     */
    public static void loadImage(String url, Context context, final ImageView imageView) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        //构建ImageRequest 实例
        ImageRequest request = new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                //给imageView设置图片
                imageView.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.RGB_565, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //设置一张错误的图片，临时用ic_launcher代替
                imageView.setImageResource(R.mipmap.ic_launcher);
            }
        });

        requestQueue.add(request);
    }
}
