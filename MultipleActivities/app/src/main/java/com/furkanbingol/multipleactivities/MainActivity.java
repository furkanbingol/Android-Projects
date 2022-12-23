package com.furkanbingol.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = "";
        editText = findViewById(R.id.inputText);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }

    public void changeActivity(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        userName = editText.getText().toString();
        intent.putExtra("userInput", userName);   //key,value

        startActivity(intent);
    }
}