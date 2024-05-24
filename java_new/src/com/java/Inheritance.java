package com.java;


class father{
    String name = "father";
}
class childern extends father{
    String name = "son";

}

class Animal{
    public void MakeSound(){
        System.out.println("animal making sound");
    }
}
class Cat extends Animal{
    public void MakeSound() {
        System.out.println("meow meow");
    }
}

public class Inheritance {
    public static void main(String [] arg){
        childern c = new childern();
        father f = new father();
        System.out.println(c.name);
        System.out.println(f.name);

        Animal a = new Animal();
        Cat c1 = new Cat();
        c1.MakeSound();
        a.MakeSound();
    }
}
