
package week2.pkg0;


public class Week20 {

    
    public static void main(String[] args) {
        
       Node n1= new Node(0, "Node 1 ");
       LinkedList list= new LinkedList();
       
       list.addNode(n1);
      
       
       for ( int i = 1 ; i< 8 ;i++){
           Node newNode = new Node(i, "Node " + (i+1));
           list.addNode(newNode);
       }
       
       
       list.printList();
       
       
        System.out.println("--------------------");
    
       list.deleteNode(5);
       list.deleteNode(0);
       list.deleteNode(6);
       list.printList();
       
       
       
       
        
        
        
   
    }
    
}
