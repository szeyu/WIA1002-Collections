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
public class Tuto2Q7 {
    public static <T> void allTransportation(ArrayList<? extends T> list1, ArrayList<T> list2) { }
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        allTransportation(vehicle, transportation);
    }
}
