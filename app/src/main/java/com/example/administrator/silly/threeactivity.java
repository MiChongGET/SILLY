package com.example.administrator.silly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class threeactivity extends AppCompatActivity {
   private Button button;
    private  String content = "HELLO";
    private QuickContactBadge quickContactBadge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeactivity);
       button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data= new Intent();
                data.putExtra("data",content);
                setResult(2,data);
                finish();
            }
        });
        quickContactBadge = (QuickContactBadge) findViewById(R.id.quickContactBadge);
        quickContactBadge.assignContactFromPhone(" 10086",false);
    }
}
