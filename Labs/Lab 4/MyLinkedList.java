/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.Lab4;

/**
 *
 * @author szeyu
 */
public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;
    
    public MyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }
    
    public <E> void addFirst(E e){
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        if(size == 0){
            tail = newNode;
        }
        size++;
    }
    
    public <E> void addLast(E e){
        Node<E> newNode = new Node<E>(e);
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
    
    public <E> void add(int index, E e){
        Node<E> newNode = new Node<E>(e);
        if(size == 0){
            head = tail = newNode;
        } else if(index <= 0){
            addFirst(e);
        } else if(index >= size){
            addLast(e);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
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
            while (current.next != tail) {
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
        } else if(index >= size - 1){
            return removeLast();
        } 
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;            
        }
        Node node = current.next;
        current.next = current.next.next;
        size--;
        return node;
    }
    
    public boolean contains(E e){
        Node current = head;
        for (int i = 1; i < size; i++) {
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        if(index <= 0){
            return getFirst();
        } else if(index >= size - 1){
            return getLast();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E) current.element;
    }
    
    public E getFirst(){
        return (E) head.element;
    }
    
    public E getLast(){
        return (E) tail.element;
    }
    
    public int indexOf(E e){
        Node current = head;
        for (int i = 0; i < size; i++) {
            if(current.element.equals(e)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        MyLinkedList<E> reversedLl = getReverse();
        return size - reversedLl.indexOf(e) - 1;
    }
    
    public E set(int index, E e){
        if(index < 0){
            index = 0;
        } else if(index >= size - 1){
            index = size-1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.element = e;
        return (E) current.element;
    }
    
    public void clear(){
        head = tail = null;
        size = 0;
    }
    
    public void print(){
        Node current = head;
        for (int i = 1; i < size; i++) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println(current.element);
    }
    
    public MyLinkedList<E> getReverse(){
        MyLinkedList<E> reversedLl = new MyLinkedList<>();
        Node current = head;
        for (int i = 1; i < size; i++) {
            reversedLl.addFirst(current.element);
            current = current.next;
        }
        reversedLl.addFirst(current.element);
        return reversedLl;
    }
    
    public void reverse(){
        MyLinkedList<E> reversedLl = getReverse();
        reversedLl.print();
    }
    
    public E getMiddleValue(){
        if(size == 0){
            return null;
        }
        int mid = (size-1) / 2;
        Node current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;            
        }
        return (E) current.element;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
    
    
}
