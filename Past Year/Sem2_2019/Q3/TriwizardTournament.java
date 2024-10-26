/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author szeyu
 */
public class TriwizardTournament {
    public static boolean validMove(
            int currRow, int currColumn, 
            String moveType, 
            int nRow, int nColumn, 
            String[][] maze, 
            int [][] visited){
        
        switch(moveType){
            case "up": //up
                return (currRow != 0) && 
                        (!maze[currRow-1][currColumn].equals("0")) &&
                        (visited[currRow-1][currColumn] != 1);
            case "down": //down
                return (currRow != nRow-1) && 
                        (!maze[currRow+1][currColumn].equals("0")) &&
                        (visited[currRow+1][currColumn] != 1);
            case "left": //left
                return (currColumn != 0) && 
                        (!maze[currRow][currColumn-1].equals("0")) &&
                        (visited[currRow][currColumn-1] != 1);
            case "right": //right
                return (currColumn != nColumn-1) && 
                        (!maze[currRow][currColumn+1].equals("0")) &&
                        (visited[currRow][currColumn+1] != 1);
        }
        
        return false;
    }
    
    public static void printMaze(String [][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        int nRow = 0, nColumn = 0;
        try {
            Scanner in = new Scanner(new FileInputStream("src/PastYear/Sem2_2019/Q3/maze"));
            
            String line = "";
            while(in.hasNextLine()){
                line = in.nextLine();
                nRow++;
            }
            nColumn = (line.length()+1)/2;
            
            String[][] maze = new String[nRow][nColumn];
            
            in = new Scanner(new FileInputStream("src/PastYear/Sem2_2019/Q3/maze"));
            for (int i = 0; i < nRow; i++) {
                line = in.nextLine();
                String[] extract = line.split(" ");
                
                for (int j = 0; j < nColumn; j++) {
                    maze[i][j] = extract[j];
                }
            }
            
            printMaze(maze);
            
            int[][] visited = new int[nRow][nColumn];
            
            MyStack dfsStack = new MyStack();
            int currRow = 0, currColumn = 0;
            
            dfsStack.push(new Move(currRow, currColumn, visited, null));
            Move currMove = null;
            boolean flag = false;
            while(!flag && !dfsStack.isEmpty()){
                if(maze[currRow][currColumn].equals("C")){
                    flag = true;
                    break;
                }
                
                currMove = dfsStack.pop();
                currRow = currMove.row;
                currColumn = currMove.column;
                visited = currMove.visited;
                
//                System.out.println(currMove);
                
                visited[currRow][currColumn] = 1; //mark as visited
                
                if(validMove(currRow, currColumn, "up", nRow, nColumn, maze, visited)){
                    Move nextMove = new Move(currRow-1, currColumn, visited, currMove);
                    dfsStack.push(nextMove);
                }
                if(validMove(currRow, currColumn, "down", nRow, nColumn, maze, visited)){
                    Move nextMove = new Move(currRow+1, currColumn, visited, currMove);
                    dfsStack.push(nextMove);
                }
                if(validMove(currRow, currColumn, "left", nRow, nColumn, maze, visited)){
                    Move nextMove = new Move(currRow, currColumn-1, visited, currMove);
                    dfsStack.push(nextMove);
                }
                if(validMove(currRow, currColumn, "right", nRow, nColumn, maze, visited)){
                    Move nextMove = new Move(currRow, currColumn+1, visited, currMove);
                    dfsStack.push(nextMove);
                }
            }
            
            if(!flag){
                System.out.println("Oh no!!! Harry couldn't find the Triwizard Cup!");
                System.out.println("Someone quickly gets Professor Dumbledore.");
            } else {
                MyStack traceMove = new MyStack();
                while (currMove.parentPath != null) {
                    traceMove.push(currMove);
                    currMove = currMove.parentPath;
                }

                System.out.print("This is the path Harry has taken: (0,0)");
                while(!traceMove.isEmpty()){
                    System.out.print(" > " + traceMove.pop());
                }
                System.out.println();
                
            }
            
            
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
