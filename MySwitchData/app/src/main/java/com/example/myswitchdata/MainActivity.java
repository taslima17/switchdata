package com.example.myswitchdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText hometown;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

name =(EditText) findViewById(R.id.name);
        email =(EditText) findViewById(R.id.email);
        hometown =(EditText) findViewById(R.id.hometown);
        send =(Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataname = name.getText().toString();

                String dataemail = email.getText().toString();
                String datahome = hometown.getText().toString();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Name: ",dataname);
                intent.putExtra("Email:",dataemail);
                intent.putExtra("HomeTown: ",datahome);

                startActivity(intent);



            }

        });
    }


}
