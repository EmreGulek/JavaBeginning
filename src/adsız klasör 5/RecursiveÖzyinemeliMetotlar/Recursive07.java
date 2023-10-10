/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive07 {
    
    // Kendisine parametre olarak gelen dizide kaç tane pozitif sayı olduğunu bulan rekürsif fonksiyon.
    
    public static void main(String[] args) {
        
        int dizi[] = {0,1,2,3,4,5,-1,-1} ;
        
       int x =  function(dizi,0 , 0);
        System.out.println(x);
    }
            
    public static int function(int array[] , int i , int sayac) {
      
      if(i<array.length) { 
        if(array[i]>0) {
            sayac = sayac + 1 ;
            i = i+1 ;
            return function(array,i,sayac) ;
        }
        
        else{
            i = i + 1 ;
            return function(array,i,sayac) ;
        }
      }
      else {
          return sayac ;
      }
       
    }
}
