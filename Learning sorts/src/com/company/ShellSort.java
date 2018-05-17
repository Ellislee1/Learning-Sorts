package com.company;

public class ShellSort {
    public static int[] shellSort(int[] thisArray, int gap){
        boolean sorted = true;
        int temp;

        for (int i=0; i<thisArray.length-gap; i++){
            temp = thisArray[i];
            if (temp > thisArray[i+gap]){
                thisArray[i] = thisArray[i+gap];
                thisArray[i+gap] = temp;
                sorted = false;
            }
        }

        if(sorted){
            return thisArray;
        }

        if (gap == 1){
                do{
                    sorted = true;
                    for (int i=0; i<thisArray.length-1; i++){
                        temp = thisArray[i];
                        if (temp > thisArray[i+gap]){
                            thisArray[i] = thisArray[i+gap];
                            thisArray[i+gap] = temp;
                            sorted = false;
                        }
                    }
                }while (!sorted);
        } else{
           thisArray = shellSort(thisArray, gap/2);
        }
        return thisArray;
    }
}
