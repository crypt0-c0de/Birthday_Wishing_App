package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greet);

        // Getting Intent
        Intent intent = getIntent();

        //Storing the value of String from another activity using intent and KEY = MSG
        String name = intent.getStringExtra(MainActivity.MSG);

        //finding the textView using its ID which needs to be changed
        TextView textView = findViewById(R.id.textView3);

        //Setting the TextView
        textView.setText(name);



    }
}