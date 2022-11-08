package com.furkanbingol.java101;

public class Loops {
    public static void main(String[] args) {
        //for loop
        System.out.println("for");
        int[] numbers = {10,20,30,40,50};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //foreach
        System.out.println("\nforeach");
        String[] str = new String[3];
        str[0] = "A";
        str[1] = "B";
        str[2] = "C";
        for(String s : str)
            System.out.println(s);

        //while
        System.out.println("\nwhile");
        int i = 0;
        while(i < 5){
            System.out.println(i * 10);
            i++;
        }
    }
}
