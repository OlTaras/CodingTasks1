package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //  Write a java program to check whether a given number is prime or not?
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number");
        int number= scanner.nextInt();
        int flag=0;
        if(number==0 || number==1){
            System.out.println(number+" is not prime number");
        }else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    System.out.println(number+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(number+" is prime number"); }
        }
    }
}
