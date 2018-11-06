package com.company;

import java.util.ArrayList;

public class Heap {
    private int heap[];


    public Heap() {
        heap = new int[10];
    }

    public Heap(int heap[]) {
        this.heap = heap;
        buildMaxHeap();
    }

    public int[] getHeap() {
        return heap;
    }

    public void setHeap(int[] heap) {
        this.heap = heap;
    }

    void buildMaxHeap() {
        int length = heap.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            maxHeapify(heap, i, length);

        }

    }

    void maxHeapify(int[] heap, int i, int length) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < length && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            /* swap procedure
             * lift the heap[i] (the smaller) down
             */

            int swapper = heap[i];
            heap[i] = heap[largest];
            heap[largest] = swapper;
//            printHeap();
            maxHeapify(heap, largest, length);

        }
    }


    public void heapsort() {
        buildMaxHeap();
        int length = this.heap.length;
        for (int i = length - 1; i > 0; i--) {
            /*
             * Swap heap[i] and heap[0]
             */

            int swapper = heap[i];
            heap[i] = heap[0];
            heap[0] = swapper;

            maxHeapify(heap, 0, i);
        }
    }

    void printHeap() {
        for (int i : heap) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
