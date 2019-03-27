package com.cjl.source;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

/**
 * bug类
 * @author chenjieliang
 */
public class ParamsSort {

    public void math(Activity activity) {
        int a = 10;
        int b = 1;
        Toast.makeText(activity,"ParamsSort >>> " + (a/b),Toast.LENGTH_SHORT).show();
    }

    public void math() {
        int a = 10;
        int b = 1;
        Log.i("test","ParamsSort >>> " + (a/b));
    }
}
