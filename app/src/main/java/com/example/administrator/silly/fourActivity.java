package com.example.administrator.silly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        ListView listView1= (ListView) findViewById(R.id.list1);
        String[] arr1={"孙悟空","猪八戒","唐僧","沙和尚"};
        ArrayAdapter<String> adapter1= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arr1);
        listView1.setAdapter(adapter1 );
        ListView listView2= (ListView) findViewById(R.id.list2);
        String[] arr2={"1","2","3","4","1","2","3","4"};
        ArrayAdapter<String> adapter2= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arr2);
        listView2.setAdapter(adapter2 );
    }
}
