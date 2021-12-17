package com.example.samsungtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private TextView tex1;  // пользовательский элемент 1-го display
    private TextView tex2;  // пользовательский элемент 2-го display

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
        Button btnС = (Button) findViewById(R.id.ButtonC);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt1);
                txt1.setText("9");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt2);
                txt1.setText("+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt1;
                txt1 = (TextView) findViewById(R.id.txt2);
                txt1.setText("-");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt2;
                txt2 = (TextView) findViewById(R.id.txt2);
                txt2.setText("/");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt2;
                txt2 = (TextView) findViewById(R.id.txt2);
                txt2.setText("*");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt2;
                txt2 = (TextView) findViewById(R.id.txt2);
                txt2.setText("=");
            }
        });
        btnС.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView txt2;
                txt2 = (TextView) findViewById(R.id.txt2);
                txt2.setText("С");
            }
        });
    }

}