package com.java;
import java.util.Scanner;
public class USER_INPUT {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String str = sc.next();
        System.out.println("your name is : "+str);
        System.out.println("confirm your name");
        String str1 = sc.next();
        while(!str.equals(str1)){
            str1 =sc.next();
        }
        System.out.println("tnx for conformation");
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter another number :");
        int b = sc.nextInt();
        System.out.println("sum of the numbs are : "+ (a+b));
        System.out.println("products of the numbs are : "+ (a*b));

        System.out.println("------------------------------------------------------");

        System.out.println("enter a number for sum :");
        int a1 = sc.nextInt();
        System.out.println("enter another number sum :");
        int b1 = sc.nextInt();
        System.out.println("sum of the numbs are : "+ (a1+b1));
        System.out.println("enter a number for product:");
        int a11 = sc.nextInt();
        System.out.println("enter another number for product:");
        int b11 = sc.nextInt();
        System.out.println("products of the numbs are : "+ (a11*b11));

        System.out.println("--------------------------------");
        System.out.println("enter length : ");
        double len = sc.nextDouble();
        System.out.println("enter width : ");
        double width = sc.nextDouble();
        double area_of_rectangle = len * width;
        System.out.println("area of rectangle :"+(int)area_of_rectangle);

        System.out.println("-----------------------------------");
        System.out.println("enter your name : ");
        String name = sc.next();
        System.out.println("enter your roll number : ");
        int roll_no = sc.nextInt();
        System.out.println("enter your field of interest : ");
        String Interest = sc.next();
        System.out.println("HEY--");
        System.out.println("my name is : "+ name);
        System.out.println("my roll no is : "+roll_no);
        System.out.println("my interested in : "+Interest);

        System.out.println("-------------------");
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        System.out.println("the square of the given number "+num+" is : "+num*num);

        System.out.println("-----------------------------------------");
        System.out.println("input a string : ");
        String str11 = sc.next();
        System.out.println("input another string : ");
        String str2 = sc.next();
        System.out.println("the new string is :"+ str11 +" "+ str2);

        System.out.println("----------------------------------");
        System.out.println("input a side for square : ");
        double side = sc.nextDouble();
        double perimeter = 4*side;
        System.out.println("perimeter of a square is :"+ perimeter);


        System.out.println("---------------------------------");
        System.out.println("enter a number : ");
        int input = sc.nextInt();
        System.out.println("enter another number : ");
        int input1 = sc.nextInt();
        System.out.println("enter one more number : ");
        int input2 = sc.nextInt();
        if(input==input1&&input==input2){
            System.out.println("all are equal");
        } else if (input==input1||input==input2) {
            System.out.println("two of them are equal");
        }
        else{
            System.out.println("no inputs are equal");
        }


        System.out.println("----------------------------");
        System.out.println("input a value : ");
        int aa = sc.nextInt();
        System.out.println("input another value : ");
        int bb = sc.nextInt();
        if(aa>50&&aa<bb){
            System.out.println("true");
        }
        else{
            System.out.println("not true");
        }

        System.out.println("----------------------------");
        System.out.println("enter sub1 marks : ");
        int sub1 = sc.nextInt();
            while (sub1 > 100) {
                System.out.println("enter correct marks..try again");
                sub1=sc.nextInt();
            }
        System.out.println("enter sub2 marks : ");
        int sub2 = sc.nextInt();
        while(sub2>100){
            System.out.println("enter correct marks..try again");
            sub2=sc.nextInt();
        }
        System.out.println("enter sub3 marks : ");
        int sub3 = sc.nextInt();
        while(sub3>100){
            System.out.println("enter correct marks..try again");
            sub3=sc.nextInt();
        }
        int sum = sub1+sub2+sub3;
        double percentage = sum*100;

        System.out.println("total marks are : "+sum+" out of "+300);
        System.out.println("total percentage is : "+percentage/300);
    }
}
