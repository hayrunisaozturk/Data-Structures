
package week3;

/**
 *
 * @author hayrunisa
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.addNodeOrder(new Node(3,"Three"));
        dll.addNodeOrder(new Node(1,"One"));
        dll.addNodeOrder(new Node(10,"Ten"));
        dll.addNodeOrder(new Node(-1,"minusOne"));
        
        dll.printList();
        
        dll.finddeleteNode(-1);
        dll.printList();

    }
    
    
}
