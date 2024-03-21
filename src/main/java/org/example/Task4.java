package org.example;

public class Task4 {
    public static void main(String[] args) {
        /*Create a 2D array of integers. Develop a program which will
        calculate the sum of even and odd numbers for that array.*/
        int [][] store = {
                {5,9,7,2},
                {1,6,8,4}
        };
        int odd=0;
        int even=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if(store[i][j]%2==0){
                    even+=store[i][j];
                }else{
                    odd+=store[i][j];
                }
            }
        }
        System.out.println("Sum on even numbers is "+even);
        System.out.println("Sum on odd numbers is "+odd);
    }
}
