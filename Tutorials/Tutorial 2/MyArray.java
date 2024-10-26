/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;
/**
 *
 * @author szeyu
 */

import java.util.ArrayList;
public class MyArray {
    public static void listAll(ArrayList<?> list){
        for (Object element : list){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // a
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // b
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jane");
        names.add("Tom");
        names.add("Bob");
        
        // c
        ArrayList<Character> alphabets = new ArrayList<Character>();
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        
        listAll(numbers);
        listAll(names);
        listAll(alphabets);
    }
}
