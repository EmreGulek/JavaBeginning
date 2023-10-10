/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn07 {
    
    //  Kendisine parametre olarak gelen pozitif tam sayının faktöriyelini geri döndüren method yazınız.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        int number ;
        
        do {
            System.out.println("Lütfen pozitif bir tam sayı giriniz = ");
             number = k.nextInt();
        }
        
        while(number<=0) ;
        
         function(number);
         
         System.out.println("Girdiğiniz sayının fakötririyeli = "+function(number));
    }
    
   public static int function (int x) {
       
       int procces = 1 ;
       
       for(int i=2 ; i<=x ; i++) {
           procces *= i ;
       }
       
       return procces ;
   }
  
   
    
}
