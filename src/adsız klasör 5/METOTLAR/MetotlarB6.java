/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarB6 {
    
    // Sayımızın asal olup olmadığını kontrol eden program = 
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        
        function (number);
        
    }
    
    public static void function (int x) {
        
         if(x==1) {
            System.out.println("Sayımız asal sayı değildir.");
            System.exit(0);
        }
         
        int a=0 ;
        for(int i=2 ; i<x ; i++) {
              
            if(x%i==0) {          
                a++;          
            }            
        }
        
        if(a>0) {
            System.out.println("Sayımız asal sayı değildir.");
        }
        else{
            System.out.println("Sayımız asal sayıdır.");
        }

    }
}
