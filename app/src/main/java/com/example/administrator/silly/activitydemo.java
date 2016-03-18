package com.example.administrator.silly;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/11 0011.
 */
public class activitydemo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
//        Log.i(TGA,"MainActivity-->onCreate");
    }
}
