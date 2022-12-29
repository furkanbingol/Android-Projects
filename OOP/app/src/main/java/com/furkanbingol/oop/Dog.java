package com.furkanbingol.oop;

public class Dog extends Animal{

    public void test(){
        super.sing();   //prints "Animal Class"
    }

    public void sing(){  //OVERRIDE
        System.out.println("Dog Class");     //prints "Dog Class"
    }
}
