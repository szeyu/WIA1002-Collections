/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q6;

import PastYear.Sem2_2022.Q6.Edge.Type;
import java.util.ArrayList;


/**
 *
 * @author szeyu
 */
public class TestGraph {
    public static double calculateDistance(ArrayList<RoutingGraph> path){
        double distance = 0;
        RoutingGraph prevVertex = path.get(0);
        for (int i = 1; i < path.size(); i++) {
            RoutingGraph vertex = path.get(i);
            
            for (int j = 0; j < prevVertex.getNeighbours().size(); j++) {
                Edge neighbour = prevVertex.getNeighbours().get(j);
                if(neighbour.to.getVertex().equals(vertex.getVertex())){
                    distance += neighbour.distance;
                    break;
                }
            }
            
            prevVertex = vertex;
        }
        return distance;
    }
    
    public static double calculateDuration(ArrayList<RoutingGraph> path){
        double duration = 0;
        RoutingGraph prevVertex = path.get(0);
        for (int i = 1; i < path.size(); i++) {
            RoutingGraph vertex = path.get(i);
            
            for (int j = 0; j < prevVertex.getNeighbours().size(); j++) {
                Edge neighbour = prevVertex.getNeighbours().get(j);
                if(neighbour.to.getVertex().equals(vertex.getVertex())){
                    duration += neighbour.speedType.getDuration(neighbour.distance, 2);
                    break;
                }
            }
            
            prevVertex = vertex;
        }
        return duration;
    }
    
    public static void printPath(ArrayList<RoutingGraph> path){
        System.out.print("[");
        for (int i = 0; i < path.size(); i++) {
            if(i != path.size()-1){
                System.out.print(path.get(i).getVertex() + ", ");
            } else {
                System.out.println(path.get(i).getVertex() + "]");
            }
            
        }
    }
    
    public static void sortDistance(ArrayList<RoutingGraph>[] paths, int [] order){
        for (int i = 0; i < paths.length-1; i++) {
            for (int j = 0; j < paths.length - i - 1; j++) {
                if(calculateDistance(paths[j]) > calculateDistance(paths[j+1])){
                    ArrayList<RoutingGraph> temp = paths[j];
                    paths[j] = paths[j+1];
                    paths[j+1] = temp;
                    
                    int tempOrder = order[j];
                    order [j] = order[j+1];
                    order[j+1] = tempOrder;
                }
            }
        }
    }
    
    public static void sortDuration(ArrayList<RoutingGraph>[] paths, int [] order){
        for (int i = 1; i < paths.length; i++) {
            ArrayList<RoutingGraph> current = paths[i];
            int currentOrder = order[i];
            
            int k;
            for (k = i-1; k >= 0 && calculateDuration(paths[k]) < calculateDuration(current); k--) {
                paths[k+1] = paths[k];
                order[k+1] = order[k];
            }
            
            paths[k+1] = current;
            order[k+1] = currentOrder;
        }
    }
    
    public static void main(String[] args) {
        RoutingGraph A = new RoutingGraph("A");
        RoutingGraph B = new RoutingGraph("B");
        RoutingGraph C = new RoutingGraph("C");
        RoutingGraph D = new RoutingGraph("D");
        RoutingGraph E = new RoutingGraph("E");
        RoutingGraph F = new RoutingGraph("F");
        RoutingGraph G = new RoutingGraph("G");
        
        A.getNeighbours().add(new Edge("A", B, 7, Type.HOUSE_FOOD));
        B.getNeighbours().add(new Edge("B", A, 7, Type.HOUSE_FOOD));
        
        A.getNeighbours().add(new Edge("A", C, 10.1, Type.HOUSE_HOUSE));
        
        B.getNeighbours().add(new Edge("B", C, 5.5, Type.HOUSE_FOOD));
        C.getNeighbours().add(new Edge("C", B, 5.5, Type.HOUSE_FOOD));
        
        B.getNeighbours().add(new Edge("B", E, 3.2, Type.FOOD_FOOD));
        
        C.getNeighbours().add(new Edge("C", D, 8.3, Type.HOUSE_FOOD));
        
        E.getNeighbours().add(new Edge("E", D, 2.9, Type.FOOD_FOOD));
        
        E.getNeighbours().add(new Edge("E", G, 6, Type.FOOD_INDUSTRY));
        G.getNeighbours().add(new Edge("G", E, 6, Type.FOOD_INDUSTRY));
        
        D.getNeighbours().add(new Edge("D", G, 4.9, Type.FOOD_INDUSTRY));
        
        E.getNeighbours().add(new Edge("E", F, 4, Type.FOOD_INDUSTRY));
        
        F.getNeighbours().add(new Edge("F", G, 2.3, Type.INDUSTRY_INDUSTRY));
        
        System.out.println("The number of vertices in MyCityGraph: " + A.getSize());
        System.out.println("List all vertices");
        System.out.println("0: A    1: B    2: C    3: D    4: E    5: F    6: G");
        
        System.out.println("Has edge from B to A? " + B.contains("A"));
        System.out.println("Has edge from A to D? " + A.contains("D"));
        
        System.out.println();
        
        System.out.print("Find all neightbours of B : ");
        B.printEdges();
        
        System.out.println();
        
        System.out.println("Print all edges : ");
        A.printEdges();
        B.printEdges();
        C.printEdges();
        D.printEdges();
        E.printEdges();
        F.printEdges();
        G.printEdges();
        
        ArrayList<RoutingGraph> path1 = new ArrayList<>();
        ArrayList<RoutingGraph> path2 = new ArrayList<>();
        ArrayList<RoutingGraph> path3 = new ArrayList<>();
        ArrayList<RoutingGraph> path4 = new ArrayList<>();
        ArrayList<RoutingGraph> path5 = new ArrayList<>();
        
        path1.add(A);
        path1.add(B);
        path1.add(C);
        path1.add(D);
        path1.add(G);
        
        path2.add(A);
        path2.add(B);
        path2.add(E);
        path2.add(G);
        
        path3.add(A);
        path3.add(C);
        path3.add(B);
        path3.add(E);
        path3.add(F);
        path3.add(G);
        
        path4.add(A);
        path4.add(B);
        path4.add(E);
        path4.add(D);
        path4.add(G);
        
        path5.add(A);
        path5.add(C);
        path5.add(D);
        path5.add(G);
        
        ArrayList<RoutingGraph>[] paths = new ArrayList[5];

        // Assign the ArrayLists to the array
        paths[0] = path1;
        paths[1] = path2;
        paths[2] = path3;
        paths[3] = path4;
        paths[4] = path5;
        
        for (int i = 0; i < paths.length; i++) {
            ArrayList<RoutingGraph> path = paths[i];
            System.out.print("Path " + (i+1) + " : ");
            printPath(path);
            System.out.printf("Distance= %.2fkm, Duration= %.2f min%n",calculateDistance(path), calculateDuration(path));       
        }
        System.out.println();
        
        int[] order = {1,2,3,4,5};
        
        System.out.println("After Bubble Sort:");
        sortDistance(paths, order);
        for (int i = 0; i < paths.length; i++) {
            ArrayList<RoutingGraph> path = paths[i];
            System.out.print("Path " + (order[i]) + " ");
            System.out.printf("(%.2f km)%n",calculateDistance(path));       
        }
        
        
        
        System.out.println("After Insertion Sort:");
        sortDuration(paths, order);
        for (int i = 0; i < paths.length; i++) {
            ArrayList<RoutingGraph> path = paths[i];
            System.out.print("Path " + (order[i]) + " ");
            System.out.printf("(%.2f min)%n",calculateDuration(path));       
        }
    }
}
