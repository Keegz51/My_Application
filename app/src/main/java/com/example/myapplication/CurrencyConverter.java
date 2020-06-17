package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CurrencyConverter extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvert;
    private EditText edtDollar;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        btnConvert = findViewById(R.id.btn_convert);
        edtDollar = findViewById(R.id.edt_dollar);
        txtResult = findViewById(R.id.txt_result);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(edtDollar.getText().toString().length()>0) {
            double dollar = Double.parseDouble(edtDollar.getText().toString());
            double convertedRand = dollar * 17.23;
            txtResult.setText((convertedRand) + "");
        }
        else
        {
            Toast.makeText(this,"Enter a Value",Toast.LENGTH_SHORT).show();
        }
    }
}