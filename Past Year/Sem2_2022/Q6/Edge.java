/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2022.Q6;

/**
 *
 * @author szeyu
 */
public class Edge {

    protected double distance;
    protected String from;
    protected RoutingGraph to;
    protected Type speedType;

    enum Type {
        HOUSE_HOUSE(1),
        HOUSE_FOOD(1),
        FOOD_FOOD(1.25),
        FOOD_INDUSTRY(1.5),
        INDUSTRY_INDUSTRY(3);

        private final double speed;

        Type(double speed) {
            this.speed = speed;
        }

        public double getSpeed() {
            return speed;
        }
        
        public double getSpeed(double multiplier) {
            return speed * multiplier;
        }
        
        public double getDuration(double distance) {
            return speed * distance;
        }
        
        public double getDuration(double distance, double multiplier) {
            return speed * multiplier * distance;
        }
    };
    
    public Edge(String from, RoutingGraph to, double distance, Type speedType){
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.speedType = speedType;
    }
    
    @Override 
    public String toString(){
        return "[" + from + "," + to.getVertex() + "(speed=" + speedType.getSpeed() + " , distance=" + distance + ")]";
    }
}
