/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class PrintPages {

    public static void main(String[] args) {
        SpecialLL<Integer> bookPage = new SpecialLL<>();
        ArrayList<Integer> selectedList = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting page: ");
        
        int start = input.nextInt();
        System.out.print("Enter number of pages: ");
        
        int page = input.nextInt();
        // add 2 lines of code here to
        // insert values to bookPage
        for (int pageNum = start; pageNum < (page + start); pageNum++) 
            bookPage.addLast(pageNum);
        
        
        selectedList = bookPage.getEven();
        
        // insert multiple lines of code here
        bookPage.printOdd();
        System.out.print(" ");
        for (int i = selectedList.size()-1; i >= 0; i--) {
            System.out.print(selectedList.get(i) + " ");
        }
        System.out.println();
    }
}
