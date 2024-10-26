/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Tutorial;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author szeyu
 */
class EdgeNodes<E>{
    protected Vertex<E> vertice;
    protected EdgeNodes nextEdgeNode;
    
    public EdgeNodes(Vertex vertice){
        this.vertice = vertice;
        this.nextEdgeNode = null;
    }
}

class Vertex<E> {
    private E vertexInfo;
    private EdgeNodes firstEdgeNodes;
    
    public Vertex(E vertexInfo){
        this.vertexInfo = vertexInfo;
        firstEdgeNodes = null;
    }
    
    public void linkTo(Vertex toVertex){
        if(firstEdgeNodes == null){
            firstEdgeNodes = new EdgeNodes(toVertex);
            return;
        }
        EdgeNodes current = firstEdgeNodes;
        while(current.nextEdgeNode != null){
            current = current.nextEdgeNode;
        }
        
        current.nextEdgeNode = new EdgeNodes(toVertex);
    }

    public E getVertexInfo() {
        return vertexInfo;
    }
    
    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        out.append(vertexInfo);
        EdgeNodes current = firstEdgeNodes;
        while (current != null){
            out.append(" -> ");
            out.append(current.vertice.getVertexInfo());
            current = current.nextEdgeNode;
        }
        return out.toString();
    }
}

public class AdjacencyList<E> {
    private ArrayList<Vertex> vertices;
    private HashMap<E, Integer> verticeMapIndex;
    
    public AdjacencyList(){
        vertices = new ArrayList<>();
        verticeMapIndex = new HashMap<>();
    }
    
    public void addVetice(E verticeInfo){
        Vertex<E> newVertice = new Vertex<>(verticeInfo);
        verticeMapIndex.put(verticeInfo, vertices.size());
        vertices.add(newVertice);
    }
    
    public void addLink(E fromVertice, E toVertice){
        if(!verticeMapIndex.containsKey(fromVertice) || !verticeMapIndex.containsKey(toVertice)){
            System.out.println("Fail to add link");
            return;
        }
        vertices.get(verticeMapIndex.get(fromVertice)).linkTo(vertices.get(verticeMapIndex.get(toVertice)));
    }
    
    public void print(){
        for (Vertex vertice : vertices) {
            System.out.println(vertice);
        }
    }
}
