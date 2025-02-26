
package week2.pkg1;


public class Employee {
    public float salary ;
    public String name ;
    public int idNumber;
    public Employee next ;
    
    
    public Employee( float salary , String name , int idNumber ){
        this.salary= salary;
        this.name= name;
        this.idNumber= idNumber;
        this.next= null;
    }
    
}
