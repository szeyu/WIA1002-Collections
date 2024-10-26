/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */

class MinMaxTwoDArray{
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if(list[i][j].compareTo(min) < 0){
                    min = list[i][j];
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if(list[i][j].compareTo(max) > 0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}

public class L2Q6 {
    public static void main(String[] args) {
        Integer[][] numbers = {{4,5,6},{1,2,3}};
        MinMaxTwoDArray minMaxTwoDArray = new MinMaxTwoDArray();
        
        System.out.println("Min: " + minMaxTwoDArray.min(numbers));
        System.out.println("Min: " + minMaxTwoDArray.max(numbers));
    }
}
