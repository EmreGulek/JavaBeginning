/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn16 {
    
    
    // Kendisine parametre olarak gelen Stringin palindrom olup olmadığını bulunuz.
    
    public static void main(String[] args) {
        
   Scanner k = new Scanner(System.in);
        
   String word = k.next();
   function(word);
   
   if(function(word)>0) {
       System.out.println("Palindrom");
   }
   else{
       System.out.println("Palindrom değil.");
   }
   
    }
    
    public static int function ( String str ) {
        int sayac=0 ;
        int x = 0 ;
        for(int i=0 , j=str.length()-1 ; i<str.length()/2 && j>=str.length()/2 ; i++ , j--) {
           
                if(str.charAt(i)==str.charAt(j)){
                    x++ ;
                }
        }
        
        if(x==str.length()/2) {
            sayac++;
                    
        }
        
        return sayac ;
    }
}