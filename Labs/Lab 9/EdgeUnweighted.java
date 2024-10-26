/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9.Lab;

/**
 *
 * @author szeyu
 */
public class EdgeUnweighted<E> {
    VertexUnweighted<E> vertex;
    EdgeUnweighted<E> nextEdge;
    
    public EdgeUnweighted(VertexUnweighted<E> vertex){
        this.vertex = vertex;
        nextEdge = null;
    }
}
