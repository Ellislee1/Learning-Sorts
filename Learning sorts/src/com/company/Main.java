package com.company;

public class Main {

    public static void main(String[] args) {
        int[] useArray = GenRandomNumbers.randomNumbers(100,-10,25);
        int[] sortedArray;
        System.out.println("UnSorted");
        for (int item:useArray){
            System.out.print(" " + item);
        }

        sortedArray = BubbleSort.bubbleSort(useArray);
        System.out.println("\nBubble Sort");
        for (int item:sortedArray){
            System.out.print(" " + item);
        }

        useArray = GenRandomNumbers.randomNumbers(100,-10,25);
        System.out.println("\nUnSorted");
        for (int item:useArray){
            System.out.print(" " + item);
        }

        sortedArray = SelectionSort.selectionSort(useArray);
        System.out.println("\nSelection Sort");
        for (int item:sortedArray){
            System.out.print(" " + item);
        }

        useArray = GenRandomNumbers.randomNumbers(100,-10,25);
        System.out.println("\nUnSorted");
        for (int item:useArray){
            System.out.print(" " + item);
        }

        sortedArray = InsertionSort.insertionSort(useArray);
        System.out.println("\nInsertion Sort");
        for (int item:sortedArray){
            System.out.print(" " + item);
        }
    }

}
