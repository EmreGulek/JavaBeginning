/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn10 {
    
    // Kendisine parametre olarak Stringteki küçük karakterlerin sayısını geri döndüren metodu yazınız.
    
    public static void main(String[] args) {
        
        String name = "EmrE" ;
        
       function(name) ;
        System.out.println("Stringimizde "+function(name)+" tane küçük harf var.");
    }
    
    public static int function (String x) {
        int sayac = 0 ;
        for(int i=0 ; i<x.length() ; i++) {
            for(char j='a' ; j<='z' ; j++ ) {
                if(x.charAt(i)==j) {
                    sayac++ ;
                }
            }
        }
        return sayac ;
    }
}
