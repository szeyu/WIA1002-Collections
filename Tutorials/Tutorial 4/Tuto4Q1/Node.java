/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.Tuto4Q1;

/**
 *
 * @author szeyu
 */
public class Node<E> {
    protected Node next;
    protected E element;
    
    public Node(E element){
        next = null;
        this.element = element;
    }
}
