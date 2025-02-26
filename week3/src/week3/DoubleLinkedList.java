
package week3;

/**
 *
 * @author hayrunisa
 */
public class DoubleLinkedList {
    public Node head;
    public Node tail;
    
    public DoubleLinkedList(){
        this.head= null;
        this.tail= null;
        
    }
    
    public void addNodeOrder(Node newNode ){
        if(head == null){
            head= newNode;
            tail= newNode;
            return;
        }
        if( this.head.id> newNode.id){
            newNode.next= this.head ;
            head.prev= newNode;
            head= newNode;
            return;
        }
        if(tail.id< newNode.id){
            tail.next= newNode.prev;
            newNode.prev= tail;
            tail= newNode;
            return;
        }
        Node current = head;
        while(current.id< newNode.id){
            current= current.next;
        }
        current.prev.next= newNode;
        newNode.next= current;
        newNode.prev= current.prev;
        current.prev= newNode;
      
    } 
    
    public Node finddeleteNode( int key){
        if(head== null){
            System.out.println("lıst ıs empty!".toUpperCase());
            return null;
        }
        Node temp;
        if(head.id== key){
            temp= head;
          if (tail== head){
              tail= null;
              head= null;
              return temp;
          }
          head= head.next;
          head.prev= null;
          return temp;
        }
        if(tail.id== key){
            temp = tail;
            tail= tail.prev;
            tail.next= null;
            return tail;
        }
       temp = head;
       while(temp!=null && temp.id!= key ){
           temp = temp.next;
       }
       if(temp== null){
           System.out.println("the element couldny fing in the list:".toUpperCase() + key);
           return null;
       }
       temp.prev.next= temp.next;
       temp.next.prev=temp.prev ;
       return temp;
       
    }
    
    public void printList (){
        if(head == null){
            System.out.println("THE lıst ıs empty".toUpperCase());
        }
        else{
            Node current= head;
            while( current!= null){
                System.out.println(current.id + " " + current.name + " <-> ");
                current=current.next;
            }
            
            System.out.println();
        }
    }
}
