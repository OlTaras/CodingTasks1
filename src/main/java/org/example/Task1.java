package org.example;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */
        int [] temp = {5,-7,2,6,-1,-5,1};
        int max=0;
        int min=0;

        for(int t:temp){
            if(max<t){
                max=t;
            }
            if(min>t){
                min=t;
            }
        }
        System.out.println("The highest temperature of the week is "+max);
        System.out.println("The lowest temperature of the week is "+min);
    }
}
