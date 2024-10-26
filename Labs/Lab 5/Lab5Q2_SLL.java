/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class Lab5Q2_SLL<E> {
    private SNode head;
    private SNode tail;
    private int size = 0;
    
    public void add(E e){
        SNode node = new SNode(e);
        
        if(size == 0){
            head = tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        
        size++;
    }
    
    public void removeElement(E e){
        SNode current = head;
        
        if(current.element.equals(e)){
            head = head.next;
            if(head == null)
                tail = null;
            size--;
            return;
        }
        while (current.next != null){
            if(current.next.element.equals(e)){
                current.next = current.next.next;
                size--;
                return;
            }
        }
    }
    
    public void printList(){
        if(size == 0)
            return;
        SNode current = head;
        for(int i = 1; i < size; i++){
            System.out.print(current.element+", ");
        }
        System.out.println(current.element + ".");
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        SNode current = head;
        while(current != null){
            if(current.element.equals(e)){
                return true;
            }
        }
        return false;
    }
    
    public void replace(E e, E newE){
        SNode current = head;
        while(current != null){
            if(current.element.equals(e)){
                current.element = newE;
                return;
            }
        }
    }
    
}
