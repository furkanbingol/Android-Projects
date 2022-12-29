package com.furkanbingol.oop;

import static com.furkanbingol.oop.HouseDecor.roomName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User();
        myUser.name = "Furkan";
        myUser.job = "Software Engineer";

        User myUser2 = new User();
        myUser2.name = "Kirk";
        myUser2.job = "Musician";
        //Bir sınıftan sadece 1 nesne oluşturabiliyorsak, o sınıfa "SINGLETON CLASS" denir.

        User myUser3 = new User("Clara", "Writer");
        System.out.println(myUser3.name + ", " + myUser3.job);

        //Encapsulation
        Musician james = new Musician("James","Guitar", 50);
        james.setAge(60);
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getName());

        //Polymorphism
        //Static Polymorphism(Bir Class içerisinde "metot overloading" yapmak)
        //--> It relates to 'method overloading'.
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(4,6));
        System.out.println(mathematics.sum(10,10,10));


        //Dinamik Polymorphism
        //--> It relates to 'method overriding'.
        Animal myAnimal = new Animal();
        myAnimal.sing();        //prints "Animal Class"
        Dog barley = new Dog();
        barley.test();          //prints "Animal Class"
        barley.sing();          //prints "Dog Class"


        //Abstract Classes (NESNESİ OLUŞTURULAMAZ, diğer sınıflar bu sınıfı extends etsinler diye varlar!)
        //Bu örnekte abstract class olan --> People Class'ı
        User user = new User("Furkan", "SWE");
        System.out.println(user.info());

        //Interfaces
        //Java'da multiple class inheritance YOKTUR. Fakat "multiple interface inheritance" YAPABİLİRİZ.
        //roomName = "Bedroom";  --> Error, because Interface properties are "static and final"
        Piano piano = new Piano();
        piano.brand = "Yamaha";
        piano.digital = true;
        piano.information();
    }
}