/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Tutorial;

/**
 *
 * @author szeyu
 */
    /*
    adjacency matrix

      A B C D E F G H I
    A 0 0 1 1 0 0 0 0 0
    B 0 0 0 1 0 0 0 0 0
    C 0 0 0 0 1 1 0 0 0
    D 0 0 0 0 1 0 0 0 0
    E 0 0 0 0 0 0 1 0 0
    F 0 0 0 0 0 0 0 1 0
    G 0 0 0 0 0 0 0 1 0
    H 0 0 0 0 0 0 0 0 1
    I 0 0 0 0 0 0 0 0 0


    adjacency list

    A -> C -> D
    B -> D
    C -> E -> F
    D -> E
    E -> G
    F -> H
    G -> H
    H -> I
    I


    */

public class GraphTuto {
    public static void adjMatrix(){
        AdjacencyMatrix<Character> adjMatrix = new AdjacencyMatrix<>();
        adjMatrix.addVertex('A');
        adjMatrix.addVertex('B');
        adjMatrix.addVertex('C');
        adjMatrix.addVertex('D');
        adjMatrix.addVertex('E');
        adjMatrix.addVertex('F');
        adjMatrix.addVertex('G');
        adjMatrix.addVertex('H');
        adjMatrix.addVertex('I');
        
        adjMatrix.addLink('A', 'C');
        adjMatrix.addLink('A', 'D');
        adjMatrix.addLink('B', 'D');
        adjMatrix.addLink('C', 'E');
        adjMatrix.addLink('C', 'F');
        adjMatrix.addLink('D', 'E');
        adjMatrix.addLink('E', 'G');
        adjMatrix.addLink('F', 'H');
        adjMatrix.addLink('G', 'H');
        adjMatrix.addLink('H', 'I');
        
        adjMatrix.print();
    }
    
    public static void adjList(){
        AdjacencyList<Character> adjList = new AdjacencyList<>();
        adjList.addVetice('A');
        adjList.addVetice('B');
        adjList.addVetice('C');
        adjList.addVetice('D');
        adjList.addVetice('E');
        adjList.addVetice('F');
        adjList.addVetice('G');
        adjList.addVetice('H');
        adjList.addVetice('I');
        
        adjList.addLink('A', 'C');
        adjList.addLink('A', 'D');
        adjList.addLink('B', 'D');
        adjList.addLink('C', 'E');
        adjList.addLink('C', 'F');
        adjList.addLink('D', 'E');
        adjList.addLink('E', 'G');
        adjList.addLink('F', 'H');
        adjList.addLink('G', 'H');
        adjList.addLink('H', 'I');
        
        adjList.print();
    }
    
    public static void main(String[] args) {
//        adjMatrix();
        adjList();
    }
}
