package org.example;

public class Task9 {
    public static void main(String[] args) {
        int [] secondNum = {2,4,2,7,9,5,6};

        for (int i = 0; i < secondNum.length; i++) {
            for (int j = i+1; j < secondNum.length; j++) {
                if(secondNum[i]>secondNum[j]){
                    secondNum[i]=(secondNum[i]+secondNum[j])-(secondNum[j]=secondNum[i]);
                }
            }
        }
        System.out.println(secondNum[secondNum.length-2]);
    }
}
