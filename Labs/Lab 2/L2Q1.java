/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */
class MyGeneric<T>{
    private T e;
    
    public MyGeneric(){
        
    }

    public MyGeneric(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
    
    
}

public class L2Q1 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>("string");
        MyGeneric<Integer> intObj = new MyGeneric<>(10);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
