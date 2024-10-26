/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6.Lab6;

/**
 *
 * @author szeyu
 */
public class L6Q5_TowerOfHanoi {
    public static void printMove(int start, int end, MyStack<Integer>[] towers){
        System.out.println("Move " + start + " -> " + end);
        
        // move the disc
        towers[end-1].push(towers[start-1].pop());
        
        for (int i = 0; i < towers.length; i++) {
            MyStack<Integer> tower = towers[i];
            System.out.println("Tower " + (i+1) + " " + tower.toString());
        }
    }
    
    public static void h(int n, int start, int end, MyStack<Integer>[] towers){
        if(n == 1){
            printMove(start, end, towers);
        } else {
            int otherRod = 6 - start - end;
            h(n-1, start, otherRod, towers);
            printMove(start, end, towers);
            h(n-1, otherRod, end, towers);
        }
    }
    
    public static void main(String[] args) {
        MyStack<Integer>[] towers = new MyStack[3];
        towers[0] = new MyStack<>();
        towers[1] = new MyStack<>();
        towers[2] = new MyStack<>();
        
        // Initialise tower setting
        int n = 5;
        for (int i = n; i >= 1; i--) {
            towers[0].push(i);
        }
        
        System.out.println("Initial Stack");
        for (int i = 0; i < towers.length; i++) {
            MyStack<Integer> tower = towers[i];
            System.out.println("Tower " + (i+1) + " " + tower.toString());
        }
        
        h(n, 1, 3, towers);
    }
}
