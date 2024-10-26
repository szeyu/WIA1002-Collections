/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2021.Q4;

/**
 *
 * @author szeyu
 */
public class Passenger implements Comparable<Passenger>{
    private String name;
    private double distance;

    public Passenger(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }
    
    @Override
    public int compareTo(Passenger anotherPassenger){
        if(this.distance > anotherPassenger.distance){
            return 1;
        } else if(this.distance < anotherPassenger.distance){
            return -1;
        } else
            return 0;
    }
}
