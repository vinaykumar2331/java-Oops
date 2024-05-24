package com.java;
class Animalfamily{
    public void sound(){
        System.out.println("animal makes sound");
    }
}
class bird extends Animalfamily{
    public void sound() {
        System.out.println("bird sound");
    }
}
class cat_ extends Animalfamily{
    public void sound() {
        System.out.println("cat sound");
    }
}



class shapes{
    public double area(){
        return 0;
    }
}
class circle_shape extends shapes{
    private int radius;
    public circle_shape(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shapes{
    private double len;
    private double width;
    public rectangle(double length,double width){
        this.len=length;
        this.width=width;
    }
    public double area(){
        return len*width;
    }
}

public class Polymorphism {
    public static void main(String[] arg){
        Animalfamily af = new Animalfamily();
        af.sound();
        bird b = new bird();
        b.sound();
        cat_ c = new cat_();
        c.sound();


        shapes s = new circle_shape(5);
        System.out.println("area of circle :"+ s.area());
        shapes s1 = new rectangle(2,2);
        System.out.println("area of rectangle :"+ s1.area());

    }
}
