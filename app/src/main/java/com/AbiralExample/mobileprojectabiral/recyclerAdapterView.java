package com.AbiralExample.mobileprojectabiral;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class recyclerAdapterView extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> dataList;
    myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewrecyclerview);

        recyclerView = findViewById(R.id.recyclerViewItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Retrieve the dataList from the intent
        dataList = getIntent().getStringArrayListExtra("dataList");

        // Create an adapter and set it to the RecyclerView
        adapter = new myAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
