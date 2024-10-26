/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Lab;

import java.util.HashSet;

/**
 *
 * @author szeyu
 */
public class PermuteString {
    static HashSet<String> history = new HashSet<>();
    
    public static void permuteString(String str, String permuteStr){
        if(history.contains(permuteStr)){
            return;
        } else {
            System.out.println(permuteStr);
            history.add(permuteStr);
            char[] permuteStrCharArr = permuteStr.toCharArray();
            for (int i = 0; i < permuteStrCharArr.length-1; i++) {
                // swap the initial element with the next one until the end
                char temp = permuteStrCharArr[i];
                permuteStrCharArr[i] = permuteStrCharArr[i+1];
                permuteStrCharArr[i+1] = temp;
                
                String newPermuteStr = String.valueOf(permuteStrCharArr);
                permuteString(str, newPermuteStr);
            }
        }
    }
    
    public static void permuteString(String str){
        permuteString(str, str);
    }
    
    public static void main(String[] args) {
        String inputStrng = "ABCD";
        permuteString(inputStrng);
    }
}
