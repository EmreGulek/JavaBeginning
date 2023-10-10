/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive10 {
    
   //(12)kendisine parametre olarak gelen diziyi ters çeviren rekürsif fonk.
   
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,4,5,6,7,8,9};
        
        int yenidizi[] = new int [10] ;
        
        
       int x[] = function(dizi,yenidizi,0 , dizi.length-1) ;
       
       for(int i=0 ; i<dizi.length ; i++)  {
           System.out.println(x[i]);
       }
       
        
    }
   
    public static int[] function (int array[] , int newarray[] , int i , int j) {
        
        if(i<array.length) {
            
            newarray[i] = array[j] ;
            i= i+1 ;
            j= j-1 ;
           return function(array,newarray,i,j) ;
            
        }
        
        else {
            return newarray ;
        }
        
    }
}

