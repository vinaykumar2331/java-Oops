package com.java;
import java.util.Random;
    public class program {
        public static void main(String [] arg){
            int trail = 3;
            Random rand = new Random();
            for(int i=1;i<=trail;i++){
                int r=rand.nextInt(0,1);
                if(r==0){
                    System.out.println("head");
                }
                if(r==1) {
                    System.out.println("tail");
                }
            }

            System.out.println("-----------leap year----------------");
            int year = 2021;
            if(year%4==0&&year%100!=0){
                System.out.println("leap year");
            }
            else{
                System.out.println("normal year");
            }

            System.out.println("-------------factors-------------");
            int num = 8;
            for(int i =1;i<=num;i++){
                if(num%i==0){
                    System.out.println(i + ": is a factor of :"+num);
                }
            }

            System.out.println("---------------quotient and remainder-------------------");
            int num1 = 1;
            int num2 = 5;
            double quotient = num1/num2;
            int remainder = num1%num2;
            System.out.println("quotint of num1 and num2 is :"+quotient);
            System.out.println("Remainder of num1 and num2 is :"+remainder);

            System.out.println("--------------------swapping-----------------------------");
            int n1 = 6;
            int n2 = 7;
            System.out.println("before swapping :"+n1+" , "+n2);
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("After swapping :"+n1+" , "+n2);

            System.out.println("-----------even or odd------------------");
            int a = 6;
            if(a%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }

            System.out.println("----------------vowel or consonent--------------------");
            String c = "A";
            if(c=="a"||c=="e" ||c=="i"||c=="o"||c=="u"||c=="A"||c=="E"||c=="I"||c=="O"||c=="U"){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonent");
            }

            System.out.println("----------largest among 3 numbers-----------------");
            int p = 1;
            int q = 2;
            int r = 3;
            if(p>q){
                System.out.println("p is big :"+p);
            }
            else if(q>r){
                System.out.println("q is big :"+q);
            } else if (r>p) {
                System.out.println("r is big :"+r);
            }
            else{
                System.out.println("largest number not found among 3 nums");
            }

            System.out.println("----------power of 2------------------------");
            int e = 5;
            for(int j=1;j<=e;j++){
                System.out.println(j+"\u00b2"+" = "+Math.pow(j,2));
            }
             System.out.println("-------------harmonic number----------------------------------");
            int harmonic = 5;
            double sum = 0;
            for(int i = 1;i<=harmonic;i++){
                sum=sum+(1.0/i);
                System.out.println(1+"/"+i+"="+sum);
            }
            System.out.println("The nth harmonic number is --> "+sum);
        }
    }


