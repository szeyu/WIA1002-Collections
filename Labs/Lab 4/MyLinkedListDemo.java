/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.Lab4;

/**
 *
 * @author szeyu
 */
public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<Character> ll = new MyLinkedList<>();
        
        ll.addLast('a');
        ll.addLast('b');
        ll.addLast('c');
        ll.addLast('d');
        ll.addLast('e');
        
        ll.print();
        
        System.out.println("Reverse");
        ll.reverse();
        System.out.println("Size : " + ll.getSize());
        System.out.println("First : " + ll.getFirst());
        System.out.println("Last : " + ll.getLast());
        
        ll.remove(2);
        ll.print();
        System.out.println("second index value : " + ll.get(1));
        System.out.println("third index value : " + ll.get(2));
        
        System.out.println("Contain c? " + ll.contains('c'));
        System.out.println("Contain e? " + ll.contains('e'));
        ll.print();
        
        ll.removeLast();
        ll.print();
        System.out.println("Index of 'a' : " + ll.indexOf('a'));
        System.out.println("Index of 'g' : " + ll.indexOf('g'));
        
        ll.addLast('a');
        ll.print();
        
        System.out.println("Last Index of 'a' : " + ll.lastIndexOf('a'));
        System.out.println(ll.getHead().element);
        System.out.println(ll.getTail().element);
        System.out.println(ll.getSize());
        System.out.println("Mid : " + ll.getMiddleValue());
        
        ll.remove(2);
        ll.print();
        
        ll.remove(1);
        ll.print();
        System.out.println("Mid : " + ll.getMiddleValue());
        
        ll.remove(1);
        ll.addFirst('j');
        ll.addLast('a');
        ll.addLast('a');
        ll.add(2, 'v');
        ll.removeLast();
        ll.print();
        System.out.println("Mid : " + ll.getMiddleValue());
    }
}
