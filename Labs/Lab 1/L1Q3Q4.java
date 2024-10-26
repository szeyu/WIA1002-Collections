/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author szeyu
 */
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }
    
    public boolean withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough of balance.");
            return false;
        } else {
            balance -= amount;
        }
        System.out.println(this);
        return true;
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println(this);
    }
    
    @Override
    public String toString(){
        return "Balance : " + balance + "\n" +
                "Monthly Interest : " + getMonthlyInterest() + "\n" +
                "Date of account created : " + getDateCreated();
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
}

class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions;

    public Account1(String name) {
        this.name = name;
    }

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }
    
    public boolean withdraw(double amount, String description){
        if(super.withdraw(amount)){
            Transaction transaction = new Transaction('W',amount,getBalance(),description);
            transactions.add(transaction);
            return true;
        }
        return false;
    }
    
    public void deposit(double amount, String description){
        Transaction transaction = new Transaction('D',amount,getBalance(),description);
        transactions.add(transaction);
    }
    
    
}

public class L1Q3Q4 {
    public static void main(String[] args) {
        Account1 account1 = new Account1("George", 1122, 1000);
        account1.setAnnualInterestRate(1.5);
        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);
        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);
    }
}
