/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class Recursive05 {
    
    // Kendisine parametre olarak gelen String i ters çeviren Rekürsif fonksiyon.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        String name = k.next();
        
        System.out.println("Sonucumuz = "+function(name ,"", name.length()-1));
        
    }
            
    public static String function (String ad , String toplam , int basamak) {
        
        if(basamak==0) {
            toplam += ad.charAt(basamak) ;
            return toplam ;
            
        }
        
        else {
            toplam += ad.charAt(basamak) ;
            
            return function(ad,toplam,--basamak) ;
        }
    }
            
    
}
