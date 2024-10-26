/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Lab;

/**
 *
 * @author szeyu
 */
public class Exponent {
    public static long exponent(int x, int m) {
        if(m <= 1)
            return x;
        return x * exponent(x, m-1);
    }
    
    public static void main(String[] args) {
        System.out.println(exponent(5, 2));
    }
}
