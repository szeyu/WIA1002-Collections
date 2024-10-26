/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6.Lab6;

/**
 *
 * @author szeyu
 */
public class L6Q3_sum {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack.toString());
        
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println("Sum : " + sum);
    }
}
