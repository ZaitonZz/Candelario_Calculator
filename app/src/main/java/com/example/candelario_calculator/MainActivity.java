package com.example.candelario_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input1, input2;
    TextView ans;
    Button btnAdd, btnSub, btnMod, btnMul, btnDiv;

    double var1, var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // call for buttons
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMod = findViewById(R.id.btnMod);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        // call for edit text
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        // call for textView
        ans = findViewById(R.id.Ans);

        // listener
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        var1 = Double.parseDouble(input1.getText().toString());
        var2 = Double.parseDouble(input2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                ans.setText(Double.toString(var1 + var2));

                break;
            case R.id.btnSub:
                ans.setText(Double.toString(var1 - var2));

                break;
            case R.id.btnMul:
                ans.setText(Double.toString(var1 * var2));

                break;
            case R.id.btnDiv:
                ans.setText(Double.toString(var1 / var2));

                break;
            case R.id.btnMod:
                ans.setText(Double.toString(var1 % var2));
                break;
        }
    }
}