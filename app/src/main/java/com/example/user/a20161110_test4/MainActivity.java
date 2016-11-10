package com.example.user.a20161110_test4;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"蘋果", "鳳梨", "芭樂", "香蕉"};
    String[] cities = {"台北", "台中", "台南", "高雄"};
    String[] codes = {"02", "04", "06", "07"};
    ArrayList<Map<String, String>> mylist;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);

        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
        //                     android.R.layout.simple_list_item_1, fruits);
        mylist = new ArrayList<>();
        for (int i=0;i<cities.length;i++)
        {
            Map m = new HashMap();
            m.put("city", cities[i]);
            m.put("code", codes[i]);
            mylist.add(m);
        }

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                mylist, R.layout.myitem,
                new String[] {"city", "code"},
                new int[] {R.id.textView, R.id.textView2});

        lv.setAdapter(adapter);
    }
}
