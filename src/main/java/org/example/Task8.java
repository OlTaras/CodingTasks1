package org.example;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum numbers in the array
        int [] array = {5,9,1,4,8,-1};

        int max=0;
        int min=0;

        for(int a:array){
            if(max<a){
                max=a;
            }
            if(min>a){
                min=a;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
