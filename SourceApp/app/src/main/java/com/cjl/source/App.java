package com.cjl.source;

import android.app.Application;
import android.util.Log;

/**
 * @author chenjieliang
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("demo","source app application oncreate");
    }

}
