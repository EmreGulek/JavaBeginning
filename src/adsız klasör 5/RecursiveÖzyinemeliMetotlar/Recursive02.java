/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class Recursive02 {
    
    // Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonksiyon .
    
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        
         System.out.println(function(number));
        
        
    }
    
    public static int function (int sayi) {
        
    
        
        if(sayi==0) {
             
            return 0 ;
        }
        
        else {
      
            return 1+function(sayi/10) ;
        }
   
        
    }
    
}
