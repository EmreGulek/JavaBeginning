/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive01 {
    
    public static void main(String[] args) {
        
       // Kendisine parametre olarak gelen sayıların toplamı   =  
        
        function(10);
        System.out.println("Sonucumuz "+function(10));
    }
    
    public static int function(int x) {
        
        if(x==1) {
            return 1 ;
        }
        
        else {
            return x+function(x-1);
        }
    }
}
