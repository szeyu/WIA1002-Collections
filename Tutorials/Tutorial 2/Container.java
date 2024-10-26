/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */
public class Container <T>{
    private T t;
    
    public Container(){
        
    }
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> contianer1 = new Container<Integer>();
        Container<String> contianer2 = new Container<String>();
        
        contianer1.add(50);
        contianer2.add("Java");
        
        System.out.println("Container 1: " + contianer1.retrieve());
        System.out.println("Container 2: " + contianer2.retrieve());
    }
}
