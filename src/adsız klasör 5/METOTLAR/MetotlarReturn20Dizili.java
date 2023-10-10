/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author emregulek
 */
public class MetotlarReturn20Dizili {
    
    // Kendisine parametre olarak gelen String dizisindeki en uzun Stringin olduğu indisi geri döndüren metod.
    
    public static void main(String[] args) {
        
     String dizi [] = {"aaa","aa","aaaaaaaa","aa","aaaa" }   ; 
        
     function(dizi) ;
     
        System.out.println("En kısa Stringimizin yeri = "+function(dizi));
    }
    
    public static int function (String array[]) {
        
       String min = array[0];
       int minyer = 0 ;
       
       for(int i=1 ; i<array.length ; i++) {
           if(array[i].length()<min.length()){
               minyer = i ;
               min = array[i] ;
           }
       }
      
        return minyer+1;
    }
}
