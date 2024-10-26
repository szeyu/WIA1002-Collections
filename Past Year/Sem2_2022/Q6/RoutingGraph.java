/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q6;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */
public class RoutingGraph {
    private int size = 7;
    private String vertex;
    private ArrayList<Edge> neighbours;
    
    public RoutingGraph(String vertex){
        this.vertex = vertex;
        neighbours = new ArrayList<>();
    }
    
    public int getSize(){
        return size;
    }
    
    public String getVertex(){
        return vertex;
    }
    
    public ArrayList<Edge> getNeighbours(){
        return neighbours;
    }
    
    public void printNeighbours(){
        System.out.print("[");
        for (int i = 0; i < neighbours.size(); i++) {
            Edge neighbour = neighbours.get(i);
            if(i != neighbours.size()-1){
                System.out.print(neighbour.to.vertex + ", ");
            } else {
                System.out.println(neighbour.to.vertex + "]");
            }
        }
    }
    
    public void printEdges(){
        System.out.print("# " + vertex + " : ");
        for (int i = 0; i < neighbours.size(); i++) {
            Edge neighbour = neighbours.get(i);
            System.out.print(neighbour + " ");
        }
        System.out.println();
    }
    
    public boolean contains(String vertex){
        for (int i = 0; i < neighbours.size(); i++) {
            Edge neighbour = neighbours.get(i);
            if(neighbour.to.vertex.equals(vertex))
                return true;
        }
        
        return false;
    }
}
