package com.xiniunet.myapp.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

import com.xiniunet.myapp.R;


public class CustomProgressDialog extends Dialog {

    private static CustomProgressDialog cdlg;

    /**
     * @param aty
     */
    public CustomProgressDialog(Activity aty) {
        super(aty, R.style.commonDialog);
        setOwnerActivity(aty);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CircleLoadingView view = new CircleLoadingView(getContext(), null);
        setContentView(view);
        view.startLoading();
        setCanceledOnTouchOutside(false);
    }

    public static void show(Activity aty) {
        try {
            hidden();
            if (aty != null && !aty.isFinishing()) {
                cdlg = new CustomProgressDialog(aty);
                cdlg.show();
            }
        } catch (Exception e) {
        }
    }

    public static void hidden() {
        try {
            if (cdlg != null) {
                cdlg.dismiss();
            }
            cdlg = null;
        } catch (Exception e) {
        }
    }
}