package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second, sum;
    private boolean isOperationClick;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                break;
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                 if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("2");
            }else {
                textView.append("2");
            }
            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                sum = 0;
                break;


        }
        isOperationClick = false;
    }

    public <x> void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                sum =  first + second;
                sum =  first / second;
                sum =  first - second;
                sum =  first * second;

                textView.setText(sum.toString());
                break;
            case R.id.btn_division:
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_multiplier:
                first = Integer.valueOf(textView.getText().toString());
                break;
            default:

        }
        isOperationClick = true;
    }

    private class х {
    }
}