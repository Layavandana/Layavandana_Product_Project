package com.example.company;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView=findViewById(R.id.recyclerView);
        s1=getResources().getStringArray(R.array.programming_languages);
        //s2=getResources().getStringArray(R.array.description);

        MyAdapter myAdaptor=new MyAdapter(this,s1);
        recyclerView.setAdapter(myAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
