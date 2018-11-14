package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                j--;
            } while (arr[j] > pivot);
            do {
                i++;
            } while (arr[i] < pivot);
            if (i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }

    }


    static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot+1, high);
        }
    }
}
