/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6.Lab6;

import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        
        // 1)
        // b)
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println(stack.search('b'));
        System.out.println(stack.search('k'));
        
        // c)
        stack.push('1');
        stack.push('2');
        stack.push('3');
        System.out.println(stack.toString());
        System.out.println(stack.search('6'));
        
        
        // 2)
        // a)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value : ");
        Character userIn = input.nextLine().charAt(0);
        stack.push(userIn);
        System.out.println("Size: " + stack.getSize());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
