package com.furkanbingol.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
        System.out.println(addition(40,30));

        username = "Furkan";
        System.out.println("in onCreate method: " + username);
        testMethod();
        makeMusicians();
        makeSimpsons();
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");
    }

    public void testMethod() {  //My Method
        int x = 10;
        System.out.println("value of x: " + x);
        username = "Kevin";
        System.out.println("in testMethod: " + username);
    }

    public int addition(int a, int b) {   //My Method
        return a + b;
    }

    public void makeMusicians() {
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println("James instrument: " + james.instrument);
    }

    public void makeSimpsons() {
        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");
        homer.setAge(51);
        System.out.println("Homer age: " + homer.getAge());
    }
}