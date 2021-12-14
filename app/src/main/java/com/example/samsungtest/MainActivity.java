package com.example.samsungtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.Button11);
        Button btn1 = (Button) findViewById(R.id.Button01);
        Button btn2 = (Button) findViewById(R.id.Button02);
        Button btn3 = (Button) findViewById(R.id.Button03);
        Button btn4 = (Button) findViewById(R.id.Button04);
        Button btn5 = (Button) findViewById(R.id.Button05);
        Button btn6 = (Button) findViewById(R.id.Button06);
        Button btn7 = (Button) findViewById(R.id.Button07);
        Button btn8 = (Button) findViewById(R.id.Button08);
        Button btn9 = (Button) findViewById(R.id.Button09);

        Button btnPlus = (Button) findViewById(R.id.ButtonPlus);
        Button btnMinus = (Button) findViewById(R.id.ButtonMinus);
        Button btnDivision = (Button) findViewById(R.id.ButtonDivide);
        Button btnMultiply = (Button) findViewById(R.id.ButtonMul);
        Button btnEqual = (Button) findViewById(R.id.Button12);


    }
}