
package week1;


public class Week1 {

    
    public static void main(String[] args) {
        
        ArrayClass array = new ArrayClass(10); 
        
        array.setElement(0, 1);
        array.setElement(1, 5);
        array.setElement(2, 2);
        array.setElement(3, 7);
       
        array.sort();
        array.deleteItem(2);
        array.printArray();
        
        
        
        
        
      
       
        

    }
    
}
