/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q2;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */
public class SpecialLL<E> {

    Node<E> head, tail;
    int size = 0;

    public SpecialLL() {
    }

    public int getSize() {
        return size;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void print() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printOdd() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                current = current.next;
                continue;
            }
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ArrayList<E> getEven() {
        ArrayList<E> arrayList = new ArrayList<>();

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                current = current.next;
                continue;
            }
            arrayList.add(current.element);
            current = current.next;
        }
        //reverse
        for (int i = 0, j = arrayList.size() - 1; i < j; i++, j--) {
            E temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
        }
        return arrayList;
    }
}
