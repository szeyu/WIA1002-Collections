/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class SNode<E> {
    protected E element;
    protected SNode next;
    
    public SNode(){
        next = null;
    }
    
    public SNode(E e){
        next = null;
        element = e;
    }
}
