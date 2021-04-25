package com.DateInterfaceLesson9.Date;

public class Generic<T> {
    private T[] box;

    public void setBox(T[] box) {
        this.box = box;
    }

    public T getBox(int i) {
        return box[i];
    }
}
