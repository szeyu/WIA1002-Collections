/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class SList<E> {
    private SNode head;
    private SNode tail;
    private int size;
    
    public SList(){
        size = 0;
        head = tail = null;
    }
    
    // Append a new element at the end of the list. 
    public void appendEnd(E e){
        SNode node = new SNode(e);
        if(size == 0){
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;        
    }
    
    // Eliminate the first element in the list
    public E removeInitial(){
        if(size == 0){
            return null;
        }
        
        SNode tempNode = head;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        
        return (E) tempNode.element;
    }
    
    // Search for an element and returns true if this list contains the searched element
    public boolean contains(E e){
        SNode current = head;
        while(current != null){
            if(current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }
    
    // Empty all elements in the list and return a statement that reports that the list is empty
    public void clear(){
        head = tail = null;
        size = 0;
        System.out.println("The list is now empty");
    }
    
    // Display all values from the list in a successive order
    public void display(){
        if(size == 0)
            return;
        SNode current = head;
        for(int i = 1; i < size; i++){
            System.out.print(current.element + "->");
            current = current.next;
        }
        System.out.println(current.element);
        
        for(SNode tmp = head; tmp != null; tmp = tmp.next){
            System.out.print(tmp.element+" ");
        }
        System.out.println("");
    }
}
