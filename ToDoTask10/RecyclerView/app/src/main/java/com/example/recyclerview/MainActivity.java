package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<Friends>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAdapterList();
    }

    private void setAdapterList() {
        Friends f0= new Friends("Abu Bakar (R.A)","1");
        Friends f1= new Friends("Umar Farooq (R.A)","2");
        Friends f2= new Friends("Uthman (R.A)","3");
        Friends f3= new Friends("Ali (R.A)","4");
        Friends f4= new Friends("Talha (R.A","5");
        Friends f5= new Friends("Zubair ibn-e-Awam (R.A)","6");
        Friends f6= new Friends("Abu Obaidaibn-al-Jarah (R.A)","7");
        Friends f7= new Friends("Abdul Rehmanibn-e-Auf (R.A)","8");
        Friends f8= new Friends("Saad ibn-e-Abi Waqas (R.A)","9");
        Friends f9= new Friends("Saeed ibn-e-Zaid (R.A)","10");
        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9}));

        recyclerView= findViewById(R.id.friendsList);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this) {};
        recyclerView.setAdapter(adapter);
    }
}