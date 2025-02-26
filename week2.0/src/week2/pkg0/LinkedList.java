
package week2.pkg0;

/**
 *
 * @author hayrunisa
 */
public class LinkedList {
    
    public Node head ;
    public int size ;
    
    public LinkedList(){
        this.head = null;
        this.size= 0;
    }
    
    public boolean isEmpty(){
        return ( this.head== null);
    }
    
    public void addNode(Node newNode){
       Node current = this.head;
       if(current == null){
          this.head= newNode;
          this.size ++;
      
           
       }else{
           while(current.next!= null){
               current = current.next;
           }
           current.next = newNode;
           this.size ++;
          
       } 
    }
    
    public void deleteNode(int key){ // delete kısmını tekrar bak.
        Node current = this.head;
        Node prev= null;
        
        if( current == null){
            System.out.println("lıst ıs empty. nothıng to delete".toUpperCase());
         return;
        }
        if(current.id==key){
            this.head = current.next;
            size--;
            System.out.println("deleted node is : ".toUpperCase() + key);
            return;
        }
        if (current.id!=key && current!=null ){
            prev= current;
            current= current.next;
        }
        prev.next= current.next;
        size--;
        System.out.println("deleted node is: ".toUpperCase() + key);

    }
    public void printList(){
        Node currNode = this.head;
        
        System.out.println("LINKEDLIST: ");
        while(currNode != null){
            System.out.println("ıd:".toUpperCase() +  currNode.id + "   name:".toUpperCase() + currNode.name .toUpperCase() );
            currNode = currNode.next;
        }
    
    }
}
  /*Node y= current.next;
            while(y.id==key){
               y= y.next;
              current= current.next;
              
            }
            y.next= current.next;
            this.size--;
            return;*/