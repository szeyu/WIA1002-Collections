/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6.Lab6;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author szeyu
 */
public class MyStack<E> {
    private ArrayList<E> stack = new ArrayList<>();
    
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
        if(isEmpty())
            throw new EmptyStackException();
        
        E top = stack.get(stack.size() - 1);
        stack.remove(getSize() - 1);
        return top;
    }
    
    public E peek(){
        if(isEmpty())
            throw new EmptyStackException();
        
        E top = stack.get(getSize() - 1);
        return top;
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return getSize() == 0;
    }
    
    public String toString(){
        return "Stack : " + stack.toString();
    }
    
    public boolean search(E o){
        for (E e : stack) {
            if(e.equals(o))
                return true;
        }
        
        return false;
    }
}
