/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.LabPriorityQueue;

/**
 *
 * @author szeyu
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lab8Q1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new ReverseComparator());
        priorityQueue.offer(4);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(9);
        priorityQueue.offer(6);
        priorityQueue.offer(3);
        priorityQueue.offer(7);
        
        System.out.println(priorityQueue.toString());
        System.out.println(priorityQueue.poll());
        priorityQueue.add(5);
        Object[] priorityQueueArray = priorityQueue.toArray();
        for (Object integer : priorityQueueArray) {
            System.out.print(integer + " ");
        }
        System.out.println();
        
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.contains(1));
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.isEmpty());
        
    }
    
    public static class ReverseComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
