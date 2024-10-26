/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q3;

/**
 *
 * @author szeyu
 */

import java.util.ArrayList;

public class ArrayListQueue<E> {
    private int size = 10;
    private int front = 0;
    private int end = 0;
    private ArrayList<E> list = new ArrayList<>(size);
    
    public boolean enqueue(E o){
        boolean success = false;
        if(end < size){
            success = list.add(o);
            end++;
        }
        return success;
    }
    
    public E dequeue(){
        if(front >= end){
            return null;
        }
        E ele = list.get(front);
        front++;
        return ele;
    }
    
    public String queueToString(){
        StringBuilder strRet = new StringBuilder();
        for(int i = front; i < end; i++){
            strRet.append(list.get(i));
        }
        
        return strRet.toString();
    }
    
    public String allToString(){
        return "ALL : " + list.toString();
    }
}
