package com.java;

import java.util.ArrayList;
import java.util.List;

class person{
    private String name;
    private int age;
    private String country;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setCountry(String country){
        this.country=country;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}


class BankAccount{
    private long accountNumber;
    private int balance;
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}



class Rectangle{
    private int length;
    private int width;
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
}


class Employee{
    private int id;
    private String name;
    private double salary;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
    return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}



class Circle_{
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return  2 * Math.PI * radius;
    }
}


class Car{
    private String company_name;
    private String model_name;
    private int year;
    public void setCompany_name(String company_name){
        this.company_name=company_name;
    }
    public String getCompany_name(){
        return company_name;
    }
    public void setModel_name(String model_name){
        this.model_name=model_name;
    }
    public String getModel_name(){
        return model_name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
}



class Student{
    private int student_id;
    private String student_name;
    private List<Double> grades;

    public void setStudent_id(int student_id){
        this.student_id=student_id;
    }
    public int getStudent_id(){
        return student_id;
    }
    public void setStudent_name(String student_name){
        this.student_name=student_name;
    }
    public String getStudent_name(){
        return student_name;
    }
    public List<Double> getGrades(){
        return grades;
    }
    public void addgrades(double grade){
        if(grades==null){
            grades = new ArrayList< >();
        }
        grades.add(grade);
    }
}



public class Encapsulation {
    public static void main(String [] arg){
        person p = new person();
        p.setName("rajan");
        p.setAge(22);
        p.setCountry("India");
        System.out.println(p.getName()+" : "+p.getAge()+" : "+p.getCountry());


        BankAccount ba = new BankAccount();
        ba.setAccountNumber(123123123);
        ba.setBalance(100000);
        System.out.println("A/C :"+ba.getAccountNumber()+" "+"BAL:"+ba.getBalance());


        Rectangle r = new Rectangle();
        r.setLength(3);
        r.setWidth(2);
        System.out.println("length :"+r.getLength()+" "+"width :"+r.getWidth());
        
        
        Employee e = new Employee();
        e.setId(1002);
        e.setName("arjun");
        e.setSalary(10000);
        System.out.println(e.getId()+" : "+e.getName()+" : "+"$"+e.getSalary());


        Circle_ c = new Circle_();
        c.setRadius(7.0);
        System.out.println("Perimeter of circle : "+c.calculatePerimeter());
        System.out.println("Area of circle : "+c.calculateArea());


        Car c1 = new Car();
        c1.setCompany_name("tata");
        c1.setModel_name("punch");
        c1.setYear(2023);

        System.out.println("company_name :"+c1.getCompany_name());
        System.out.println("model_name :"+c1.getModel_name());
        System.out.println("year :"+c1.getYear());



        Student s = new Student();
        s.setStudent_name("rajesh");
        s.setStudent_id(0001);
        s.addgrades(1.0);
        s.addgrades(2.0);
        System.out.println("student name :"+s.getStudent_name());
        System.out.println("student id :"+s.getStudent_id());
        System.out.println("student grades :"+s.getGrades());

    }
}
