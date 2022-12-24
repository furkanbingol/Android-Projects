package com.furkanbingol.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Button button2;
    int number;
    Runnable runnable;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setBackgroundColor(Color.parseColor("#55E6C1"));
        button2.setBackgroundColor(Color.parseColor("#82589F"));
        number = 0;
    }

    public void start(View view){
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                textView.setText("Timer: " + number);
                number++;
                textView.setText("Timer: " + number);
                handler.postDelayed(runnable, 1000);  //1 sn
            }
        };
        handler.post(runnable);
        button.setEnabled(false);    //start butonu artık basılamayan halde
    }

    public void stop(View view){
        button.setEnabled(true);    //start butonu artık basılabilir halde
        handler.removeCallbacks(runnable);    //runnable kapatıyoruz
        number = 0;
        textView.setText("Timer: " + number);
    }
}