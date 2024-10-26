/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> DLL = new DoublyLinkedList<>();
        
        DLL.addFirst(1);
        DLL.addLast(100);
        DLL.add(2, 2);
        //DLL.remove(3);
        DLL.iterateForward();
        DLL.iterateBackward();
        System.out.println("size of current Doubly Linked List: " + DLL.getSize());
        DLL.clear();
        System.out.println("size of current Doubly Linked List: " + DLL.getSize());
        
    }
}
