
package week4;

/**
 *
 * @author hayrunisa
 */
public class queue {
    
     public Node front ;
     public Node rear ;
     public int size ;
    
    public queue (){
        front= null;
        rear= null;
        size=0;
    }
    
    public void enqueue(int data){
        
        Node n = new Node (data);
        if(rear== null){
            rear= n ;
            front = n ;
            size++;
        }else{
            rear.next= n;
            rear= n ;
            size++;
        }
        
    }
    
    public Node dequeue(){
     
        if(front==null){
            System.out.println("queue is empty!!".toUpperCase());
            return null;
        }else{
            Node rfront = front;
            front = front.next;
            size--;
            return rfront;
        }
        
    }
    
     public void printqueue (){
         if(!isEmpty()){
             Node current= front ;
             while( current != null){
                 System.out.print(current.data + (current.next != null ? " -> " : ""));
                 current= current.next;
             }
             System.out.println();
         }
     }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    
    
    
}
