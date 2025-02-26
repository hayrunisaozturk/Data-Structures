
package week2.pkg1;


public class employeeList {
    
    
    Employee head ;
    
    
    public employeeList(){
        this.head= null;
    }
    
    public void addEmployee(Employee e){ 
        if(this.head==null){
            this.head= e ;
            
        }else{
            Employee current= this.head;
            while(current.next== null){
                current = current.next;
            }
            current.next= e;
           
        }
    }

    
    public void addOrderEmployee(Employee e ){
          if(this.head == null||this.head.idNumber > e.idNumber){
              e.next = this.head;
              this.head= e;
              
          }else{
              Employee current= this.head;
              while( current.next != null&& e.idNumber>current.next.idNumber){
                  current= current.next;
              }
              e.next= current.next;
              current.next= e;
          }
    }
    
   public void findEmployee(int key){ 
       
        if (this.head == null) {
        System.out.println("The list is empty.".toUpperCase());
        return;
       }
       if( this.head.idNumber== key){
           System.out.println("ID: " + this.head.idNumber + " name: ".toUpperCase() +
                   this.head.name .toUpperCase() );
          
       }else{
           Employee current = this.head;
           while(current!= null){
               if(current.idNumber== key){
                 System.out.println("fındıng employee ıs : ".toUpperCase() + current.name.toUpperCase()+ "  ıd: ".toUpperCase() + current.idNumber);  
                 return;
               }
               current = current.next;
           }
       }
      System.out.println("The Employee with key ".toUpperCase() + key + " couldn't be found in the list.".toUpperCase());
       
   }
   
   public void printEmployee(){
       Employee current= this.head;
       while (current != null){
           System.out.print(current.name.toUpperCase());
           if( current.next != null){
               System.out.print(" --> ");
               
           }
           current= current.next;
       }
       System.out.println();
       
   }
   
   
   public void findMedian (){
        Employee fast = this.head;
        Employee slow = this.head;
        
        while(fast!= null&& fast.next != null){
            slow =slow.next;
            fast= fast.next.next;
        }
        System.out.println("medıan employee is : ".toUpperCase() + slow.name.toUpperCase());
       
   }
}
