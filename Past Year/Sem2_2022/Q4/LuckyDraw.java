/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author szeyu
 */
public class LuckyDraw {
    public static void firstRound(LinkedList<Staff> staffList1){
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            int selectedWinnerIndex = random.nextInt(staffList1.getSize());
            Staff winner = staffList1.get(selectedWinnerIndex);
            System.out.println(winner.getID() + " " + winner.getName() + " wins a drone!");
            staffList1.remove(selectedWinnerIndex);
        }
    }
    
    public static void secondRound(LinkedList<Staff> staffList2){
        int value = 1000;
        Random random = new Random();
        
        while (true) {
            int selectedWinnerIndex = random.nextInt(staffList2.getSize());
            Staff winner = staffList2.get(selectedWinnerIndex);
            String post = winner.getPosition();
            
            int winValue = 0;
            
            if(post.equals("Assistant")){
                winValue = 200 <= value ? 200 : value;
            } else if(post.equals("Supervisor")){
                winValue = 100 <= value ? 100 : value;
            } 
            
            value = value - winValue;
            
            if(winValue == 0){
                System.out.println("Manager " + winner.getName() + " is the winner, but no cash voucher will be given");
            } else {
                System.out.println(post + " " + winner.getName() + " wins RM" + winValue + ". Cash voucher left RM" + value);
            }
            
            staffList2.remove(selectedWinnerIndex);
            
            if(value == 0){
                return;
            }
        }
    }
    

    public static void main(String[] args) {
        LinkedList<Staff> staffList1 = new LinkedList<>();
        
        try {
            Scanner in = new Scanner(new FileInputStream("src/PastYear/Sem2_2022/Q4/staffList"));
            Pattern pattern = Pattern.compile("(\\d+)\\s+([\\w ]+)\\s+(Manager|Supervisor|Assistant)");
            in.nextLine();

            while (in.hasNextLine()) {
                String line = in.nextLine();
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    int id = Integer.parseInt(matcher.group(1));
                    String name = matcher.group(2);
                    String position = matcher.group(3);
                    
                    Staff newStaff = new Staff(id, name, position);
                    
                    staffList1.addLast(newStaff);
                    
                    System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
                }

            }

        } catch (IOException e) {
            System.out.println("Error with file input");
        }
        
        LinkedList<Staff> staffList2 = staffList1.clone();
        
        System.out.println();
        firstRound(staffList1);
        
        System.out.println();
        secondRound(staffList2);
        
    }
}
