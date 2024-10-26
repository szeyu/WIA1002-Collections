/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author szeyu
 */

abstract class Vehicle{
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
            if(currentSpeed > maxSpeed){
                currentSpeed = maxSpeed;
            }
            System.out.println(this);
        }
    }
    
    @Override
    public String toString(){
        return "Current speed: " + currentSpeed;
    }
}

class Perodua extends Vehicle{
    public Perodua(double maxSpeed){
        super(maxSpeed);
    }
    
    public void accelerate(){
        currentSpeed += 2.7;
    }
}

class Tesla extends Vehicle{
    public Tesla(double maxSpeed){
        super(maxSpeed);
    }
    
    public void accelerate(){
        currentSpeed += 5.5;
    }
}

public class Tuto1Q4 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Perodua(100);
        Vehicle vehicle2 = new Tesla(200);

        System.out.println("Perodua");
        vehicle1.pedalToTheMetal();
        System.out.println("");
        System.out.println("Tesla");
        vehicle2.pedalToTheMetal();
        
    }
}
