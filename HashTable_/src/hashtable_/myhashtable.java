/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable_;

/**
 *
 * @author hayrunisa
 */
public class myhashtable {
    

    
    int[] table;
    int prime;
    int size;
    
    public myhashtable(int capacity){
        
        prime = 17;
        
        table = new int [capacity];
        
        for(int i = 0; i < capacity;i++){
            table[i] = -1;
        }
        
        size = 0;
    }
    public void putLinear(int key){
        int index = hash(key);
        int originalIndex = index;
        
        while(table[index]!= -1){
            if(table[index] == key){
                System.out.println("Key already exist: " + key);
                return;
            }
            index = (index + 1) % table.length;
            if(index == originalIndex){
                System.out.println("Hash table is full");
                return;
            }
        }
        
        table[index] = key;
        size++;
    }
    
    public void putQuadratic(int key){
        int index = hash(key) % table.length;
        int originalIndex = index;
        int i = 1;
        
        while(table[index] != -1){
            if(table[index] == key){
                System.out.println("Key already exist: " + key);
                return;
            }
            
            index = hash(originalIndex + i * i) % table.length;
            i++;
            if(size == table.length){
                System.out.println("Hash Table is Full");
                return;
            }
        }
        table[index] = key;
        size++;
    }
    public void putDoubleHashing(int key){
        int index = hash(key);
        int stepSize = 7 - (key % 7);
        int originalIndex = index;
        
        while(table[index] != -1){
            if(table[index] == key){
                System.out.println("Key already exist: " + key);
                return;
            }   
            index = (index + stepSize) % table.length;
            if(size == table.length){
                System.out.println("Hash table is full");
                return;
            }
            table[index] = key;
            size++;
        }
    }
    
    public int hash(int key){
        return key % prime;
    }

    
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + ": " + (table[i] != -1 ? table[i] : "null"));
        }
    }
    
    
}

    
