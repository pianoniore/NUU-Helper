package com.dogbone0714.nuuhelper.utils;


import com.dogbone0714.nuuhelper.Application;

/**
 * Created by longer on 2016/7/29.
 */
public class Toast {
    public static void show(CharSequence msg) {
        android.widget.Toast.makeText(Application.getINSTANCE(), msg, android.widget.Toast.LENGTH_SHORT).show();
    }

    public static void show(int stringId) {
        android.widget.Toast.makeText(Application.getINSTANCE(), stringId, android.widget.Toast.LENGTH_LONG).show();
    }

}
