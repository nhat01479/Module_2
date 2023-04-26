package mylinkedlist;

import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    private Node tail;

    public class Node<E> {
        public E item;
        private Node<E> next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node node = new Node(e);
        if (tail == null) {
            tail = node;
            head = tail;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        numNodes++;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        }
        if (index >= numNodes) {
            addLast(e);
        } else {
            Node node = new Node(e);
            Node temp = head;
            Node holder;
            for (int i = 0; i < numNodes; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = node;
            temp.next.next = holder;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node;
        if (index == 0) {
            node = head;
            head = head.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node = temp.next;
            temp.next = node.next;
        }
        numNodes--;
        return (E) node.data;
    }

    public int size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
        return i;
    }

    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node front = head;
        Node after = head.next;
        while (after != null) {
            if (after == o) {
                front.next = after.next;
                return true;
            }
            front = head.next;
            after = head.next.next;
        }
        return false;
    }

    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        for (Node<E> i = head; i != null; i = i.next) {
            clone.add(i.item);
        }
        return (E) clone;
    }


    public boolean contains(E o) {
        for (Node i = head; i != null; i = i.next) {
            if (o == i) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = 0;
        if (o == null) {
            for (Node i = head; i != null; i = i.next) {
                if (o == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node i = head; i != null; i = i.next) {
                if (o == i) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        Node node = new Node<>(e);
        if (head == null) {
            head = node;
        } else {
            for (Node i = head; i != null; i = i.next) {
                if (i.next == null) {
                    i.next = node;
                }
            }
        }
        numNodes++;
        return true;
    }

    public E get(int i) {
        int index = 0;
        for (Node j = head; j != null; j = j.next) {
            if (i == index) {
                return (E) j.data;
            }
            index++;
        }
        return null;
    }

    public E getFirst() {
        if (numNodes == 0) {
            throw new RuntimeException("khong co");
        }
        Node node = head;
        return (E) node.data;
    }

    public E getLast() {
        if (numNodes == 0) {
            throw new RuntimeException("khong co");
        }
        Node node = tail;
        return (E) node.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}