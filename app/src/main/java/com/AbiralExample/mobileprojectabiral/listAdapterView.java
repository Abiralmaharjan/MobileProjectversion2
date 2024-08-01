package com.AbiralExample.mobileprojectabiral;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class listAdapterView extends AppCompatActivity {
    ListView listView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewlistview);
        ListView listView = findViewById(R.id.listview);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        customAdapter adapter = new customAdapter(this, dataList);
        listView.setAdapter(adapter);
    }
}
