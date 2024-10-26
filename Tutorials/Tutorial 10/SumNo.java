/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Tuto;

/**
 *
 * @author szeyu
 */
public class SumNo {
    
    public static int sum(int number){
        if(number == 1){
            return 1;
        }
        return number + sum(number-1);
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
