/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class Lab5Q2 {
    public static void main(String[] args) {
        Lab5Q2_SLL<String> SLL = new Lab5Q2_SLL<>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you student name list. Enter 'n' to end.....");
        String name = "";
        while(true){
            name = input.nextLine();
            if(name.equals("n"))
                break;
            SLL.add(name);
        }
        
        System.out.println("You have entered the following students' name :");
        SLL.printList();
        System.out.println();
        
        System.out.println("The number of students entered is : " + SLL.getSize());
        System.out.println();
        
        while(true){
            System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
            String option = input.nextLine();
            System.out.println();
            if(option.equals("n")){
                break;
            } else if(option.equals("r")){
                System.out.println("Enter the existing student name that u want to rename :");
                String incorrectName = input.nextLine().trim();
                System.out.println();
                
                System.out.println("Enter the new name :");
                String correctedName = input.nextLine().trim();
                
                SLL.replace(incorrectName, correctedName);
                System.out.println();
                System.out.println("The new student list is :");
                SLL.printList();
                break;
            }
            
        }
        
        System.out.println();
        
        while(true){
            System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
            String option = input.nextLine();
            if(option.equals("n")){
                break;
            } else if(option.equals("y")){
                System.out.println("Enter a student name to remove :");
                String removeName = input.nextLine();
                SLL.removeElement(removeName);
                System.out.println();
                
                System.out.println("The number of updated studetn is :" + SLL.getSize());
                System.out.println("The updated student list is :");
                SLL.printList();
            }
        }
        
        System.out.println("All student data captured complete. Thank you!");
    }
}
