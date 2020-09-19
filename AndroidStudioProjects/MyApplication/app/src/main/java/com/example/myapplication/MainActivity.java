package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.editTextTextPersonName3);
        final EditText y = findViewById(R.id.editTextTextPersonName2);
        Button add  = findViewById(R.id.button);
        final Button mutliply = findViewById(R.id.button2);
        final Button divide = findViewById(R.id.button4);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer.parseInt(x.getText().toString());
                Integer.parseInt(y.getText().toString());

                int n1 = Integer.parseInt(x.getText().toString());
                int n2 = Integer.parseInt(y.getText().toString());
                int sum = n1 + n2;
                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
            }
            });



        mutliply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer.parseInt(x.getText().toString());
                Integer.parseInt(y.getText().toString());
                int n3 = Integer.parseInt(x.getText().toString());
                int n4 = Integer.parseInt(y.getText().toString());
                int multiply = n3 * n4;
                Toast.makeText(MainActivity.this, multiply + "", Toast.LENGTH_SHORT).show();

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer.parseInt(x.getText().toString());
                Integer.parseInt(y.getText().toString());
                int n5 = Integer.parseInt(x.getText().toString());
                int n6 =  Integer.parseInt(y.getText().toString());
                int divide = n5/n6;
                Toast.makeText(MainActivity.this, divide+"", Toast.LENGTH_SHORT).show();

            }
        });











    }
}