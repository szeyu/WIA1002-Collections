/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Lab3;

/**
 *
 * @author szeyu
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayBag<T> implements BagInterface<T> {
    private final T[] bag; 
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;

    public ArrayBag(){
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }
    
    public ArrayBag(int capacity){
        bag = (T[]) new Object[capacity];
    }
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    public boolean isFull(){
        return numberOfEntries == bag.length;
    }
    
    public boolean isEmpty(){
        return numberOfEntries == 0;
    }
    
    public boolean add(T newEntry){
        if(!this.isFull()){
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
        return false;
    }
    
    public T remove(){
        if(this.isEmpty())
            return null;
        int randomPosition = (int)Math.random()*numberOfEntries; // 0 -> numberOfEntries - 1
        
        //swap position of random with last element;
        T temp = bag[randomPosition];
        bag[randomPosition] = bag[numberOfEntries-1];
        bag[numberOfEntries-1] = temp;
        
        numberOfEntries--;
        
        // return the last element
        return bag[numberOfEntries];
        
    }
    
    public boolean remove(T anEntry){
        int i = 0; // the index of the anEntry
        while(i < numberOfEntries){
            if(anEntry.equals(bag[i])){
                break;
            }
            i++;
        }
        
        // cannot find the entry in the bag
        if(i == numberOfEntries)
            return false;
        
        //swap position of random with last element;
        T temp = bag[i];
        bag[i] = bag[numberOfEntries-1];
        bag[numberOfEntries-1] = temp;
        numberOfEntries--;
        return true;
    }
    
    public void clear(){
        numberOfEntries = 0;
    }
    
    public int getFrequencyOf(T anEntry){
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            T t = bag[i];
            if(t.equals(anEntry)){
                frequency++;
            }
        }
        return frequency;
    }
    
    public boolean contains(T anEntry){
        for (int i = 0; i < numberOfEntries; i++) {
            T t = bag[i];
            if(t.equals(anEntry)){
                return true;
            }
        }
        return false;
    }
    
    public T[] toArray(){
        T[] resultArr = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, resultArr, 0, numberOfEntries);
        return resultArr;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag){
        BagInterface<T> newBag = new ArrayBag<T>(this.getCurrentSize() + anotherBag.getCurrentSize());
        newBag.clear();
        
        T[] bag1 = this.toArray();
        T[] bag2 = anotherBag.toArray();
        
        for (T bag11 : bag1) {
            newBag.add((T) bag11);
        }
        for (T bag21 : bag2) {
            newBag.add((T) bag21);
        }
        
        return newBag;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag){
        HashMap<T, Integer> bag1Map = new HashMap<>();
        HashMap<T, Integer> bag2Map = new HashMap<>();
        
        BagInterface<T> newBag = new ArrayBag<>(this.getCurrentSize() + anotherBag.getCurrentSize());
        newBag.clear();
        
        T[] bag1 = this.toArray();
        T[] bag2 = anotherBag.toArray();
        
        // a, a, b in bag1
        // a - > 2
        // b - > 1
        for (T t : bag1) {
            bag1Map.put(t, bag1Map.getOrDefault(t, 0) + 1);
        }
        
        // a, c
        // a - > 1
        // c - > 1
        for (T t : bag2) {
            bag2Map.put(t, bag2Map.getOrDefault(t, 0) + 1);
        }
        
        Iterator<Map.Entry<T, Integer>> iterator = bag1Map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, Integer> bag1Entry = iterator.next();
            T bag1Key = bag1Entry.getKey();
            if (bag2Map.containsKey(bag1Key)) {
                int noDuplicate = Math.min(bag1Entry.getValue(), bag2Map.get(bag1Key));
                for (int i = 0; i < noDuplicate; i++) {
                    newBag.add(bag1Key);
                }
                iterator.remove(); // Safe removal using iterator
                bag2Map.remove(bag1Key);
            }
        }
        
        Iterator<Map.Entry<T, Integer>> iterator2 = bag2Map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<T, Integer> bag2Entry = iterator2.next();
            T bag2Key = bag2Entry.getKey();
            if (bag1Map.containsKey(bag2Key)) {
                int noDuplicate = Math.min(bag2Entry.getValue(), bag1Map.get(bag2Key));
                for (int i = 0; i < noDuplicate; i++) {
                    newBag.add(bag2Key);
                }
                iterator2.remove(); // Safe removal using iterator
                bag1Map.remove(bag2Key);
            }
        }

        return newBag;
    }
    
    @Override
    // A - B
    // = A n B'
    public BagInterface<T> difference(BagInterface<T> anotherBag){
        T[] bag1 = this.toArray();
        T[] bag2 = anotherBag.toArray();
        
        BagInterface<T> newBag = new ArrayBag<T>(this.getCurrentSize());
        newBag.clear();
        
        HashMap<T, Integer> bagMap = new HashMap<>();
        // A
        // a a
        // a -> 2
        for (T t : bag1) {
            bagMap.put(t, bagMap.getOrDefault(t, 0) + 1);
        }
        
        // - B
        // a
        // a -> 1
        for (T t : bag2) {
            if(bagMap.containsKey(t)){
                int bagVal = bagMap.get(t);
                if (bagVal == 1) {
                    bagMap.remove(t);
                }
                else if(bagVal > 0){
                    bagMap.put(t, bagVal-1);
                }
            }
        }
        
        for (Map.Entry<T, Integer> entry : bagMap.entrySet()) {
            T key = entry.getKey();
            Integer val = entry.getValue();
            
            for (int i = 0; i < val; i++) {
                newBag.add(key);
            }
        }
        
        
        return newBag;
    }
} 
