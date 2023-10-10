/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn31 {
    
    // Kendisine parametre olarak gelen tamsayının asal olup olmadığını geri döndüren method.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
       
        int number = k.nextInt();
        
        function (number);
        
        if(function(number)>0){
            System.out.println("Girdiğiniz sayı asal sayı değildir.");
        }
        else{
            System.out.println("Girdiğiniz sayı asaldır.");
        }
        
        
    }
    
    public static int function(int x) {
        
       int sayac = 0 ;
       
       if(x==1){
           sayac++ ;
         
       }
       
       for(int i=2 ; i<x ; i++) {
           if(x%i==0) {
               sayac++ ;
           }
       }
        
       return sayac ;
    }
}
