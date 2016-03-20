package com.example.administrator.silly;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

public class StackView extends Activity {
    private  int[] data= new int[100];
    int hasData = 0;
    int status = 0;
    ProgressBar bar1,bar2;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            if(msg.what == 0x111){
                bar1.setProgress(status);
                bar2.setProgress(status);
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_view);
        bar1 = (ProgressBar) findViewById(R.id.progressBar4);
        bar2 = (ProgressBar) findViewById(R.id.progressBar5);
        new Thread() {
            public void run() {
                while (status < 100) {
                    status = doWork();
                    handler.sendEmptyMessage(0x111);
                }
            }
        }.start();
    }
    @TargetApi(Build.VERSION_CODES.KITKAT)
    private int doWork() {
        data[hasData++] = (int)(Math.random()*100);
        return hasData;
    }
}
