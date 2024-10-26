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
public class SelectionSort {
    public void selectionSortSmallest(int [] arr){
        int settledElement = 0;
        while(settledElement < arr.length){
            
            // find the min index for the range of arr
            int tempMinIndex = settledElement;
            for (int i = settledElement; i < arr.length; i++) {
                if(arr[i] < arr[tempMinIndex]){
                    tempMinIndex = i;
                }
            }
            
            int temp = arr[settledElement];
            arr[settledElement] = arr[tempMinIndex];
            arr[tempMinIndex] = temp;
            
            settledElement++;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public void selectionSortLargest(int [] arr){
        int settledElement = 0;
        while(settledElement < arr.length){
            
            // find the max index for the range of arr
            int tempMaxIndex = settledElement;
            for (int i = settledElement; i < arr.length; i++) {
                if(arr[i] > arr[tempMaxIndex]){
                    tempMaxIndex = i;
                }
            }
            
            int temp = arr[settledElement];
            arr[settledElement] = arr[tempMaxIndex];
            arr[tempMaxIndex] = temp;
            
            settledElement++;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        SelectionSort ssort = new SelectionSort();
        int[] arr = {45, 7, 2, 8, 19, 3};
        
        ssort.selectionSortSmallest(arr);
        ssort.selectionSortLargest(arr);
    }
}
