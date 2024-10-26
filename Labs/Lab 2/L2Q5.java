/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */

class Circle{
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }
        return max;
    }
}

class FindMax{
    public static <E extends Comparable<E>> E findMax(E[] list){
        Circle circle = new Circle();
        return circle.max(list);
    }
}

public class L2Q5 {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red", "green", "blue"};
        Double[] c = {3.0, 2.9, 5.9};
        
        FindMax max = new FindMax();
        System.out.println(max.findMax(a));
        System.out.println(max.findMax(b));
        System.out.println(max.findMax(c));
    }
}
