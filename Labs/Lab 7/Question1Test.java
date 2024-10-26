/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.LabQueue;

/**
 *
 * @author szeyu
 */
public class Question1Test {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println(fruitQ.toString());
        System.out.println(fruitQ.peek());
        fruitQ.dequeue();
        System.out.println(fruitQ.getElement(1));
        System.out.println(fruitQ.contains("Cherry"));
        System.out.println(fruitQ.contains("Durian"));
        System.out.println(fruitQ.isEmpty());
    }
}
