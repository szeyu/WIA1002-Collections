/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */

class CompareMax{
    public static <E extends Comparable<E>> E findMax(E no1, E no2, E no3){
        E max = no1;
        if(max.compareTo(no2) < 0){
            max = no2;
        }
        if(max.compareTo(no3) < 0){
            max = no3;
        }
        return max;
    } 
}

public class L2Q2 {
    public static void main(String[] args) {
        CompareMax compareMax = new CompareMax();
        int no1 = 2;
        int no2 = 6;
        int no3 = 3;
        int max = compareMax.findMax(no1, no2, no3);
        System.out.printf("The maximum of number {%d, %d, %d} is %d%n", no1,no2,no3,max);
    }
}
