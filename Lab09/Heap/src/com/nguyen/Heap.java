package com.nguyen;


public class Heap {
    private int heap[];
    private int length;


    public Heap() {
        heap = new int[10];
        length = 10;
    }

    public Heap(int heap[]) {
        this.heap = heap;
        this.length = heap.length;
        buildMaxHeap();
    }

    public int[] getHeap() {
        return heap;
    }

    public void setHeap(int[] heap) {
        this.heap = heap;
    }

    void buildMaxHeap() {
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
        for (int i = 0; i < length; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    void deleteMax() {
        if (length < 1) {
            System.out.println("Heap empty");
        } else {
            heap[0] = heap[length - 1];
            /*
             * Create new array with length := length-1 and copy
             */
            length--;
            int[] newHeap = new int[length];
            for (int i = 0; i < length - 1; i++) {
                newHeap[i] = heap[i];
            }
            this.heap = newHeap;


            maxHeapify(heap, 0, length);
        }
    }

    void increaseKey(int i, int key) {
        if (key < heap[i]) {
            System.out.println("The key is smaller than current key" + heap[i]);
        } else {
            heap[i] = key;
            while (i > 0 && heap[i / 2] < heap[i]) {

                int swapper = heap[i / 2];
                heap[i / 2] = heap[i];
                heap[i] = swapper;

                i = i / 2;
            }
        }
    }

    void maxHeapInsert(int key) {
        length++;
        int[] newHeap = new int[length];
        for (int i = 0; i < length - 2; i++) {
            newHeap[i] = heap[i];
        }
        newHeap[length-1] = Integer.MIN_VALUE;
        this.heap = newHeap;
        increaseKey(length-1, key);
    }
}
