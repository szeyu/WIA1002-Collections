/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Tuto;

/**
 *
 * @author szeyu
 */
public class Factorial {

    public static int f(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(1));
    }
}
