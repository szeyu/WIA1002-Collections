/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Lab;

import java.util.Arrays;

/**
 *
 * @author szeyu
 */
public class InsertionSort {
    public static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for(k = i-1; k >= 0 && arr[k] > currentElement; k--){
                arr[k+1] = arr[k];
            }
            
            arr[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
        
        insertionSort(arr);
    }
}
