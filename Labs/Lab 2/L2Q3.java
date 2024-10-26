/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author szeyu
 */

class StorePairGeneric<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<StorePairGeneric<A, B>> {

    private A first;
    private B second;

    public StorePairGeneric(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setPair(A first, B second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    // b)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        StorePairGeneric<? extends Number, ?> other = (StorePairGeneric<? extends Number, ?>) obj;
        return first == other.getFirst();
    }
    
    // c)
    @Override
    public int compareTo(StorePairGeneric<A, B> o) {
        return this.getFirst().compareTo(o.getFirst());
    }
    
}


public class L2Q3 {
    public static void main(String[] args) {
        
        // d)
        StorePairGeneric<Integer, Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer, Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer, Integer> c = new StorePairGeneric<>(6,3);
        
        // e)
        System.out.println("a.compareTo(c): " + a.compareTo(c));
    System.out.println("a.equals(c): " + a.equals(c));
    System.out.println("b.equals(c): " + b.equals(c));
    System.out.println("b.compareTo(c): " + b.compareTo(c));
    }
}
