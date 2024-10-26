/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Lab;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */

public class Graph<E> {
    private VertexUnweighted<E> head;
    private int size;
    
    public Graph(){
        head = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean hasVertex(E vertex){
        VertexUnweighted<E> current = head;
        while(current != null){
            if(current.vertexInfo.equals(vertex))
                return true;
            current = current.nextVertex;
        }
        return false;
    }
    
    public int getInDeg(E vertex){
        if(hasVertex(vertex)){
            VertexUnweighted<E> current = head;
            while(current != null){
                if(current.vertexInfo.equals(vertex)){
                    return current.inDegree;
                }
                current = current.nextVertex;
            }
        }
        return -1;
    }
    
    public int getOutDeg(E vertex){
        if(hasVertex(vertex)){
            VertexUnweighted<E> current = head;
            while(current != null){
                if(current.vertexInfo.equals(vertex)){
                    return current.outDegree;
                }
                current = current.nextVertex;
            }
        }
        return -1;
    }
    
    public boolean addVertex(E vertexInfo){
        if(hasVertex(vertexInfo)){
            System.out.println("It is alr exist");
            return false;
        }
        VertexUnweighted<E> newVertex = new VertexUnweighted<>(vertexInfo);
        if(head == null){
            head = newVertex;
        } else {
            VertexUnweighted<E> current = head;
            for (int i = 1; i < size; i++) {
                current = current.nextVertex;
            }
            current.nextVertex = newVertex;
        }
        size++;
        return true;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public boolean addEdge(E source, E destination){
        if(hasEdge(source, destination)){
            return false;
        }
        VertexUnweighted<E> sourceVertex = head;
        VertexUnweighted<E> destinationVertex = getVertex(destination);
        if(destinationVertex == null)
            return false;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.equals(source)){
                EdgeUnweighted newEdge = new EdgeUnweighted<>(destinationVertex);
                newEdge.nextEdge = sourceVertex.firstEdgeNode;
                sourceVertex.firstEdgeNode = newEdge;
                sourceVertex.outDegree++;
                destinationVertex.inDegree++;
                return true;
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        
        return false;
    }
    
    public int getIndex(E v){
        VertexUnweighted current = head;
        int index = 0;
        while(current != null){
            if(current.vertexInfo.equals(v)){
                return index;
            }
            index++;
            current = current.nextVertex;
        }
        return -1;
    }
    
    public ArrayList<E> getAllVertexObjects(){
        ArrayList<E> list = new ArrayList<>();
        VertexUnweighted current = head;
        while(current != null){
            list.add((E)current.vertexInfo);
            current = current.nextVertex;
        }
        return list;
    }
    
    public VertexUnweighted<E> getVertex(int index){
        if(index > size-1 || index < 0){
            return null;
        }
        VertexUnweighted current = head;
        for (int i = 0; i < index; i++) {
            current = current.nextVertex;            
        }
        return current;
    }
    
    public VertexUnweighted<E> getVertex(E v){
        VertexUnweighted current = head;
        while(current != null){
            if(current.vertexInfo.equals(v)){
//                System.out.println(current.vertexInfo);
                return current;
            }
            current = current.nextVertex;
        }
        return null;
    }
    
    public boolean addUndirectedEdge(E source, E destination){
        return addEdge(source, destination) && addEdge(destination, source);
    }
    
    public boolean hasEdge(E source, E destination){
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        VertexUnweighted<E> sourceVertex = getVertex(source);
        if(sourceVertex == null){
            return false;
        }
        EdgeUnweighted<E> currentEdge = sourceVertex.firstEdgeNode;
        while(currentEdge != null){
            if(currentEdge.vertex.vertexInfo.equals(destination)){
                return true;
            }
            currentEdge = currentEdge.nextEdge;
        }
        return false;
    }
    
    public ArrayList<VertexUnweighted<E>> getAllVertices(){
        ArrayList<VertexUnweighted<E>> list = new ArrayList<>();
        VertexUnweighted current = head;
        while(current != null){
            list.add(current);
            current = current.nextVertex;
        }
        return list;
    }
    
    public boolean removeEdge(E source, E destination){
        if(!hasEdge(source,destination)){
            System.out.println("No such edge");
            return false;
        }
        
        VertexUnweighted<E> sourceVertex = head;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.equals(source)){
                VertexUnweighted<E> destinationVertex = getVertex(destination);
                EdgeUnweighted<E> currentEdge = sourceVertex.firstEdgeNode;
                EdgeUnweighted<E> previousEdge = null;
                while(currentEdge != null){
                    if(currentEdge.vertex.vertexInfo.equals(destination)){
                        if(previousEdge != null){
                            previousEdge.nextEdge = currentEdge.nextEdge;
                            currentEdge.nextEdge = null;
                            break;
                        }
                    }
                    currentEdge = currentEdge.nextEdge;
                }
                sourceVertex.outDegree--;
                destinationVertex.inDegree--;
                return true;
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    public void printEdges(){
        VertexUnweighted<E> currentVertex = head;
        while(currentVertex != null){
            System.out.print(currentVertex.vertexInfo);
            EdgeUnweighted<E> currentEdge = currentVertex.firstEdgeNode;
            while(currentEdge != null){
                System.out.print(" -> " + currentEdge.vertex.vertexInfo);
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            currentVertex = currentVertex.nextVertex;
        }
    }
}
