package com.vivekahealth.tutorials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TestAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateNoticeList();
    }

    /**
     * Method to generate List of notice using RecyclerView with custom adapter
     */
    private void generateNoticeList() {
        recyclerView = findViewById(R.id.my_recycler_view);
        ArrayList<TestModel> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            TestModel model = new TestModel();
            model.isFlipped = false;
            list.add(model);
        }
        adapter = new TestAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
