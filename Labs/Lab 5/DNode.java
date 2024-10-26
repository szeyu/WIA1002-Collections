/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class DNode<E> {
    protected DNode next;
    protected DNode prev;
    protected E elememt;
    
    public DNode(){
        next = prev = null;
    }
    
    public DNode(E element){
        next = prev = null;
        this.elememt = element;
    }
}
