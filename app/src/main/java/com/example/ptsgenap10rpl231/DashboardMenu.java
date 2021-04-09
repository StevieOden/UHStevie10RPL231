package com.example.ptsgenap10rpl231;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DashboardMenu extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.ic_baseline_account_circle_24};

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_menu);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.user_name);
        s2 = getResources().getStringArray(R.array.phone_number);

        MyAdapter myAdapter = new MyAdapter(this , s1 , s2 ,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
