/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Lab5;

/**
 *
 * @author szeyu
 */
public class TestSList {
    public static void main(String[] args) {
        SList DLL = new SList();
        
        DLL.appendEnd("Linked list");
        DLL.appendEnd("is");
        DLL.appendEnd("easy");
        
        DLL.display();
        
        System.out.println("Removed value: " + DLL.removeInitial());
        DLL.display();
        
        System.out.println("difficult in the list?" + DLL.contains("difficult"));
        
        DLL.clear();
    }
}
