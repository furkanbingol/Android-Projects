package com.furkanbingol.oop;

public class Piano implements Instrument, HouseDecor{   //Multiple Interface Inheritance

    String brand;
    boolean digital;

    @Override
    public void information() {
        System.out.println("Overrided method!");
    }
}
