/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        

/**
 *
 * @author emregulek
 */
public class MetotlarReturn15 {
    
    // Kendisine parametre olarak gelen Stringte 'a' kelimesinin bulunup bulunmadığını bulunuyorsa kaç tane bulunduğunu giriniz.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        String word = k.next();
        
        function(word);
        
        if(function(word)>0) {
            System.out.println("Stringimizde "+function(word)+" tane a harfimiz var.");
        }
        else {
            System.out.println("Stringimizde a harfi bulunmamaktadır.");
        }
    }
    
    public static int function(String x) {
        int sayac=0 ;
        for(int i=0 ; i<x.length() ; i++) {
          if (x.charAt(i)== 'a' ){
              sayac++ ;
          }
        }
        return sayac ;
    } 
}
