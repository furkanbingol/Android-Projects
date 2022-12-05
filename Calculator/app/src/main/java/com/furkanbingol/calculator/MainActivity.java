package com.furkanbingol.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void plus(View view) {
        if (number1Text.getText().toString().matches("")
                || number2Text.getText().toString().matches("")){
            resultText.setText("Error, enter a number!");
        }
        else{
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int result = n1 + n2;

            resultText.setText("Result: " + result);
        }
    }

    public void minus(View view) {
        if (number1Text.getText().toString().matches("")
                || number2Text.getText().toString().matches("")){
            resultText.setText("Error, enter a number!");
        }
        else{
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int result = n1 - n2;

            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {
        if (number1Text.getText().toString().matches("")
                || number2Text.getText().toString().matches("")){
            resultText.setText("Error, enter a number!");
        }
        else{
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            int result = n1 * n2;

            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        if (number1Text.getText().toString().matches("")
                || number2Text.getText().toString().matches("")){
            resultText.setText("Error, enter a number!");
        }
        else{
            int n1 = Integer.parseInt(number1Text.getText().toString());
            int n2 = Integer.parseInt(number2Text.getText().toString());
            if (n2 == 0)
                resultText.setText("Error, you cannot divide a number by 0!");
            else{
                int result = n1 / n2;
                resultText.setText("Result: " + result);
            }
        }
    }
}