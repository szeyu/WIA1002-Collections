/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Tuto3Q1;

import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class CandyMachine {
    public static void displayDispenser(Dispenser[] dispensers, CashRegister cashRegister){
        for (int i = 0; i < dispensers.length; i++) {
            Dispenser dispenser = dispensers[i];
            System.out.println();
            System.out.println("Dispenser " + (i+1));
            System.out.println(dispenser);
        }
        
        System.out.println();
    }
    
    public static void itemSelection(Dispenser dispenser, CashRegister cashRegister){
        System.out.println(dispenser);
        Scanner in = new Scanner(System.in);
        System.out.print("Pay me : RM");
        double payAmount = in.nextDouble();
        if(cashRegister.payMoney(payAmount, dispenser.getPrice())){
            dispenser.dispenseItem();
        } else {
            System.out.println("See you next time");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Dispenser[] dispensers = new Dispenser[4];
        CashRegister cashRegister = new CashRegister();

        dispensers[0] = Dispenser.CANDY;
        dispensers[1] = Dispenser.CHIP;
        dispensers[2] = Dispenser.GUM;
        dispensers[3] = Dispenser.COOKIES;
        
        displayDispenser(dispensers, cashRegister);
        
        System.out.printf("Total Sales = RM%.2f%n",cashRegister.getSales());
        
        int dispenserSelection = 0;
        do {            
            System.out.print("Dispenser (1-4) : ");
            dispenserSelection = in.nextInt();
        } while (dispenserSelection <= 1 || dispenserSelection >= 4);
        
        itemSelection(dispensers[dispenserSelection], cashRegister);
        System.out.printf("Total Sales = RM%.2f%n",cashRegister.getSales());
    }
}
