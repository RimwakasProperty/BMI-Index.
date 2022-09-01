package com.example.impli;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Input_1, Input_2,Input_4, Input_5, Input_6,Input_7, Output;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Input_1 = findViewById(R.id.input1);
        Input_2 = findViewById(R.id.input2);
        Input_4 = findViewById(R.id.input3);
        Input_5 = findViewById(R.id.input);
        Input_6 = findViewById(R.id.input5);
        Input_7 = findViewById(R.id.input6);
        Output = findViewById(R.id.input4);
        Intent intent = getIntent();
        String first, second, third;
        float fourth, fifth, BMI;
        first = intent.getStringExtra("key1");
        second = intent.getStringExtra("key2");
        third = intent.getStringExtra("key3");
        fourth = intent.getFloatExtra("key4", 0);
        fifth = intent.getFloatExtra("key5", 0);
        BMI = intent.getFloatExtra("key6", 0);
        // Using loops to distinguish the different BMI indexes and ranges.

        if (BMI < 18.5) {
            String b = "You're Underweight";
            Input_7.setText(b);
        }
        else if ( (BMI) >=18.5 && (BMI) <= 24.9 ) {
            String b = "You're Healthy";
            Input_7.setText(b);
        }
        else if ( (BMI) >=25 && (BMI) <= 29.9 ) {
            String b = "You're Overweight";
            Input_7.setText(b);
        }
        else {
            String b = "You're Obese";
            Input_7.setText(b);
        }
        Input_1.setText(first);
        Input_2.setText(second);
        Output.setText(third);
        Input_4.setText(Float.toString(fourth));
        Input_5.setText(Float.toString(fifth));
        Input_6.setText(Float.toString(BMI));
        }
}
