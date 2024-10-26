/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q3;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */
public class MyStack {
    ArrayList<Move> moveStack;
    
    public MyStack(){
        moveStack = new ArrayList<>();
    }
    
    public void push(Move move){
        moveStack.add(move);
    }
    
    public Move pop(){
        if(moveStack.isEmpty()){
            return null;
        }
        
        Move lastMove = peek();
        moveStack.remove(moveStack.size()-1);
        return lastMove;
    }
    
    public Move peek(){
        if(moveStack.isEmpty()){
            return null;
        }
        
        return moveStack.get(moveStack.size()-1);
    }
    
    public int getSize(){
        return moveStack.size();
    }
    
    public boolean isEmpty(){
        return moveStack.size() == 0;
    }
}
