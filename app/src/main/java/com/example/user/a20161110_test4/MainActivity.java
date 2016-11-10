package com.example.user.a20161110_test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] fruits = {"蘋果", "鳳梨", "芭樂", "香蕉"};
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);

        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,fruits);
        lv.setAdapter(adapter);
    }
}
