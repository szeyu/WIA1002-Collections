/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.Tuto4Q1;

/**
 *
 * @author szeyu
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.addLast('a');
        ll.addLast('z');
        ll.addFirst('b');
        ll.add(1,'c');
        ll.add(1,'x');
        ll.iterate();
        
        ll.removeFirst();
        ll.removeLast();
        
        ll.iterate();
        
        ll.remove(1);
        
        ll.iterate();
    }
}
