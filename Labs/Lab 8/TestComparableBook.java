/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8.LabPriorityQueue;

/**
 *
 * @author szeyu
 */
import java.util.Queue;

class ComparableBook implements Comparable<ComparableBook>{
    private int id;
    private String bookName;
    
    public ComparableBook(int id, String bookName){
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }
    
    @Override
    public int compareTo(ComparableBook anotherBook){
        return this.id - anotherBook.getId();
    }

    @Override
    public String toString() {
        return "(" + "id=" + id + ", bookName=" + bookName + ')';
    }
}

public class TestComparableBook {

    public static void main(String[] args) {
        Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));
        System.out.println(BookQueue);
        while (BookQueue.peek() != null) {
            System.out.println("Head Element: " + BookQueue.peek());
            BookQueue.remove();
            System.out.println("Priority queue: " + BookQueue);
        }
    }
}
