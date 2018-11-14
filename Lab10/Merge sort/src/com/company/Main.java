package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        mergeSort(arr);
        printArray(arr);

    }


    static void merge(int[] arr, int left, int middle, int right) {
        // Length of 2 array
        int length1 = middle - left + 1;
        int length2 = right - middle;

        int[] tempArr1 = new int[length1];
        int[] tempArr2 = new int[length2];

        // Copy array

        for (int i = 0; i < length1; i++) {
            tempArr1[i] = arr[left + i];
        }
        for (int i = 0; i < length2; i++) {
            tempArr2[i] = arr[middle + 1 + i];
        }

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;

        // merge here

        while (i < length1 && j < length2) {
            if (tempArr1[i] < tempArr2[j]) {
                arr[k] = tempArr1[i];
                i++;
            } else {
                arr[k] = tempArr2[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            arr[k] = tempArr1[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < length2) {
            arr[k] = tempArr2[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m ,r);
        }
    }

    static void mergeSort(int [] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
