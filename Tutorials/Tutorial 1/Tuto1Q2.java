/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author szeyu
 */
class Person {

    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {

    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

public class Tuto1Q2 extends Employee {

    public Tuto1Q2() {
        System.out.println("(4) Performs Faculty's tasks");
    }

    public static void main(String[] args) {
        new Tuto1Q2();
    }
}
