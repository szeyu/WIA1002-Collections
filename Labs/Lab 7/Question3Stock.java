/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7.LabQueue;

import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class Question3Stock {
    public static void main(String[] args) {
        MyQueue<Integer> shareQueue = new MyQueue<>();
        MyQueue<Integer> priceQueue = new MyQueue<>();
        
        int totalCapitalGainOrLoss = 0;
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String line = input.nextLine();
            
            if(line.equals("")){
                System.out.println("Total Capital Gain / Loss: " + totalCapitalGainOrLoss);
                break;
            }
            
            String[] extract = line.split("\\s+");
            
            // buy or sell
            String action = extract[0];
            
            int x = Integer.parseInt(extract[1]);
            int y = Integer.parseInt(extract[4].substring(1));
            
            if(action.equalsIgnoreCase("buy")){
                System.out.println("Buying now...");
                shareQueue.enqueue(x);
                priceQueue.enqueue(y);
                
                
            } else if(action.equalsIgnoreCase("sell")){
                System.out.println("Selling the shares now...");
                

                // if notice that sell more than or equal to the oldest share unit mean sell all the oldest share unit
                while(!shareQueue.isEmpty() && x >= shareQueue.peek()){
                    int oldestShareUnit = shareQueue.dequeue();
                    int oldestSharePrice = priceQueue.dequeue();

                    totalCapitalGainOrLoss += oldestShareUnit * (y - oldestSharePrice);
                    x = x - oldestShareUnit;
                    System.out.println("Total Capital Gain / Loss: " + totalCapitalGainOrLoss);
                }
                
                if(!shareQueue.isEmpty()){
                    totalCapitalGainOrLoss += x * (y - priceQueue.peek());
                    shareQueue.enqueue(shareQueue.dequeue() - x);
                    priceQueue.enqueue(priceQueue.dequeue());
                    for (int i = 0; i < shareQueue.getSize()-1; i++) {
                        shareQueue.enqueue(shareQueue.dequeue());
                        priceQueue.enqueue(priceQueue.dequeue());
                    }
                    
                }
                
                System.out.println("Total Capital Gain / Loss: " + totalCapitalGainOrLoss);
                
                if(shareQueue.isEmpty()){
                    System.out.println("No shares to sell!");
                }
                 
                
            } else {
                System.out.println("What action do you want to do?");
                continue;
            }
            
            System.out.println("Queue for Share: " + shareQueue.toString());
            System.out.println("Queue for Price: " + priceQueue.toString());
        }
        
    }
}
