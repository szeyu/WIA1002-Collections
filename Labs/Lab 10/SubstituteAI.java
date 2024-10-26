/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10.Lab;

/**
 *
 * @author szeyu
 */
public class SubstituteAI {
    public static String substituteAI(String str){
        return substituteAI(str, 0, new StringBuilder());
    }
    
    public static String substituteAI(String str, int index, StringBuilder newStr){
        if(index >= str.length()){
            return newStr.toString();
        }
        if(str.charAt(index) == 'a'){
            newStr.append("i");
        } else{
            newStr.append(str.charAt(index));
        }
        
        return substituteAI(str, index+1, newStr);
    }
    
    public static void main(String[] args) {
        String str1 = substituteAI("Astronaut");
        String str2 = substituteAI("falbbergasted");
        
        System.out.println(str1);
        System.out.println(str2);
    }
}
