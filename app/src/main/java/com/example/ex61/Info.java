package com.example.ex61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle infoP = getIntent().getExtras();
        int i = infoP.getInt("President",0);
        ((TextView)findViewById(R.id.textView))
                .setText(PresidentList.getInstance().getPresident(i).getName());
        ((TextView)findViewById(R.id.textView2))
                .setText(PresidentList.getInstance().getPresident(i).getDes());
        ((TextView)findViewById(R.id.textView3))
                .setText(PresidentList.getInstance().getPresident(i).getdayS());
        ((TextView)findViewById(R.id.textView4))
                .setText(PresidentList.getInstance().getPresident(i).getdayE());

    }
}
