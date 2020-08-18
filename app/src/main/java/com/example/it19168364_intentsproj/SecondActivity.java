package com.example.it19168364_intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button Addbtn, Subsbtn, Dividebtn, Multiplybtn;
    TextView txtResult;
    String txtNum1Val, txtNum2Val;
    double numb1,numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Addbtn=findViewById(R.id.Addbtn);
        Subsbtn=findViewById(R.id.Subsbtn);
        Multiplybtn=findViewById(R.id.Multiplybtn);
        Dividebtn=findViewById(R.id.Dividebtn);
        txtResult= findViewById(R.id.txtResult);


        Intent intent = getIntent();
        txtNum1Val = intent.getStringExtra("Num1");
        txtNum2Val = intent.getStringExtra("Num2");

        TextView textView1 = findViewById(R.id.editSecondNumb1);
        textView1.setText(txtNum1Val);
        TextView textView2 = findViewById(R.id.editSecondNumb2);
        textView2.setText(txtNum2Val);

    }

    @Override
    protected void onResume() {
        super.onResume();

        numb1 = Double.parseDouble(txtNum1Val);
        numb2 = Double.parseDouble(txtNum2Val);

        Addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText(txtNum1Val+" + "+txtNum2Val+" = "+(numb1+numb2));
            }
        });

        Subsbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtResult.setText(txtNum1Val+" - "+txtNum2Val+" = "+(numb1-numb2));
            }
        });

        Multiplybtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtResult.setText(txtNum1Val+" * "+txtNum2Val+" = "+(numb1*numb2));
            }
        });

        Dividebtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtResult.setText(txtNum1Val+" / "+txtNum2Val+" = "+(numb1/numb2));
            }
        });
    }
}