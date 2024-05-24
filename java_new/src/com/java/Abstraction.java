package com.java;

abstract class animal {
    abstract void sound();
}
class lion extends animal{
    void sound() {
        System.out.println("lion rore");
    }
}
class tiger extends animal{
    void sound(){
        System.out.println("tiger rore");
    }
}



abstract class shape{

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class circle extends shape {
    private int radius = 5;

    double calculateArea() {
        return Math.PI * radius * radius;

    }

    double calculatePerimeter() {
        return  2 * Math.PI * radius;

    }
}
     class Triangle extends shape{
         private int side1 = 1;
         private int side2 = 2;
         private int side3 = 3;

         private int len = 5;
         private int brth = 6;


         double calculateArea() {
            return 0.5*len*brth;

        }
        double calculatePerimeter(){
            return side1+side2+side3;

        }
    }



    abstract class Bank{
    abstract void deposit();
    abstract void withdraw();
    }
    class SavingsAccount extends Bank{
    void deposit(){
        System.out.println("Deposit in savings bank");
    }
    void withdraw(){
        System.out.println("Withdraw from savings bank");
    }
    }
    class CurrentAccount extends Bank{
    void deposit(){
        System.out.println("Deposit in Current account");
    }
    void withdraw(){
        System.out.println("Withdraw from current account");
    }
    }


public class Abstraction {
    public static void main(String[] arg){
        animal obj = new lion();
        obj.sound();
        obj=new tiger();
        obj.sound();


        shape s = new circle();
        System.out.println("Area of circle :" + s.calculateArea());
        System.out.println("Perimeter of circle :" + s.calculatePerimeter());
        s = new Triangle();
        System.out.println("Area of triangle is :"+ s.calculateArea());
        System.out.println("perimeter of triangle is :"+s.calculatePerimeter());


        Bank b = new SavingsAccount();
        b.deposit();
        b.withdraw();
        b = new CurrentAccount();
        b.withdraw();
        b.deposit();


    }
}
