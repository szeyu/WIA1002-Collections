/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q1;

/**
 *
 * @author szeyu
 */
public class MyLinkedList <E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public MyLinkedList(){
        head = tail = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        if(size == 0){
            head = tail = newNode;
            size++;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(size == 0){
            head = tail = newNode;
            size++;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public E removeFirst(){
        Node<E> node = head;
        if(node == null){
            return null;
        }
        
        if(size == 1){
            head = tail = null;
            size--;
            return node.element;
        }
        
        head = head.next;
        node.next = null;
        size--;
        return node.element;
    }
    
    @Override
    public String toString(){
        StringBuffer transversal = new StringBuffer();
        transversal.append("[size=").append(size).append("]");
        
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            transversal.append(" >> ").append(current.element);
            current = current.next;
        }
        return transversal.toString();
    }
}
