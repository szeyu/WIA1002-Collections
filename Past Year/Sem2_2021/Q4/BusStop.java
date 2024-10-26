/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q4;

/**
 *
 * @author szeyu
 */
import java.util.PriorityQueue;

public class BusStop {
    public static void main(String[] args) {
        PriorityQueue<Passenger> bus = new PriorityQueue<>();
        bus.add(new Passenger("Susan", 0.9));
        bus.add(new Passenger("Jack", 5.5));
        bus.add(new Passenger("Benjamin", 1.6));
        bus.add(new Passenger("Rachel", 3.8));
        bus.add(new Passenger("Samuel", 4.1));
        bus.add(new Passenger("Kenneth", 2.6));
        
        System.out.println("Passenger Drop-off List");
        int n = bus.size();
        for (int i = 0; i < n; i++) {
            Passenger dropPassenger = bus.poll();
            String stop = "Stop ";
            if(dropPassenger.getDistance() < 1.5){
                stop += "A";
            } else if(dropPassenger.getDistance() < 2.5){
                stop += "B";
            } else if(dropPassenger.getDistance() < 3.5){
                stop += "C";
            } else if(dropPassenger.getDistance() < 4.5){
                stop += "D";
            } else
                stop += "E";
            
            System.out.println(stop + ": " + dropPassenger.getName());
        }
        
        
    }
}
