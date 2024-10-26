/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class L1Q2 {
    public static void main(String[] args) {
        extract("src/Week1/text1.txt",",");
        extract("src/Week1/text2.txt",", ");
        extract("src/Week1/text3.txt","; ");
        extract("src/Week1/text4.txt","\\d+");
    }
    
    public static void extract(String filePath, String delimeter){
        int ctCh = 0;
        try {
            Scanner in = new Scanner(new FileInputStream(filePath));
            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] extract = line.split(delimeter);
                ctCh += extract.length;
                for(String str : extract){
                    System.out.print(str);
                }
                System.out.println();
            }
            System.out.println("Number of elements retrieved without special characters : " + ctCh);
            System.out.println();
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
