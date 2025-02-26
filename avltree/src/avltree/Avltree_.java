/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avltree;

import static java.lang.Double.max;

/**
 *
 * @author hayrunisa
 */
public class Avltree_ {
    
  
    Node root;
    
    public Avltree_(){
        
        this.root = null;
    }
    
    
    public void insert(int newData){
        this.root = insert(root,newData);
    }
    
    
    
    public Node insert(Node root,int newData){
        
        if(root == null){
            root = new Node(newData);
            return root;
        }
        if(root.data > newData){
            root.left =  insert(root.left, newData);
        }else if(root.data < newData){
            root.right = insert(root.right,newData);
        }else{
            return root; // same key
        }
        
        
        
        updateDepth(root);
        int balance = getBalance(root);
        
        
        
        if(balance < - 1){
            if(getBalance(root.left) <= 0){
                //rotateRight
                root = rightRotate(root);
            }else{
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        }
        
        
        
        if(balance > 1){
            if(getBalance(root.right) >= 0){
                root = leftRotate(root);
            }else{
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }
        return root;
    }
    
    
    
    
    public Node leftRotate(Node root){
        Node rightChild = root.right;
        
        root.right = rightChild.left;
        rightChild.left = root;
        
        updateDepth(root);
        updateDepth(rightChild);
        
        return rightChild;
    }
    
    
    
    public Node rightRotate(Node root){
        Node leftChild = root.left;
        
        root.left = leftChild.right;
        leftChild.right = root;
        
        updateDepth(root);
        updateDepth(leftChild);
        
        return leftChild;
    }
    
    
    
    public void updateDepth(Node root){
        
        int lDepth = findDepth(root.left);
        int rDepth = findDepth(root.right);
        
        root.depth = (int) (max(lDepth,rDepth) + 1);
        
    }
    
    
    
    public void printPreOrder(){ printPreOrder(this.root);}
    public void printPreOrder(Node current){
        
        if(current == null)
            return;    
        
        System.out.print(current.data + " ");
        printPreOrder(current.left);
        printPreOrder(current.right);
    }
    
    
    
   
    public int getBalance(Node node){
        return findDepth(node.right) - findDepth(node.left);
    }
    
    
    public int findDepth(Node node){
        if(node != null)
            return node.depth;
        return -1;
    }
}

    

