/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author szeyu
 */
interface Account{
    public int deposit(int amount);
    public boolean withdraw(int amount);
}

class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    
    public boolean withdraw(int amount){
        if(amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }
    
    public String toString(){
        return "Balance: " + balance;
    }
}

public class Tuto1Q5 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100);
        System.out.println(account1);
        account1.deposit(100);
        System.out.println(account1);
        account1.withdraw(50);
        System.out.println(account1);
        account1.withdraw(200);
        System.out.println(account1);
        
    }
}
