package com.lizhidu.appdesign.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yz on 2015/7/2.
 */
public class ToastUtils {


//    public static void showLong(String msg){
//       makeTextLong(context,msg);
//    }
    public static void makeTextLong(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void makeTextShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
