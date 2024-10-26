/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q1;

/**
 *
 * @author szeyu
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        
        System.out.println(list1);
        System.out.println(list2);
        
        System.out.println("The newList is:");
        int n1 = list1.getSize();
        int n2 = list2.getSize();
        
        int i = 0, j = 0;
        
        int ele1 = list1.removeFirst();
        int ele2 = list2.removeFirst();
        
        while(i < n1 && j < n2){
            System.out.println(newList);
            
            if(ele1 < ele2){
                newList.addLast(ele1);
                i++;
                if(i < n1)
                    ele1 = list1.removeFirst();
            }
            
            else {
                newList.addLast(ele2);
                j++;
                if(j < n2)
                    ele2 = list2.removeFirst();
            }
        }
        
        while(i < n1){
            newList.addLast(ele1);
                i++;
                if(i < n1)
                    ele1 = list1.removeFirst();
        }
        
        while(j < n2){
            newList.addLast(ele2);
                j++;
                if(j < n2)
                    ele2 = list2.removeFirst();
        }
        
        
        System.out.println(newList);
        
    }
}
