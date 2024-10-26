/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q1;

/**
 *
 * @author szeyu
 */
public class Node<E> {
    protected E element;
    protected Node<E> next;
    
    public Node(E element){
        this.element = element;
        next = null;
    }
}
