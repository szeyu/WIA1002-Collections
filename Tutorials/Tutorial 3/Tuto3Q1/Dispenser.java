/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Tuto3Q1;

/**
 *
 * @author szeyu
 */

public enum Dispenser {
    CANDY("Candy", 1.00),
    CHIP("Chip", 3.80),
    GUM("Gum", 2.50),
    COOKIES("Cookies", 2.50);

    private String item;
    private double price;

    Dispenser(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public void dispenseItem() {
        System.out.println(item + " is dispensed!");
    }
   
    @Override
    public String toString() {
        return "item : " + item + "\nprice : " + price;
    }
    
}
