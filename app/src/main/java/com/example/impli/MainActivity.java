package com.example.impli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Input_1, Input_2,Input_4, Input_5, Input_6;
    Button button;
    Float hh, ww, BMI;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input_1 = findViewById(R.id.Input_1);
        Input_2 = findViewById(R.id.Input_2);
        Input_4 = findViewById(R.id.Input_4);
        Input_5 = findViewById(R.id.input_5);
        Input_6 = findViewById(R.id.input_6);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = Input_1.getText().toString();
                String uu = Input_2.getText().toString();
                String nn = Input_4.getText().toString();
                String mm = Input_5.getText().toString();
                hh = Float.valueOf(mm);
                String kg = Input_6.getText().toString();
                ww = Float.valueOf(kg);
                BMI = ww/ (hh*hh);
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("key1", ss);
                intent.putExtra("key2", uu);
                intent.putExtra("key3", nn);
                intent.putExtra("key4", hh);
                intent.putExtra("key5", ww);
                intent.putExtra("key6", BMI);
                startActivity(intent);
            }
        });
    }
}