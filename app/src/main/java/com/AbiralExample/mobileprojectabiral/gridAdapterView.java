package com.AbiralExample.mobileprojectabiral;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class gridAdapterView extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewgridview);

        GridView gridView = findViewById(R.id.gridView);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        customAdapter adapter = new customAdapter(this, dataList);
        gridView.setAdapter(adapter);

    }
}
