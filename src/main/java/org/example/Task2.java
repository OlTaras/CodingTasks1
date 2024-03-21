package org.example;

public class Task2 {
    public static void main(String[] args) {
        /*Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in the array.*/
        int [] values = {4,6,9,5,4,33,12,16,2,4,21};
        int sum=0;
        for(int v:values){
            sum+=v;
        }
        System.out.println(sum);
    }
}
