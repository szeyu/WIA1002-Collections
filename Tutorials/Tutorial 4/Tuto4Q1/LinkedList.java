/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.Tuto4Q1;

/**
 *
 * @author szeyu
 */
public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public <E> void addFirst(E element){
        Node<E> newNode = new Node<E>(element);
        newNode.next = head;
        head = newNode;
        if(size == 0){
            tail = newNode;
        }
        size++;
    }
    
    public <E> void addLast(E element){
        Node<E> newNode = new Node<E>(element);
        if(size == 0){
            head = tail = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < size; i++) {
                current = current.next;            
            }
            current.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public <E> void add(int index, E element){
        Node<E> newNode = new Node<E>(element);
        if(size == 0){
            head = tail = newNode;
        } else if(index <= 0){
            addFirst(element);
        } else if(index >= size){
            addLast(element);
        } else {
            Node current = head;
            for (int i = 2; i < index; i++) {
                current = current.next;            
            }
            Node tempNode = current.next;
            current.next = newNode;
            newNode.next = tempNode;
        }
        
        size++;
    }
    
    public Node removeFirst(){
        if(size == 0){
            return null;
        } 
        
        Node node = head;
        head = head.next;
        if(size == 1){
            tail = null;
        }
        
        size--;
        return node;        
    }
    
    public Node removeLast(){
        if(size == 0){
            return null;
        }
        
        Node node = tail;
        if(size == 1){
            head = tail = null;
        } else {
            Node current = head;
            for (int i = 2; i < size; i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        
        size--;
        return node;
    }
    
    public Node remove(int index){
        if(size == 0){
            return null;
        } else if(index <= 0){
            return removeFirst();
        } else if(index >= size){
            return removeLast();
        } 
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;            
        }
        Node node = current.next;
        current.next = current.next.next;
        size--;
        return node;
    }
    
    public void iterate(){
        Node current = head;
        for (int i = 1; i < size; i++) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println(current.element);
    }
}
