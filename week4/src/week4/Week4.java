
package week4;

/**
 *
 * @author hayrunisa
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        stack stack= new stack(5);
        stack.push(10);
        stack.push("shdhsda");
        stack.push(20.6);
        stack.printStack();
       
        System.out.println("popped element : ".toUpperCase() + stack.pop());
        System.out.println("-----------");
        stack.printStack();
        
        queue myQueue= new queue();
        myQueue.enqueue(10);
        myQueue.enqueue(30);
        myQueue.enqueue(45);
        myQueue.enqueue(76);
       
        myQueue.printqueue();
       
        myQueue.dequeue();
       
        myQueue.printqueue();


        
        
        
    }
    
}

