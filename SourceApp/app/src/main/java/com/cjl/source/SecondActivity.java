package com.cjl.source;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import java.io.File;
import java.io.InputStream;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void show(View view) {
        ParamsSort paramsSort = new ParamsSort();
        paramsSort.math(this);
    }

}
