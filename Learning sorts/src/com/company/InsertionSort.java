package com.company;

public class InsertionSort {
    public static int[] insertionSort(int[] thisArray) {
        int temp;
        boolean sorted;

        do{
            sorted = true;
            for (int i=0; i<thisArray.length-1; i++){
                temp = thisArray[i];
                if (temp > thisArray[i+1]){
                    thisArray[i] = thisArray[i+1];
                    thisArray[i+1] = temp;
                    sorted = false;
                }
            }
        }while (!sorted);

        return thisArray;
    }
}
