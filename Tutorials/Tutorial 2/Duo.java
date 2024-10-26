/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */
public class Duo <A, B> {
    private A first;
    private B second;
    
    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    public static void main(String[] args) {
        Duo<String,Integer> sideShape = new Duo<String,Integer>("side shape", 5);
        Duo<Double,Double> points = new Duo<Double,Double>(5.0, 5.0);
    }
}
