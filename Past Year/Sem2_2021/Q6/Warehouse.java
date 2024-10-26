/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q6;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author szeyu
 */
public class Warehouse {
    
    static int sortTime = 0;

    private static void merge(int[] left, int[] right, int[] arr) {
        int k = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[k] = left[l];
                l++;
            } else {
                arr[k] = right[r];
                r++;
            }
            k++;
            sortTime += 6;
        }

        while (l < left.length) {
            arr[k] = left[l];
            l++;
            k++;
            sortTime += 6;
        }
        
        while (r < right.length) {
            arr[k] = right[r];
            r++;
            k++;
            sortTime += 6;
        }

    }

    private static void mergeSort(int[] parcels) {
        if (parcels.length <= 1) {
            return;
        }
        int[] leftParcels = Arrays.copyOfRange(parcels, 0, parcels.length / 2);
        int[] rightParcels = Arrays.copyOfRange(parcels, parcels.length / 2, parcels.length);

        mergeSort(leftParcels);
        mergeSort(rightParcels);
        merge(leftParcels, rightParcels, parcels);
    }
    
    private static void bubbleSort(int [] parcels){
        for (int i = 0; i < parcels.length-1; i++) {
            for (int j = i; j < parcels.length-i-1; j++) {
                if(parcels[j] > parcels[j+1]){
                    int temp = parcels[j];
                    parcels[j] = parcels[j+1];
                    parcels[j+1] = temp;
                    sortTime += 6;
                }
            }
        }
    }

    private static int binarySearch(int parcelTag, int[] parcels) {
        mergeSort(parcels);
//        bubbleSort(parcels);
        printParcels(parcels);
        
        int time = sortTime;
        int l = 0;
        int r = parcels.length-1;
        while(l <= r){
            time += 15;
            int m = l + (r-l)/2;
            
            if(parcelTag == parcels[m]){
                System.out.println(parcelTag + " at Position: " + m);
                return time;
            } else if(parcelTag < parcels[m]){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("");
        return time;
    }

    public static int linearSearch(int parcelTag, int[] parcels) {
        int time = 0;
        for (int i = 0; i < parcels.length; i++) {
            time += 15;
            if (parcelTag == parcels[i]) {
                System.out.println(parcelTag + " at Position: " + i);
                return time;
            }
        }

        return time;
    }

    private static void printParcels(int[] parcels) {
        for (int parcel : parcels) {
            System.out.print(parcel + " ");
        }
    }

    public static void main(String[] args) {

        // create parcels
        int[] parcels = new int[1000];
        for (int i = 0; i < 1000; i++) {
            parcels[i] = i;
        }

        // shuffle parcels
        Random random = new Random();
        for (int i = 1000 - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = parcels[i];
            parcels[i] = parcels[j];
            parcels[j] = temp;
        }

        // Print the shuffled array
        printParcels(parcels);
        System.out.println();

        System.out.println("Time needed for Linear Search : " + (double)linearSearch(44, parcels)/60 + " min");
        System.out.println();
        System.out.println("Time needed for Binary Search : " + (double)binarySearch(5, parcels)/60 + " min");
    
        
    }
}
