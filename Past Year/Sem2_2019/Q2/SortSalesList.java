/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q2;

/**
 *
 * @author szeyu
 */
public class SortSalesList {
    public static void selectionSort(SalesList[] salesLists){
        for (int i = 0; i < salesLists.length-1; i++) {
            
            String max = salesLists[i].getRegion();
            int maxIndex = i;
            
            for (int j = i+1; j < salesLists.length; j++) {
                SalesList salesList = salesLists[j];
                if(salesList.getRegion().compareTo(max) > 0){
                    max = salesList.getRegion();
                    maxIndex = j;
                }
            }
            
            SalesList temp = salesLists[i];
            salesLists[i] = salesLists[maxIndex];
            salesLists[maxIndex] = temp;
            
        }
    }
    
    public static void insertionSort(SalesList[] salesLists){
        for (int i = 1; i < salesLists.length; i++) {
            SalesList current = salesLists[i];
            
            int k;
            for (k = i-1; k >= 0 && salesLists[k].getSalesAmount() > current.getSalesAmount(); k--){
                salesLists[k+1] = salesLists[k];
            }
            
            salesLists[k+1] = current;            
        }
    }
    
    public static void bubbleSort(SalesList[] salesLists){
        for (int i = 0; i < salesLists.length-1; i++) {
            for (int j = 0; j < salesLists.length-1-i; j++) {
                if(salesLists[j].getRepresentativeName().compareTo(salesLists[j+1].getRepresentativeName()) > 0){
                    SalesList temp = salesLists[j];
                    salesLists[j] = salesLists[j+1];
                    salesLists[j+1] = temp;
                }
            }
            
        }
    }
    
    public static void printData(SalesList[] salesLists){
        for (SalesList salesList : salesLists) {
            System.out.println(salesList);
        }
    }
    
    public static void main(String[] args) {
        SalesList[] salesLists = new SalesList[7];
        salesLists[0] = new SalesList("Asia",450,"Ahmad");
        salesLists[1] = new SalesList("Europe",518,"Hemish");
        salesLists[2] = new SalesList("Europe",650,"Banny");
        salesLists[3] = new SalesList("Greenland",200,"Ain");
        salesLists[4] = new SalesList("Asia",390,"Ali");
        salesLists[5] = new SalesList("Greenland",670,"Ben");
        salesLists[6] = new SalesList("Asia",790,"Lee");
        
        System.out.println("Original Data:");
        printData(salesLists);
        
        System.out.println();
        
        System.out.println("Sorting Result on Region using SelectionSort:");
        selectionSort(salesLists);
        printData(salesLists);
        
        
        System.out.println();
        
        System.out.println("Sorting Result on Region using InsertionSort:");
        insertionSort(salesLists);
        printData(salesLists);
        
        
        System.out.println();
        
        System.out.println("Sorting Result on Region using BubbleSort:");
        bubbleSort(salesLists);
        printData(salesLists);
        
        
    }
}
