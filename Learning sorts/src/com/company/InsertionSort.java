package com.company;

public class InsertionSort {
    public static int[] insertionSort(int[] thisArray) {
        int temp;
        for (int i = 1; i < thisArray.length; i++) {
            boolean flag = false;
            int j = i - 1;
            temp = thisArray[i];

            do {
                if (temp < thisArray[j]) {
                    thisArray[j+1] = thisArray[j];
                    j--;
                } else if(j==0 || temp >= thisArray[j]) {
                    thisArray[j+1] = temp;
                    flag = true;
                }
            } while (!flag);
            for (int item:thisArray){
            }
        }
        return thisArray;
    }
}
