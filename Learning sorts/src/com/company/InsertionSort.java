package com.company;

public class InsertionSort {
    public static int[] insertionSort(int[] thisArray) {
        int temp;

        for (int i = 1; i<thisArray.length; i++){
            boolean flag = false;
            int j=i-1;
            temp = thisArray[i];

            while (!flag && j>-1){
                if (j==0){
                    if (temp < thisArray[0]){
                        thisArray[1] = thisArray[0];
                        thisArray[0] = temp;
                        flag = true;
                    } else {
                        thisArray[1] = temp;
                        flag = true;
                    }
                }else{
                    if (temp<thisArray[j]){
                        thisArray[j+1] = thisArray[j];
                        j--;
                    } else {
                        thisArray[j+1] = temp;
                        flag =true;
                    }
                }
            }
        }
        return thisArray;
    }
}
