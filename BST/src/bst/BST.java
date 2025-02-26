/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

/**
 *
 * @author hayrunisa
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  

        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insert(10);
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(20);
        bst.insert(15);
        bst.insert(25);
        
        bst.printInorder(bst.root);
        
        bst.deleteRecursive(8);
        System.out.println();
        bst.printInorder(bst.root);
        
        bst.deleteRecursive(10);
        System.out.println();
        
        bst.printInorder(bst.root);

        
        
    }
   
    
    
}


