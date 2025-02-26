
package week1;


public class ArrayClass {
    
    
    private Integer[] array ;  
    private Integer numberItems;
    
    public ArrayClass(Integer maxitems){ 
        this.array= new Integer[maxitems];
        this.numberItems= 0;
    
}
   
    public void printArray(){
        for ( int i =0; i<numberItems ; i++){
            System.out.println("Index " + i  + ": " + array[i]);
        }
    }
    
   
    public void setElement ( Integer i , Integer k){
      if ( i > this.numberItems){
          System.out.println("error index is out of the bound!!".toUpperCase());
      }
      else{
          this.array[i]= k;
          this.numberItems++;
      }
   } 
  
    public int getElement (Integer i ){
        return this.array[i];
        
    }
    
    public void deleteItem ( Integer index ){
        for ( int i = index ; i< this.numberItems; i++){
            this.array[i]= this.array[i+1];
        }
        this.numberItems--;
    }
  
   
    
    public void sort(){
        int temp;
        for(int i = 0; i< this.numberItems; i++){
            for(int j = i + 1 ;j< this.numberItems;j++){
                
                if(this.array[i]>this.array[j]){
                    temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }}
    
}

 
    
    






