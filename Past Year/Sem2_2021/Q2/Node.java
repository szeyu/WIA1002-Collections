/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q2;

/**
 *
 * @author szeyu
 */
public class Node<E> {

    E element;
    Node<E> next;

    public Node(E item) {
        element = item;
        next = null;
    }
}
