/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13.BST;

/**
 *
 * @author szeyu
 */
import java.util.ArrayList;

public class BST<E extends Comparable<E>> {

    private TreeNode<E> root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }
    
    public BST(E[] eArr) {
        root = null;
        size = 0;
        for (int i = 0; i < eArr.length; i++) {
            E e = eArr[i];
            insert(e);
        }
    }

    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.value) == 0) {
                return true;
            } else if (e.compareTo(current.value) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public boolean insert(E e) {
        TreeNode<E> newNode = new TreeNode<>(e);
        if (size == 0) {
            root = newNode;
            size++;
            return true;

        } else {
            TreeNode<E> current = root;
            TreeNode<E> parentNode = null;
            while (current != null) {
                parentNode = current;
                if (e.compareTo(current.value) < 0) {
                    current = current.left;
                } else if (e.compareTo(current.value) > 0) {
                    current = current.right;
                } else {
                    return false; // no duplicate
                }
            }

            if (e.compareTo(parentNode.value) < 0) {
                parentNode.left = newNode;
            } else {
                parentNode.right = newNode;
            }

            size++;
            return true;
        }
    }

    public int getSize() {
        return size;
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }

        TreeNode<E> leftTree = node.left;
        TreeNode<E> rightTree = node.right;

        return 1 + Math.max(height(leftTree), height(rightTree));
    }

    public E getRoot() {
        if (root == null) {
            return null;
        }
        return root.value;
    }

    public E minValue() {
        if (root == null) {
            return null;
        }
        TreeNode<E> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public E maxValue() {
        if (root == null) {
            return null;
        }
        TreeNode<E> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public ArrayList<TreeNode<E>> path(E e) {
        ArrayList<TreeNode<E>> arrayPath = new ArrayList<>();

        TreeNode<E> current = root;
        while (current != null) {
            arrayPath.add(current);
            if (e.compareTo(current.value) == 0) {
                return arrayPath;
            } else if (e.compareTo(current.value) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        
        return null;
    }

    public boolean delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parentNode = null;
        
        while (current != null) {
            if (e.compareTo(current.value) < 0) {
                parentNode = current;
                current = current.left;
            } else if (e.compareTo(current.value) > 0){
                parentNode = current;
                current = current.right;
            } else {
                break; // node found
            }
        }
        
        if(current == null){
            return false; // node not found
        }
        
        // case 1
        // if current does not have a left child
        if(current.left == null){
            // handle the case if the delete node is root
            if (parentNode == null){
                root = current.right;
            }
            
            // parent don't know his current is left or right
            
            // current attach to parent node right side
            if(parentNode.value.compareTo(current.value) < 0){
                parentNode.right = current.right;
            } 
            // current attach to parent node left side
            else {
                parentNode.left = current.right;
            }
        } 
        
        // case 2
        // current has a left child
        else {
            TreeNode<E> parentRightMost = current;
            TreeNode<E> rightMost = current.left;
            while(rightMost.right != null){
                parentRightMost = rightMost;
                rightMost = rightMost.right;
            }
            
            current.value = rightMost.value;
            
            if(parentRightMost.right == rightMost)
                parentRightMost.right = rightMost.left;            
            else
                // special case
                // if parentRightMost = current
                parentRightMost.left = rightMost.left;
        }
        size--;
        return true;
    }

    public boolean clear() {
        root = null;
        size = 0;
        return true;
    }
    
    public void inorder(){
        inorder(root);
    }
    
    public void preorder(){
        preorder(root);
    }
    
    public void postorder(){
        postorder(root);
    }
    
    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
