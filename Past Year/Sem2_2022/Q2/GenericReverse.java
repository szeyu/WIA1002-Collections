/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author szeyu
 */
public class GenericReverse<E> {
    ArrayList<E> stack;
    private int size;
    
    public GenericReverse(){
        stack = new ArrayList<>();
        size = 0;
    }
    
    public GenericReverse(E[] obj){
        stack = new ArrayList<>();
        size = 0;
        for (E e : obj) {
            this.push(e);
        }
    }
    
    public E peek(){
        if(size == 0){
            return null;
        }
        return stack.get(size-1);
    }
    
    public void push(E e){
        stack.add(e);
        size++;
    }
    
    public E pop(){
        if(size == 0){
            return null;
        }
        E top = peek();
        stack.remove(size-1);
        size--;
        return top;
    }
    
    private GenericReverse<E> reverse(GenericReverse<E> reversedObj, int size){
        if(size == 0){
            return reversedObj;
        }
        reversedObj.push(this.pop());
        
        return reverse(reversedObj, --size);
    }
    
    public void reverse(){
        this.stack = reverse(new GenericReverse<>(), size).stack;
    }
    
    @Override
    public String toString(){
        return Arrays.deepToString(stack.toArray());
    }
    
    public static void main(String[] args) {
        String[] computer = {"Switch", "Motherboard", "RAM", "SSD", "CPU", "GPU", "Router"};
        Integer[] number = {17, 21, 45, 23, 1, 99, 16};
        
        GenericReverse test1 = new GenericReverse(computer);
        System.out.println(test1);
        System.out.println("after reverse");
        test1.reverse();
        System.out.println(test1);
        System.out.println();
        
        GenericReverse test2 = new GenericReverse(number);
        System.out.println(test2);
        System.out.println("after reverse");
        test2.reverse();
        System.out.println(test2);
    }
}
