package com.example.input;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handleText(View v){

        TextView t = findViewById(R.id.source); // Get the input object
        String input = t.getText().toString(); // Save user  input as String
        ((TextView) findViewById(R.id.output)).setText(input); //Print user Input

        //Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }
}