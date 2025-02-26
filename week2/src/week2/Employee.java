
package week2;


public class Employee {
    public float salary;
    public String  name;
    public int idNumber;
    public Employee next;
    
    public Employee(float  sal, String nm, int id){
        this.salary = sal;
        this.name   = nm;
        this.idNumber = id;
    }
    
}