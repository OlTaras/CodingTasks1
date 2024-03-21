package org.example;

public class Task3 {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.*/
        int [][] store = {
                {5,9,7,2},
                {1,6,8,4}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if(store[i][j]%2==0){
                    System.out.print(store[i][j]+" ");
                }
            }
        }
    }
}
