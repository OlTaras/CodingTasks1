package org.example;

public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of String.
        String [] elements = {"Monday","Friday","Sunday","Saturday","Monday","Sunday"};

        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if(elements[i].equals(elements[j])){
                    System.out.println(elements[i]);
                }
            }
        }
    }
}
