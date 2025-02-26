
package week2;


public class Week2 {

    public static void main(String[] args) {
        
        employeeList firm = new employeeList();
        Employee EmArray[] = new Employee[10];
        
        EmArray[0] = new Employee (2000, "Ahmet", 1023);
        EmArray[1] = new Employee (4000, "Zeynep", 1234);
        EmArray[2] = new Employee (3000, "Mehmet", 2365);
        EmArray[3] = new Employee (5000, "Gizem", 4256);
        EmArray[4] = new Employee (2300, "Onur", 4568);
        EmArray[5] = new Employee (2000, "Ali", 5988);
        EmArray[6] = new Employee (4000, "Melike", 6648);
        EmArray[7] = new Employee (3000, "Ayse", 7265);
        EmArray[8] = new Employee (5000, "Furkan", 7699);
        EmArray[9] = new Employee (2300, "Omer", 8982);
        
          
        firm.addEmployee(new Employee (2000, "Ahmet", 1023));
        firm.addEmployee(new Employee (4000, "Zeynep", 1234));
        firm.addEmployee(new Employee (3000, "Mehmet", 2365));
        firm.addEmployee(new Employee (5000, "Gizem", 4256));
        firm.addEmployee(new Employee (2300, "Onur", 4568));
        firm.addEmployee(new Employee (2000, "Ali", 5988));
        firm.addEmployee(new Employee (4000, "Melike", 6648));
        firm.addEmployee(new Employee (3000, "Ayse", 7265));
        firm.addEmployee(new Employee (5000, "Furkan", 7699));
        firm.addEmployee(new Employee (2300, "Omer", 8982));
        
               
        firm.printEmployees();
        
       if(EmArray.length%2 == 1 ){
          int  emp= (( EmArray.length + 1 )/2 )-1 ; //index -1 
           System.out.println("Çalışan:" + EmArray[emp].name + " "+ EmArray[emp].idNumber);
       }
       else {
           int emp1= EmArray.length/2;
           int emp2= EmArray.length/2 -1;
           System.out.println("Çalışan 1: " + EmArray[emp1].name
                          +   "\nÇalışan 2: " + EmArray[emp2].name);
           
       }
       
        
    
    
    
    }}
