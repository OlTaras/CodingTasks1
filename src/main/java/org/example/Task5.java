package org.example;

public class Task5 {
    public static void main(String[] args) {
        /*Write a program to swap 2 numbers without a temporary variable.*/
        int a = 1;
        int b = 2;

        a = (a * b) / (b = a);       // a+b-(b=a)
        System.out.println("a="+a+" b="+b);
    }
}
