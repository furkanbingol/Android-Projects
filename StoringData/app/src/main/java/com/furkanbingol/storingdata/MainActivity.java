package com.furkanbingol.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText scanText;
    TextView resultText;
    Button button;
    Button button2;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = this.getSharedPreferences("com.furkanbingol.storingdata", Context.MODE_PRIVATE);
        scanText = findViewById(R.id.scanText);
        resultText = findViewById(R.id.resultText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setBackgroundColor(Color.parseColor("#20bf6b"));     //save button
        button2.setBackgroundColor(Color.parseColor("#eb3b5a"));    //delete button
        int storedAge = sharedPreferences.getInt("storedAge", 0);       //bu key yoksa,default değerini 0 yap.
        if(storedAge == 0)
            resultText.setText("Your age: ");
        else
            resultText.setText("Your age: " + storedAge);
    }

    public void save(View view) {
        if(!scanText.getText().toString().matches("")){
            int age = Integer.parseInt(scanText.getText().toString());
            if(age <= 0)
                resultText.setText("Please enter a correct age!");
            else {
                resultText.setText("Your age: " + age);
                sharedPreferences.edit().putInt("storedAge", age).apply();
            }
        }
    }

    public void delete(View view) {
        int storedData = sharedPreferences.getInt("storedAge", 0);
        if(storedData != 0){
            sharedPreferences.edit().remove("storedAge").apply();
            resultText.setText("Your age: ");
        }
    }
}