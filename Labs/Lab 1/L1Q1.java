/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class L1Q1 {

    public static void main(String[] args) {
        String filePath = "src/Week1/Sim Sze Yu_23005023.txt";
        // Part 1
        // 1)
        createAndWriteFile(filePath);

        // 2)
        System.out.println("Part 1");
        readFile(filePath);

        // Part 2
        System.out.println("");
        System.out.println("Part 2");
        appendFile(filePath);
        readFile(filePath);

        // Part 3
        System.out.println("");
        System.out.println("Part 3");
        getInputToFile(filePath);
        readFile(filePath);
    }

    public static void createAndWriteFile(String filePath) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(filePath));
            String introductionMessage = "Monday, 4 March 2024."
                    + "\n\n"
                    + "My name is Sim Sze Yu with matrix number, 23005023. "
                    + "I am majoring in Artificial Intelligence. "
                    + "This is my first time taking the Data Structure subject. "
                    + "At the mooment, I am feeling excited about taking this subject. "
                    + "This is because I an finally learn the most important concept in programming. "
                    + "\n\n"
                    + "I acquired A for my previous Fundamental of Programming course. "
                    + "It's not too bad. So I think I can manage to get at least A- for this DS subject this term. "
                    + "In order to do well in the subject, I will do a lot of leetcode exercise. "
                    + "Wish me luck!!!";
            out.println(introductionMessage);
            out.close();

        } catch (IOException e) {
            System.out.println("Error with file output.");
        }

    }

    public static void readFile(String filePath) {
        try {
            Scanner in = new Scanner(new FileInputStream(filePath));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();

        } catch (IOException e) {
            System.out.println("Error with file input.");
        }
    }

    public static void appendFile(String filePath) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(filePath, true));
            String message = "\n\nWenesday, 13 March 2024."
                    + "\n\n"
                    + "I think have performed quite well in the class. "
                    + "Due to that, I feel happy with my performance. "
                    + "In DS, I have learnt how to think differently like a senior programmer. "
                    + "I target to score at least A in DS. "
                    + "I can understand the concept of DS. "
                    + "I can practise my leetcode if I have done my stuff in the tuto session. "
                    + "Anything I don't know I will ask my Demonstrator in the class. ";
            out.println(message);
            out.close();

        } catch (IOException e) {
            System.out.println("Error with file output.");
        }
    }

    public static void getInputToFile(String filePath) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(filePath, true));
            String message = "Wenesday, 13 March 2024.";
            System.out.println(message);
            Scanner in = new Scanner(System.in);
            System.out.println("Your message:");
            String userInput = in.nextLine();
            in.close();
            message = "" + message + "\n\n" + userInput;

            out.println(message);
            out.close();

        } catch (IOException e) {
            System.out.println("Error with file output.");
        }
    }
}
