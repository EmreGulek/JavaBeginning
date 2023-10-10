/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn18Dizili {
    
    // Kendisine parametre olarak gelen tam sayı dizisindeki en küçük elemanın indisini ve elemanın kendisini söyleyen method.
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,0,3,4,5,11,8,9};
        
        function(dizi);
        
        int yenidizi [] = new int [2];
         yenidizi = function(dizi);
        
        System.out.println("Dizimizde yer alan en büyük elemanımız = "+yenidizi[0]);
        System.out.println("Dizimizde yer alan en büyük elemanımızın indisi = "+yenidizi[1]);
    }
    
    public static int [] function (int[] array) {
        
        int enb = array[0];
        int enbyer = 0 ;
        
        for(int i=1 ; i<array.length ; i++) {
            if(array[i]>enb) {
                enb = array[i];
                enbyer = i+1 ;
            }
        }
        
        int newarray[] = {enb,enbyer};
        
        return newarray ;
        
    }
}
