/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

import java.util.NoSuchElementException;

/**
 *
 * @author szeyu
 */

public class DoublyLinkedList<E> {
    private DNode head;
    private DNode tail;
    private int size = 0;
    
    public void addFirst(E element){
        System.out.println("adding: " + element);
        DNode newNode = new DNode(element);
        if(size == 0){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(E element){
        System.out.println("adding: " + element);
        DNode newNode = new DNode(element);
        if(size == 0){
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void add(int index, E element){
        System.out.println("adding: " + element);
        if(index < 0 || index > size)  
            throw new IndexOutOfBoundsException();
        else if(index == 0)
            addFirst(element);
        else if(index == size)
            addLast(element);
        else {
            DNode newNode = new DNode(element);
            DNode current = head;
            for (int i = 1; i < size; i++) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next = newNode;
            newNode.next.prev = newNode;
            
            size++;
        }
    }
    
    public void iterateForward(){
        System.out.println("iterating forward..");
        if(size == 0)
            return;
        DNode current = head;
        while(current.next != null){
            System.out.print(current.elememt + " ");
            current = current.next;
        }
        System.out.println(current.elememt);
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward..");
        if(size == 0)
            return;
        DNode current = tail;
        while(current.prev != null){
            System.out.print(current.elememt + " ");
            current = current.prev;
        }
        System.out.println(current.elememt);
    }
    
    public E removeFirst(){
        if(size == 0)
            throw new NoSuchElementException();
        DNode tempNode = head;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        System.out.println("deleted: " + tempNode.elememt);
        return (E) tempNode.elememt;
    }
    
    public E removeLast(){
        if(size == 0)
            throw new NoSuchElementException();
        DNode tempNode = tail;
        tail = tail.prev;
        if(tail == null)
            head = null;
        size--;
        System.out.println("deleted: " + tempNode.elememt);
        return (E) tempNode.elememt;
    }
    
    public E remove(int index){
        if(size == 0)
            throw new NoSuchElementException();
        else if(index < 0 || index >= size)  
            throw new IndexOutOfBoundsException();
        else if(index == 0)
            return removeFirst();
        else if(index == size - 1)
            return removeLast();
        else {
            DNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = current.prev = null;
            size--;
            System.out.println("deleted: " + current.elememt);
            return (E) current.elememt;
        }
    }

    public int getSize() {
        return size;
    }
    
    public void clear(){
        DNode current = head;
        while(current != null){
            current.prev = null;
            current = current.next;
        }
        head = tail = null;
        System.out.println("successfully clear "+size+" node(s)");
        size = 0;
    }
}
