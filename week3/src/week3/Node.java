
package week3;

/**
 *
 * @author hayrunisa
 */
public class Node {
    
    public int id ;
    public String name ;
    public Node next;
    public Node prev;
    
    public Node(int id , String name){
        this.id= id;
        this.name= name;
        this.next= null;
        this.prev= null;
    }
    
}
