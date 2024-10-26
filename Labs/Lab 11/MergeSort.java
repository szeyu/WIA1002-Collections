/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Lab;

/**
 *
 * @author szeyu
 */
import java.util.Arrays;

public class MergeSort {
    public static void merge(int [] leftArr, int [] rightArr, int [] arr){
        int l = 0, r = 0, k = 0;
        
        while(l < leftArr.length && r < rightArr.length){
            if(leftArr[l] < rightArr[r]){
                arr[k] = leftArr[l];
                l++;
            } else if(rightArr[r] < leftArr[l]){
                arr[k] = rightArr[r];
                r++;
            }
            k++;
        }
        
        while (l < leftArr.length){
            arr[k] = leftArr[l];
            l++;
            k++;
        }
        
        while (r < rightArr.length){
            arr[k] = rightArr[r];
            r++;
            k++;
        }
        
        
    }
    
    public static void mergeSort(int [] arr){
        if(arr.length > 1){
            int[] leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
            mergeSort(leftArr);
            
            int[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            mergeSort(rightArr);
            
            merge(leftArr, rightArr, arr);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 562, 231, 2, 34, 63, 21};
        
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
