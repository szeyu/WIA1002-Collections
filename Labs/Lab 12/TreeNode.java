/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.BST;

/**
 *
 * @author szeyu
 */
import java.util.Comparator;

public class TreeNode<E extends Comparable<E>>{
    protected E value;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    
    public TreeNode(E value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
}
