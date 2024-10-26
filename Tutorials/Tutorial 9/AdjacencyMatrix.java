/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Tutorial;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */
public class AdjacencyMatrix<E> {
    private ArrayList<E> vertexes;
    private ArrayList<ArrayList<Integer>> adjMatrix;
    
    public AdjacencyMatrix(){
        vertexes = new ArrayList<>();
        adjMatrix = new ArrayList<>();
    }
    
    public void addVertex(E vertex){
        vertexes.add(vertex);
        for (ArrayList<Integer> row : adjMatrix) {
            row.add(0);
        }
        // Create and add a new row for the new vertex, initializing all values to 0
        ArrayList<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < vertexes.size(); i++) {
            newRow.add(0);
        }
        adjMatrix.add(newRow);
    }
    
    public int getVertexIndex(E vertex){
        for (int i = 0; i < vertexes.size(); i++) {
            if(vertex.equals(vertexes.get(i))){
                return i;
            }
        }
        return -1;
    }
    
    public void addLink(E fromVertex, E toVertex){
        
        int i = getVertexIndex(fromVertex);
        int j = getVertexIndex(toVertex);
        if(i == -1 || j == -1){
            System.out.println("Fail to link.");
                return;
        }
        
        adjMatrix.get(i).set(j, 1);
    }
    
    public void print() {
        System.out.print("   ");
        // Print all vertex labels on the top
        for (E vertex : vertexes) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        // Print the adjacency matrix rows with the vertex label at the beginning
        for (int i = 0; i < vertexes.size(); i++) {
            System.out.print(vertexes.get(i) + ": ");
            ArrayList<Integer> row = adjMatrix.get(i);
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
