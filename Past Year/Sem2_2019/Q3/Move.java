/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q3;

/**
 *
 * @author szeyu
 */
public class Move {
    protected int row;
    protected int column;
    protected int[][] visited;
    protected Move parentPath;
    
    public Move(int row, int column, int [][] visited, Move parentPath){
        this.row = row;
        this.column = column;
        this.visited =visited.clone();
        this.parentPath = parentPath;
    }
    
    @Override
    public String toString(){
        return "(" + row + "," + column + ")";
    }
}
