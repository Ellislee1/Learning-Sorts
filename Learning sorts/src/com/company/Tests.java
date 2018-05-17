package com.company;
import org.junit.Assert;


public class Tests {

    //Bubble Sort
    @org.junit.Test
    public void BubbleSortTest(){
        int[] sortedArray1 = {0,1,2,2,3,3,3,4,5,5,6,8,8,9,10,11,11,12};
        int[] sortedArray2 = {-1,77,77,77,77,77,77,77,77,77,77,77,77,77};
        int[] testArray1 =  {0,2,1,9,6,8,11,2,3,3,4,12,11,8,3,10,5,5};
        int[] testArray2 =  {12,11,11,10,9,8,8,6,5,5,4,3,3,3,2,2,1,0};
        int[] testArray3 = {77,77,77,77,77,77,77,77,77,77,77,77,77,-1};
        Assert.assertArrayEquals(sortedArray1, BubbleSort.bubbleSort(testArray1));
        Assert.assertArrayEquals(sortedArray1, BubbleSort.bubbleSort(sortedArray1));
        Assert.assertArrayEquals(sortedArray1, BubbleSort.bubbleSort(testArray2));
        Assert.assertArrayEquals(sortedArray2, BubbleSort.bubbleSort(testArray3));
    }

    //Selection Sort
    @org.junit.Test
    public void SelectionSortTest(){
        int[] sortedArray1 = {0,1,2,2,3,3,3,4,5,5,6,8,8,9,10,11,11,12};
        int[] sortedArray2 = {-1,77,77,77,77,77,77,77,77,77,77,77,77,77};
        int[] testArray1 =  {0,2,1,9,6,8,11,2,3,3,4,12,11,8,3,10,5,5};
        int[] testArray2 =  {12,11,11,10,9,8,8,6,5,5,4,3,3,3,2,2,1,0};
        int[] testArray3 = {77,77,77,77,77,77,77,77,77,77,77,77,77,-1};
        Assert.assertArrayEquals(sortedArray1, SelectionSort.selectionSort(testArray1));
        Assert.assertArrayEquals(sortedArray1, SelectionSort.selectionSort(sortedArray1));
        Assert.assertArrayEquals(sortedArray1, SelectionSort.selectionSort(testArray2));
        Assert.assertArrayEquals(sortedArray2, SelectionSort.selectionSort(testArray3));
    }

    //Insertion Sort
    @org.junit.Test
    public void InsertionSortTest(){
        int[] sortedArray1 = {0,1,2,2,3,3,3,4,5,5,6,8,8,9,10,11,11,12};
        int[] sortedArray2 = {-1,77,77,77,77,77,77,77,77,77,77,77,77,77};
        int[] testArray1 =  {0,2,1,9,6,8,11,2,3,3,4,12,11,8,3,10,5,5};
        int[] testArray2 =  {12,11,11,10,9,8,8,6,5,5,4,3,3,3,2,2,1,0};
        int[] testArray3 = {77,77,77,77,77,77,77,77,77,77,77,77,77,-1};
        Assert.assertArrayEquals(sortedArray1, InsertionSort.insertionSort(testArray1));
        Assert.assertArrayEquals(sortedArray1, InsertionSort.insertionSort(sortedArray1));
        Assert.assertArrayEquals(sortedArray1, InsertionSort.insertionSort(testArray2));
        Assert.assertArrayEquals(sortedArray2, InsertionSort.insertionSort(testArray3));
    }

    //Shell Sort
    @org.junit.Test
    public void ShellSortTest(){
        int[] sortedArray1 = {0,1,2,2,3,3,3,4,5,5,6,8,8,9,10,11,11,12};
        int[] sortedArray2 = {-1,77,77,77,77,77,77,77,77,77,77,77,77,77};
        int[] testArray1 =  {0,2,1,9,6,8,11,2,3,3,4,12,11,8,3,10,5,5};
        int[] testArray2 =  {12,11,11,10,9,8,8,6,5,5,4,3,3,3,2,2,1,0};
        int[] testArray3 = {77,77,77,77,77,77,77,77,77,77,77,77,77,-1};
        Assert.assertArrayEquals(sortedArray1, ShellSort.shellSort(testArray1,9));
        Assert.assertArrayEquals(sortedArray1, ShellSort.shellSort(sortedArray1,9));
        Assert.assertArrayEquals(sortedArray1, ShellSort.shellSort(testArray2,9));
        Assert.assertArrayEquals(sortedArray2, ShellSort.shellSort(testArray3,7));
    }

}