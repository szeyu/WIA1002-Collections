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
public class Tuto2Q8 {
    public static void displayList(ArrayList<?> list){
        for (Object element : list){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<String> numOfCars = new ArrayList<>();
        ArrayList<Object> milesPerHour = new ArrayList<>();
        
        displayList(numOfCars);
        displayList(milesPerHour);
    }
}
