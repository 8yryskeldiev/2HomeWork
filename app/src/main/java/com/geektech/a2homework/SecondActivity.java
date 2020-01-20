package com.geektech.a2homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView resultField;
    Double firstValues;
    Double secondValues;
    Double result;
    String operation;
    String someText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        resultField = findViewById(R.id.result_field);


    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
                resultField.append("0");
                break;
            case R.id.one:
                resultField.append("1");
                break;
            case R.id.two:
                resultField.append("2");
                break;
            case R.id.three:
                resultField.append("3");
                break;
            case R.id.four:
                resultField.append("4");
                break;
            case R.id.five:
                resultField.append("5");
                break;
            case R.id.six:
                resultField.append("6");
                break;
            case R.id.seven:
                resultField.append("7");
                break;
            case R.id.eight:
                resultField.append("8");
                break;
            case R.id.nine:
                resultField.append("9");
                break;
            case R.id.comma:
                resultField.append(".");
                break;
            case R.id.deletion:
                resultField.setText("");
                break;


        }
    }

    @SuppressLint("WrongViewCast")
    public void OnOperatoinClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                operation = "+";
                firstValues = Double.valueOf(resultField.getText().toString());
                resultField.setText(firstValues + "+");
                break;
            case R.id.minus:
                operation = "-";
                firstValues = Double.valueOf(resultField.getText().toString());
                resultField.setText(firstValues + "-");
                break;
            case R.id.multiplication:
                operation = "X";
                firstValues = Double.valueOf(resultField.getText().toString());
                resultField.setText(firstValues + "X");
                break;
            case R.id.division:
                operation = "/";
                firstValues = Double.valueOf(resultField.getText().toString());
                resultField.setText(firstValues + "/");
                break;
            case R.id.equally:

                if (operation != null) {
                    String second = resultField.getText().toString().replace(firstValues + operation + "", "");
                    secondValues = Double.valueOf(second);
                    switch (operation) {
                        case "+":
                            result = firstValues + secondValues;
                            resultField.setText(firstValues + "+" + secondValues + "=" + result);
                            break;
                        case "-":
                            result = firstValues - secondValues;
                            resultField.setText(firstValues + "-" + secondValues + "=" + result);
                            resultField.getText().toString();
                            break;
                        case "X":
                            result = firstValues * secondValues;
                            resultField.setText(firstValues + "x" + secondValues + "=" + result);
                            resultField.getText().toString();
                            break;
                        case "/":
                            result = firstValues / secondValues;
                            resultField.setText(firstValues + "/" + secondValues + "=" + result);
                            resultField.getText().toString();
                            break;

                    }

                }

        }
    }

    public void ch_activity() {
        Intent intent = new Intent(this, MainActivity.class);
        someText = resultField.getText().toString();
        intent.putExtra("result_key", someText);
        startActivityForResult(intent, 42);
    }

    public void ch_activity(View view) {
        ch_activity();
    }
}
