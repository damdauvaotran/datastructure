package com.nguyen;

public class Index {
    private int index = 0;

    public Index(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void plusPlus(){
        this.index++;
    }

}