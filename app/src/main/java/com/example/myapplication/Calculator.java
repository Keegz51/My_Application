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
    private TextView txtResult, txtCalcs;



    //Function variables
    private String globalResult="";
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
        txtCalcs=findViewById(R.id.Calcs);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText((c.Calc("1")));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("2"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("3"));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("4"));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("5"));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("6"));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("7"));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("8"));
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("9"));
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText(c.Calc("0"));
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Add");
                txtCalcs.setText(c.globalResult+" " +c.getFunction());
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Minus");
                txtCalcs.setText(c.globalResult+" " +c.getFunction());
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Multiply");
                txtCalcs.setText(c.globalResult+" " +c.getFunction());
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c.setFunction("Divide");
                txtCalcs.setText(c.globalResult+" " +c.getFunction());
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

                txtResult.setText((c.globalResult));
            }
        });



    }

    @Override
    public void onClick(View view) {

    }
}