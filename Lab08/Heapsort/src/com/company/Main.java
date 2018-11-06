package com.company;


public class Main {

    public static void main(String[] args) {
        int[] a = {5, 3, 6, 4, 8, 12, 65, 54, 4, 67};
        Heap heap = new Heap(a);
        heap.heapsort();
        heap.printHeap();

    }


}
