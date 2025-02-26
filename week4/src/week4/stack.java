


package week4;

/**
 *
 * @author hayrunisa
 */
public class stack <T>{
    
    public Object[] sarray ;
    public int top ;
    
    public stack ( int size ){
        sarray= new Object[size];
        this.top = -1;
    }
    public void push(T data){
        if(isFull()){
            System.out.println("stack ıs full !!!".toUpperCase());
            
        }else{
            top++;
            sarray[top] =data;
        }
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("stack ıs empty!!!".toUpperCase());
            return null;
        }
        else{
            return (T) sarray[top--];    
        }
        
        
    }
    
    public boolean isFull(){
       return (sarray.length-1== top);
   }
    public boolean isEmpty(){
       return top == -1;
   }
    
    
    public void printStack(){
        if(isEmpty()){
            System.out.println("stack ıs empty ".toUpperCase());
            
        }
        else{
            for(int i= top ; i> -1; i--){
                if(i== top){
                    System.out.println(sarray[i] + " ---> TOP");
                    
                }else{
                    System.out.println(sarray[i] + " ");
                }
            
        }
            
        }
    }
    
    
 
    
    
    
}
