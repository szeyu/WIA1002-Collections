/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.TutoPriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author szeyu
 */
class PriorityQueueComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}

public class TutoPriorityQueue {

    public static void main(String[] args) {
        // 1) Describe the main difference between Queue and PriorityQueue.

        // Queue follows FIFO order to remove element
        // The element that is least recently added will be removed first.
        // PriorityQueue follows priority-based order to remove element
        // The element with the highest priority will be removed first.
        // 2) Briefly provide THREE (3) real-life example in using PriorityQueue.
        //	1. Bus Queue
        //		--> Elderly, disabled, and pregnant individuals have priority when queuing for the bus.
        //
        //	2. Hospital Queue
        //		--> Patients with severe conditions have priority when queuing in hospitals.
        //
        //	3. One-Way Road
        //		--> Ambulances and police vehicles have priority when driving on a one-way road.
        

        // 3)
        no3();
        
        System.out.println();
        System.out.println();
        // 4)
        no4();
        
        // a) 
        // To ensure the PriorityQueue removes elements based on the given comparison logic, 
        // specifically by string length of name.
        
        // b)
        // Ali
        // Jason
        // Muhamad
    }

    public static void no3() {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");
        System.out.println("a) peek() gives us: " + pQueue.peek()); //(a)
        System.out.println("b) The queue elements:"); //(b)
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); //(b)
        }
        pQueue.poll();
        System.out.println("c) After poll():"); //(c)
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next()); //(c)
        }
        pQueue.remove("Java");
        System.out.println("d) After remove():"); //(d)
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next()); //(d)
        }
        boolean b = pQueue.contains("Ruby");
        System.out.println("e) Priority queue contains Ruby or not?: " + b); //(e)
        Object[] arr = pQueue.toArray();
        System.out.println("f) Value in array: "); //(f)
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value: " + arr[i].toString()); //(f)
        }
    }
    
    public static void no4(){
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for (String s : pq) {
            System.out.println(s);
        }
    }
}
