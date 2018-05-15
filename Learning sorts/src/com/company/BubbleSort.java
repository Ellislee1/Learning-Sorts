package com.company;
public class BubbleSort {
    public static int[] bubbleSort(int[] thisArray){
        int temp;
        boolean swaps;

        do {
            swaps = false;
            for (int i = 0; i<thisArray.length-1; i++){
                if (thisArray[i] > thisArray[i+1]){
                    temp = thisArray[i];
                    thisArray[i] = thisArray[i+1];
                    thisArray[i+1] = temp;
                    swaps = true;
                }
            }
        } while (swaps);

        return thisArray;
    }
}
