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
    String answer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMod = findViewById(R.id.btnMod);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        ans = findViewById(R.id.Ans);

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
                ans.setText(evaluate(var1, var2, 0, answer));
                break;
            case R.id.btnSub:
                ans.setText(evaluate(var1, var2, 1, answer));
                break;
            case R.id.btnMul:
                ans.setText(evaluate(var1, var2, 2, answer));
                break;
            case R.id.btnDiv:
                ans.setText(evaluate(var1, var2, 3, answer));
                break;
            case R.id.btnMod:
                ans.setText(evaluate(var1, var2, 4, answer));
                break;
        }
    }

    public String evaluate(Double var1, Double var2, int i, String Answer) {
        switch (i){
            case 0:
                Answer = Double.toString(var1 + var2);
                break;
            case 1:
                Answer = Double.toString(var1 - var2);
                break;
            case 2:
                Answer = Double.toString(var1 * var2);
                break;
            case 3:
                Answer = Double.toString(var1 / var2);
                break;
            case 4:
                Answer = Double.toString(var1 % var2);
                break;
        }
        return Answer;
    }
}