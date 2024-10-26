/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Tuto;

/**
 *
 * @author szeyu
 */
public class ReverseString {
    public static String reverseString(String str, int index, StringBuilder reverseStr){
        if(index < 0){
            return reverseStr.toString();
        }
        reverseStr.append(str.charAt(index));
        return reverseString(str, index-1, reverseStr);
    }
    
    public static String reverseString(String str){
        return reverseString(str, str.length()-1, new StringBuilder());
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("String"));
    }
}
