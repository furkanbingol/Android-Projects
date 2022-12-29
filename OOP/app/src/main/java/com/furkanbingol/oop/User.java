package com.furkanbingol.oop;

public class User extends People{   //People: abstract class

    //Property
    String name;    //default access modifier: package-private
    String job;     //default access modifier: package-private


    //Constructor
    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }

    //Default Constructor
    public User() {
    }
}
