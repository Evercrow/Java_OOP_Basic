package org.Seminar10.task01;

public class GenBox <T>{
    private T newT;

    public GenBox(T newT) {
        this.newT = newT;
    }

    public T getNewT() {
        return newT;
    }

    public void setNewT(T newT) {
        this.newT = newT;
    }
}
