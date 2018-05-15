package com.company;
public class SelectionSort {
    public static int[] selectionSort(int[] thisArray){
        int[] sortedArray;
        for (int i = 0; i< thisArray.length; i++){
            int smallest = 999999;
            int smallestLocation = -1;
            for (int j = i; j<thisArray.length; j++){
                if (thisArray[j]<smallest){
                    smallest = thisArray[j];
                    smallestLocation = j;
                }
            }
            thisArray[smallestLocation] = thisArray[i];
            thisArray[i] = smallest;
        }

        sortedArray = thisArray;
        return sortedArray;
    }
}
