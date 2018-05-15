package com.company;
import java.util.Random;

public class GenRandomNumbers {
    public static int[] randomNumbers(int upperLimit, int lowerLimit, int numberOfItems){
        int[] randomArray = new int[numberOfItems];
        Random randNo = new Random();
        for (int i = 0; i<numberOfItems; i++){
            randomArray[i] = randNo.nextInt((upperLimit-lowerLimit)+1)+lowerLimit;
        }
        return randomArray;
    }
}
