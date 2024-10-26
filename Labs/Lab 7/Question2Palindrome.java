/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.LabQueue;

/**
 *
 * @author szeyu
 */
public class Question2Palindrome {
    public static void main(String[] args) {
        MyQueue<Character> queue = new MyQueue<>();
        String word = "020";
        
        for (int i = 0; i < word.length()/2; i++) {
            Character ch = word.charAt(i);
            queue.enqueue(ch);
        }
        
        boolean flag = true;
        for (int i = word.length()-1; i >= (word.length() + 1)/2; i--) {
            Character ch = word.charAt(i);
            if(ch != queue.dequeue()){
                System.out.println("Not a palindrome");
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("A plaindrome");
        
    }
}
