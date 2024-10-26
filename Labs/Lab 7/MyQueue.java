/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.LabQueue;

import Week4.SampleCode.MyLinkedList;

/**
 *
 * @author szeyu
 */
public class MyQueue<E> {
    private MyLinkedList<E> linkedList;
    
    public MyQueue(E[] e){
        linkedList = new MyLinkedList<>();
        for (E obj : e) {
            linkedList.addLast(obj);
        }
    }
    
    public MyQueue(){
        linkedList = new MyLinkedList<>();
    }
    
    public void enqueue(E e){
        linkedList.addLast(e);
    }
    
    public E dequeue(){
        return linkedList.removeFirst();
    }
    
    public E getElement(int i){
        return linkedList.get(i);
    }
    
    public E peek(){
        return linkedList.getFirst();
    }
    
    public int getSize(){
        return linkedList.size();
    }
    
    public boolean contains(E e){
        return linkedList.contains(e);
    }
    
    public boolean isEmpty(){
        return linkedList.size() == 0;
    }
    
    public String toString(){
        return "Queue: " + linkedList.toString();
    }
}
