package com.company;

public class QuickSort {
    public static int[] quickSort(int[] thisArray, int start, int end){

        if (start<end){
            int part = partition(thisArray, start,end);

            quickSort(thisArray, start, part-1);
            quickSort(thisArray, part+1, end);
        }
        return thisArray;
    }

    private static int partition(int[] thisArray, int start, int end){

        int pivot = thisArray[end];
        int i = start - 1;

        for (int j=start; j<end; j++){
            if (thisArray[j] <=pivot){
                i++;
                int temp = thisArray[i];
                thisArray[i] = thisArray[j];
                thisArray[j] = temp;
            }
        }

        int temp = thisArray[i+1];
        thisArray[i+1] = thisArray[end];
        thisArray[end] = temp;

        return i+1;
    }
}
