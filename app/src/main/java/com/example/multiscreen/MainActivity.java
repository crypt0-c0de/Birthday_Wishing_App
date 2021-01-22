package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Making a KEY of name MSG
    public static final String  MSG = "com.example.multiscreen.MSG";

    public void orderNow(View view){

        //Creating Intent to move to Another Activity
        Intent intent = new Intent(this, BirthdayGreetActivity.class);

        // Storing the value of edit text in variable
        EditText editText1 = findViewById(R.id.editText1);

        //Storing the text values in intent
        String message = editText1.getText().toString();

        //Passing Value of message using intent
        intent.putExtra(MSG, message);

        //Starting the Activity
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}