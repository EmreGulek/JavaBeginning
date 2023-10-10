/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn14 {
    
    // Kendisine parametre olarak gelen iki String ten uzun olanı geri döndüren methodu yazınız.
    
    public static void main(String[] args) {
        
        String word1 = "abcde" ;
        String word2 = "abcdefgh" ;
        
        function(word1 , word2) ;
        System.out.println("Stringlerimizden en uzun olan = "+function(word1,word2));
    }
    
    public static String function (String x , String y) {
        int sayac1=0 ;
        int sayac2=0 ;
        String longstr = "" ;
        
        for(int i=0 ; i<x.length() ; i++) {
            sayac1++ ;
        }
        for(int i=0 ; i<y.length() ; i++) {
            sayac2++ ;
        }
        
        if(sayac1>sayac2) {
            longstr = x ;
        }
        else{
            longstr = y ;
        }
        
        return longstr ;
        
    }
}

