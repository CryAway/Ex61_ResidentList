package com.example.ex61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.presidentsListView);
        PresidentList.getInstance().add();
        lv.setAdapter(new ArrayAdapter<President>(
                this,  //context (activity instance)
                android.R.layout.simple_list_item_1, //XML item layout
                PresidentList.getInstance().getPresidentList()) //array of data
        );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(MainActivity.this, Info.class);
                nextActivity.putExtra("President", i);
                startActivity(nextActivity);

            }
        });


    }

}
