/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Lab3;

/**
 *
 * @author szeyu
 */
public class ArrayBagDemo {
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i] + " ");
            aBag.add(content[i]);
        }
        System.out.println();
    }
    
    private static void displayBag(BagInterface<String> aBag){
        Object[] array = aBag.toArray();
        System.out.println("The bag contais " + aBag.getCurrentSize() + " string(s), as follows:");
        for (int i = 0; i < aBag.getCurrentSize(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A","A","B","A","C","A"};
        String[] contentsOfBag2 = {"A","B","A","C","B","C","D","another string"};
        
        System.out.println("bag1:");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        
        System.out.println();
        
        System.out.println("bag2:");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        
        System.out.println();
        
        System.out.println("bag3, test the method union of bag1 and bag2:");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        
        System.out.println();
        
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        
        System.out.println();
        
        System.out.println("bag5, test the method difference of bag1 and bag2:");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
        
    }
}
