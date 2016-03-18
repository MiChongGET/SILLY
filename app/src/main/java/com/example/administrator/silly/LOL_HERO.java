package com.example.administrator.silly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LOL_HERO extends AppCompatActivity {
    private String[] names = new String[]{
      "诺克萨斯之手","22","33","44","555","666"
    };
    private  String[] content = new String[]{
      "大杀四方是一个强力骚扰技。在最大距离处直接打击敌人；出血叠加越多，大招伤害越高；德莱厄斯非常需要续航生存能力，他战斗时间越长越厉害。",
            "123","123","123","123","123"
    };
    private  int[] imgIDs= new int[]{
            R.drawable.nuoshou,
            R.drawable.icon1,
            R.drawable.icon2,
            R.drawable.icon3,
            R.drawable.icon4,
            R.drawable.icon5
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lol__hero);
        List<Map<String,Object>> listItems  = new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> listItem = new HashMap<String, Object>();
            listItem.put("header",imgIDs[i]);
            listItem.put("name",names[i]);
            listItem.put("content",content[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter =  new SimpleAdapter(this,listItems,R.layout.simple_item,new String[]{"name","header","content"},new int[]{R.id.name,R.id.header,R.id.content});
        ListView listView = (ListView) findViewById(R.id.lol_list);
        listView.setAdapter(simpleAdapter);

    }
    }

