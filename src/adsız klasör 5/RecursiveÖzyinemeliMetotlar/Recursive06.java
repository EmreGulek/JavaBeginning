/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive06 {
    
    // Kendisine parametre olarak gelen bir tamsayı dizisinde en büyük elemanın indisini  hesaplayan rekürsif fonksiyon .
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,10,4,5,6,7,8,3} ; // 4
    
         int x = function (dizi,0 , 0);
        
        System.out.println(x+1);
    }
    
    public static int function (int array[] , int i , int konum ) {
        
    if(array.length-1>i)  {
     if(array[i]>=array[konum]) {
         konum = i ;
         i = i +1 ;
         return function (array,i,konum);
     }
    }
    
    if (array.length-1 == i) {
        if(array[i]>=array[konum]) {
         konum = i ; }
        return function (array,i,konum);
        
    }
    
    return konum ;
    
   } 
 

}