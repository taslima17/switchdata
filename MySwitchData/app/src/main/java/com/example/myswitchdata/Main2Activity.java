package com.example.myswitchdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name;
    TextView email;
    TextView hometown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = (TextView)findViewById(R.id.sname);
        email = (TextView)findViewById(R.id.semail);
        hometown = (TextView)findViewById(R.id.stown);
        name.setText(getIntent().getStringExtra("name"));
        name.setText(getIntent().getStringExtra("email"));
        name.setText(getIntent().getStringExtra("hometown"));
    }
}
