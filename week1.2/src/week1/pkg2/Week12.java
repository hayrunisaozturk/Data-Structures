/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1.pkg2;

/**
 *
 * @author hayrunisa
 */
public class Week12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] integerarray ={ 1, 2, 3, 4, 5, 6};
        Double [] doublearray= {1.1 , 2.2 , 3.3 , 4.4 ,5.5 , 6.6 };
        Character [] characterarray= { 'H' , 'A' , 'Y' , 'R' , 'U'};
        
        printArray(integerarray);
        System.out.println();
        printArray(doublearray);
        System.out.println();
        printArray(characterarray);
    }
    
    // ya da ayrı ayrı yapılabilir.1.
    
    public static void printArray(Integer [] inputarray){
        for(Integer element : inputarray){
            System.out.print(element  + " ");
        }
    }
    
    
    public static void printArray(Double[] inputarray){
        for(Double element : inputarray){
            System.out.print(element  + " ");
        }
    }
    
    
    public static void printArray(Character[] inputarray){
        for(Character element : inputarray){
            System.out.print(element  + " ");
        }
    }
    
    
    /*
    // generic kullanarak 2.
    public static <T> void printArray (T[] inputarray){
        for (T element : inputarray){
            System.out.print(element + " ");
        }
    }*/
    
    /*3.
    public static void printArray (Object[] inputArray){
        for (Object element : inputArray){
            System.out.print(element + " ");
            
        }
       
    }*/
    
}
