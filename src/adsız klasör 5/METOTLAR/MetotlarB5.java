/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarB5 {
    
  //  Klavyeden girilen sayının faktöriyelini hesaplayan  metot = 
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
            
        System.out.println("Faktöriyeli alınacak olan sayımızı giriniz.");
        int number = k.nextInt();
        
        function (number) ;
      
    }
  
    public static void function (int x) {
        int procces =1 ;
        for (int i=1 ; i<=x ; i++){
            procces *= i ;
        }
        System.out.println("Sayımızın Faktöriyeli = "+procces);
    }
    
    
}
