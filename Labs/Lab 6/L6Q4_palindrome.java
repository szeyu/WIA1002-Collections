/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6.Lab6;

/**
 *
 * @author szeyu
 */
public class L6Q4_palindrome {
    public static void main(String[] args) {
        MyStack<Character> leftStack = new MyStack<>();
        MyStack<Character> rightStack = new MyStack<>();
        
        String inputStr = "HelddeleH";
        for (int i = 0; i < inputStr.length(); i++) {
            leftStack.push(inputStr.charAt(i));
        }
        
        for (int i = 0; i < inputStr.length()/2; i++) {
            rightStack.push(leftStack.pop());
        }
        
        // if the string length is odd number
        if(leftStack.getSize() > rightStack.getSize()){
            leftStack.pop();
        }
        
        while(!leftStack.isEmpty()){
            if(!leftStack.pop().equals(rightStack.pop())){
                System.out.println("Not a palindrome");
                break;
            }
        }
        if(leftStack.isEmpty()){
            System.out.println("Is a palindrome");
        }
    }
}
