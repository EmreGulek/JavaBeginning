/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive09 {
    
    // Kendisine parametre olarak gelen dizinin simetrik olup olmadığını hesaplayan rekürsif fonksiyon.
    
    public static void main(String[] args) {
        
        String dizi [] = {"1","2","3","2","1"};
        int x = dizi.length;
        int y = function(dizi , 0 , x-1 , 0) ;
        
        
        
        if((x/2)+1==y){
            System.out.println("Simetrik.");
        }
        
        else {
            System.out.println("Simetrik değil.");
                   
        }
       
    }
    
   public static int  function (String array[] , int i , int j , int sayac) {
        
       
     if(i<(array.length/2)+1)  {
       if(array[i].equals(array[j])) {
           i = i+1 ;
           j = j-1 ;
           sayac = sayac + 1 ;
          return function (array,i,j,sayac);
       }
       
       else {
           return sayac ;
       }
     }
     
     else{
         return sayac ;
     }
     
    }
}
