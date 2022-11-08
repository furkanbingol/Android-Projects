package com.furkanbingol.java101;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello Java!\n");
        System.out.println(5 * 2);

        double a = 30;
        double b = 40.0;
        float c = 50;
        //float d = 60.0;   //Compile Error!
        float e = 60.0f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println();

        boolean isAlive = true;
        System.out.println(!isAlive);

        final int myVal = 5;
        //myVal = 6;    //Compile Error!
    }
}
