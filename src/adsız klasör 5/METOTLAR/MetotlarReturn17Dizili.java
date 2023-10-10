/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 * @author emregulek
 */
public class MetotlarReturn17Dizili {
    
    // Kendisine parametre olarak gelen tam sayı dizisinin toplamını geri döndüren method yazınız.
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,4,5,6,7,8,9,10};
        
        function(dizi);
        
        System.out.println("Dizimizdeki elemanlarımızın toplamı = "+function(dizi));
        
    }
    
    public static int function(int array []) {
        
        int procces = 0 ;
        
        for(int i=0 ; i<array.length ; i++) {
            procces += array[i] ;
        }
        
        return procces ;
    }
}
