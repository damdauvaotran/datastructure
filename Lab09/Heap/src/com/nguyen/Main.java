package com.nguyen;

public class Main {

    public static void main(String[] args) {
	    int [] a = {21,41,5,6,33,3,5,78,9,41,5,19,4,13,91};
	    Heap h = new Heap(a);
	    h.printHeap();
	    h.deleteMax();
	    h.printHeap();
	    h.increaseKey(3, 100);
	    h.printHeap();
	    h.maxHeapInsert(120);
	    h.printHeap();
    }
}
