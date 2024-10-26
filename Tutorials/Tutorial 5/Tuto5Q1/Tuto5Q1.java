/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Tuto5Q1;

/**
 *
 * @author szeyu
 */
public class Tuto5Q1 {
    // a) 
    /*
    
    10 else if(index==0) { ---> if the index it chooses is the first index
        11 temp=head; ---> set the temp to hold the first node
        12 head.element=e; ---> set the head value to e
        13 return temp.element; ---> return the initial value of head
    14 }else{
        15 for (int i = 1; i < index; i++) { ---> iterate until before the index
            16 current=current.next;
        17 }
        18 temp=current.next; ---> temp is the node at the index
        19 current.next.element=e; ---> set the value at that index to element
        20 return temp.element; ---> return the node original value
    21 }
    
    */
    
    
    // b)
    /*
    xyz() is to replace the value at certain index with another value
    */
    
    
    // c)
    /*
    
    if(index<0 || index >= size) 
        return null;
    
    else if(index == size-1) {
        temp = tail;
        tail.element = e;
        return temp.element;
    }

    */
}
