/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Lab;

/**
 *
 * @author szeyu
 */
public class VertexUnweighted<E> {
    E vertexInfo;
    VertexUnweighted<E> nextVertex;
    EdgeUnweighted<E> firstEdgeNode;
    int inDegree;
    int outDegree;
    
    public VertexUnweighted(E vertexInfo){
        this.vertexInfo = vertexInfo;
        this.nextVertex = null;
        this.firstEdgeNode = null;
        this.inDegree = 0;
        this.outDegree = 0;
    }
    
}
