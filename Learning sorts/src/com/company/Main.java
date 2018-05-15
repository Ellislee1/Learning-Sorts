package com.company;

public class Main {

    public static void main(String[] args) {
        int[] useArray = getRandom();
        int[] sortedArray;

        //You should know what this one is
        outPut(BubbleSort.bubbleSort(useArray),"Bubble Sort");

        /*Select i in array, look for next smallest, swap i++
        * repeat until sorted*/
        useArray = getRandom();
        outPut(SelectionSort.selectionSort(useArray), "Selection Sort");

        //Insert into the correct position in the array
        useArray = getRandom();
        outPut(InsertionSort.insertionSort(useArray), "Insertion Sort");
    }

    private static int[] getRandom(){
        int[] thisArray = GenRandomNumbers.randomNumbers(10,-10,25);
        outPut(thisArray, "Unsorted");
        return thisArray;
    }

    private static void outPut(int[] thisArray, String arrayType){
        System.out.println("\n" + arrayType);
        for (int item:thisArray){
            System.out.print(" " + item);
        }
    }

}
