package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    //declare buttons
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    //declare operands
    private Button btnAdd,btnMinus,btnMultiply,btnDivide,btnSqrt,btnSqare,btnOver,btnEquals;

    //declare View
    private TextView txtResult;



    //Function variables
    private double globalResult=0;
    private String function="empty";

    Calculations c = new Calculations(globalResult,function);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //instantiate buttons
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);

        //instantiate operands
        btnAdd=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMultiply=findViewById(R.id.btn_multiply);
        btnDivide=findViewById(R.id.btn_divide);
        btnSqrt=findViewById(R.id.btn_sqrt);
        btnSqare=findViewById(R.id.btn_square);
        btnEquals=findViewById(R.id.btn_equals);
        btnOver=findViewById(R.id.btn_1overX);

        txtResult=findViewById(R.id.View);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText(Double.toString(c.Calc(1.0)));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(2.0)));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(3.0)));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(4.0)));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(5.0)));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(6.0)));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(7.0)));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(8.0)));
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(9.0)));
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(Double.toString(c.Calc(0.0)));
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Add");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Minus");
                txtResult.setText(txtResult.getText()+"-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Multiply");
                txtResult.setText("X");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Divide");
                txtResult.setText("÷");
            }
        });

        btnOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.setFunction("Over");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText(Double.toString(c.globalResult));
            }
        });



    }

    @Override
    public void onClick(View view) {

    }
}