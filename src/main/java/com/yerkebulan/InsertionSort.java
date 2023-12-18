package com.yerkebulan;

public class InsertionSort {
    // insertion sort = after comparing elements to the left
    // shift elemetn to the right to make room to insert a value

    // Quadratic time O(n^2)
    // small data set = decent
    // large data set = BAD

    // less steps than Bubble Sort
    // Best case is O(n) compared to Selection sort O(n^2)
    public static void main(String[] args) {
        int array[] = {9,8,7,6,3,4,5,2,1};

        insertionSort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for(int i = 1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;

            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
