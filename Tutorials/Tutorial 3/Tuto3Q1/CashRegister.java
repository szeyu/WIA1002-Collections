/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Tuto3Q1;

/**
 *
 * @author szeyu
 */
public class CashRegister {
    private double balance;
    private double sales;
    
    public CashRegister(){
        this.balance = 1000;
        this.sales = 0;
    }
    
    public CashRegister(double balance){
        this.balance = balance;
        this.sales = 0;
    }

    public double getSales() {
        return sales;
    }

    public boolean payMoney(double payAmount, double itemPrice){
        if(payAmount < itemPrice){
            System.out.println("Not enough of money..");
            return false;
        } else{
            double excess = payAmount - itemPrice;
            if(excess > balance){
                System.out.println("Sorry, this machine does not have enough money to pay back you");
                return true;
            } else {
                balance += itemPrice;
                sales += itemPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Returning excess money : RM" + excess);
                return true;
            }
        }
    }

    @Override
    public String toString() {
        return "Sales : RM" + String.format("%.2f",sales);
    }
}
