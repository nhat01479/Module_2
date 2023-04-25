package org.example;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        if (elements.length >= minCapacity)
            elements = Arrays.copyOf(elements, elements.length + 1);
        else elements = Arrays.copyOf(elements, minCapacity);
    }

    public void add(int index, E element) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        else
            ensureCapacity(size + 1);
            for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
            this.elements[index] = element;
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        elements[size++]=e;
        return true;
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println();
    }
}
