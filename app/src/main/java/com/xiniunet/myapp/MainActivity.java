package com.xiniunet.myapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.xiniunet.myapp.module.base.BaseActivity;
import com.xiniunet.myapp.utils.MyUtils;
import com.xiniunet.myapp.utils.UIUtil;
import com.xiniunet.myapp.widget.CircleImage;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Bind(R.id.image)
    ImageView image;
    @Bind(R.id.iv)
    CircleImage iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

      /*  UIUtil.showWaitDialog(this);
        UIUtil.dismissDlg();*/

        //网络加载图片
        //     MyUtils.loadImage("https://github.com/nostra13/Android-Universal-Image-Loader/raw/master/UniversalImageLoader.png", image);
        //    MyUtils.loadImage("https://github.com/nostra13/Android-Universal-Image-Loader/raw/master/UniversalImageLoader.png", iv);

        //网络加载图片
        String url = "https://images.unsplash.com/photo-1445251836269-d158eaa028a6?fit=crop&fm=jpg&h=625&ixlib=rb-0.3.5&q=80&w=1375";
        MyUtils.loadImage(url, this, image);
        MyUtils.loadImage(url, this, iv);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
