package mylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        int num = elements.length;
        if (minCapacity > num) {
            int newCapacity = Math.max(num * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public void add(int index, E element) {
        checkIndex(index);
            ensureCapacity(size + 1);
        for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
//        System.arraycopy(this.elements, index, this.elements, index + 1, size - index);
        this.elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
//        if (size - (index + 1) > 0) {
//            System.arraycopy(elements, index + 1, elements, index, size - (index + 1));
//        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>(size);
        System.arraycopy(elements, 0, cloneList, 0, size);
        return cloneList;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (elements[i] == o) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

}
