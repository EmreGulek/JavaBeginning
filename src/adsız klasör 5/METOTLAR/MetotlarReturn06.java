/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn06 {
    
    // Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren metod.
    
    public static void main(String[] args) {
        
        int number = 353 ;
        
        function(number) ;
        System.out.println(function(number)+" basamaklıdır.");
    }
    
    public static int function (int x) {
        
        int sayac = 0 ;
        int finished = 0 ;
        
        while (true){
            x = x/10 ;
            sayac++ ;
              
        if(x==0) {
        
            break ;
        }
        }
        
     
        return sayac ;
    }
}
