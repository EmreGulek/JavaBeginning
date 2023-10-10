/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarB7 {
    
    // Girdiğimiz sayımızın basamak sayısını yazdıran program.
    
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        function(number);
        
    }
    
    public static void function(int x) {
        int m = 1 ;
        int calculation =0 ;
 
        
        while(m==1) {
            x=x/10 ;
              calculation++ ;   
            
            if(x==0) {
                System.out.println(calculation);
                m++;
            }
            
       
        }
    }
    
    
}
