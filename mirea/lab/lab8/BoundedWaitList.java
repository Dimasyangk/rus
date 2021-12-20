package ru.mirea.lab.lab8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    BoundedWaitList(int capacity){};

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
