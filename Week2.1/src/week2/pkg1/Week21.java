
package week2.pkg1;


public class Week21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Employee EmArray[]= new Employee[10];
       
        EmArray[0] = new Employee(2000, "Ahmet", 1023);
        EmArray[1] = new Employee(4000, "Zeynep", 1234);
        EmArray[2] = new Employee(3000, "Mehmet", 2365);
        EmArray[3] = new Employee(5000, "Gizem", 4256);
        EmArray[4] = new Employee(2300, "Onur", 4568);
        EmArray[5] = new Employee(2000, "Ali", 5988);
        EmArray[6] = new Employee(4000, "Melike", 6648);
        EmArray[7] = new Employee(3000, "Ayse", 7265);
        EmArray[8] = new Employee(5000, "Furkan", 7699);
        EmArray[9] = new Employee(2300, "Omer", 8982);
        
        
        employeeList firm= new employeeList();
        
        firm.addOrderEmployee(new Employee (2000, "Ahmet", 1023));
        firm.addOrderEmployee(new Employee (4000, "Zeynep", 1234));
        firm.addOrderEmployee(new Employee (3000, "Mehmet", 2365));
        firm.addOrderEmployee(new Employee (5000, "Gizem", 4256));
        firm.addOrderEmployee(new Employee (2300, "Onur", 4568));
        firm.addOrderEmployee(new Employee (2000, "Ali", 5988));
        firm.addOrderEmployee(new Employee (4000, "Melike", 6648));
        firm.addOrderEmployee(new Employee (3000, "Ayse", 7265));
        firm.addOrderEmployee(new Employee (5000, "Furkan", 5000));
        
        
        firm.printEmployee();
        firm.findEmployee(7265);
        firm.findMedian();
        
    }///bu kısmı bilmiyorum çalış 
    
        public static Employee findEmployee(Employee[] Earray, int key){
        int l = 0;
        int r = Earray.length;
        int m = (l+r)/2;
        int comp = 0;
        
        while(l < r){
            if(Earray[m].idNumber > key){
                r = m;
                comp++;
            }else if(Earray[m].idNumber < key){
                l = m;
                comp++;
            }else{
                comp++;
                System.out.println("Key found at index " + m + " with " + comp + " comparison.");
                return Earray[m];
            }
            m = (l + r)/2;
        }
        System.out.println("The Employee has key " + key + " couldn't find in the array" );
        return null;                    
    }
}
    
    
