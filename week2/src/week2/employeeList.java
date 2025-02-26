
package week2;

public class employeeList {
    
    public Employee head;
    public Employee tail;
    public String node;
    
    public  employeeList(){
        this.head = null;
    }
  
    public void addEmployee(Employee e) {
        
        if (this.head == null || this.head.idNumber > e.idNumber) {
            e.next = this.head; 
            this.head = e;     
        } else {
            Employee emp = this.head; 
            while (emp.next != null && emp.next.idNumber < e.idNumber) {
                emp = emp.next;
            }
            e.next = emp.next;
            emp.next = e;      
        }
    }
 public class Node {
    int idNumber;
    Node next;  // Bu, linked list için bir sonraki düğümü işaret eder.

    // Yapıcı (constructor)
    public Node(int idNumber) {
        this.idNumber = idNumber;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    Node tail;
    Node prev;

    public void addNoderOrder(Node n) {
        if (head == null) {
            head = n;
            tail = n;
            return;
        }

        if (head.idNumber > n.idNumber) {
            if (head == tail) {
                
                n.next = head;
                head.prev= n;
                head = n;
            }        
            if(tail.idNumber < n.idNumber){
                tail.next= n;
                m.prev
            }
        }
    }
}

   

    public void printEmployees(){
        
        Employee current = this.head;
        while (current != null) {
            System.out.print(current.name);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
