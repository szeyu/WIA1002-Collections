/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.BST;

import java.util.ArrayList;

/**
 *
 * @author szeyu
 */
public class TestBST {
    public static void main(String[] args) {
        Integer[] inputData = {45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14};
        BST<Integer> bst = new BST<>(inputData);
        System.out.print("Input Data: ");
        System.out.print(inputData[0]);
        for (int i = 1; i < inputData.length; i++) {
            System.out.print(", " + inputData[i]);
        }
        System.out.println();
        
        System.out.print("Inorder (sorted): ");
        bst.inorder();
        System.out.println();
        
        System.out.print("Postorder: ");
        bst.postorder();
        System.out.println();
        
        System.out.print("Preorder: ");
        bst.preorder();
        System.out.println();
        
        System.out.println("Height of BST: " + bst.height());
        
        System.out.println("Root for BST is: " + bst.getRoot());
        
        System.out.println("Check whether 10 is in the tree? " + bst.search(10));
        
        System.out.println("Delete 53");
        bst.delete(53);
        
        System.out.print("Updated Inorder data (sorted): ");
        bst.inorder();
        System.out.println();
        
        System.out.println("Min Value :" + bst.minValue());
        System.out.println("Max Value :" + bst.maxValue());
        System.out.print("A path from the root to 6 is: ");
        ArrayList<TreeNode<Integer>> pathArr = new ArrayList<>();
        pathArr = bst.path(6);
        for (int i = 0; i < pathArr.size(); i++) {
            System.out.print(pathArr.get(i).value + " ");
        }
        System.out.println();
    }
    
    
}
