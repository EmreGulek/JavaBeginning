/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn32 {
    
// Klavyeden girilen sayının 10 elemanlı dizide olup olmadığını belirleyen programın kodunu yazınız.
        // (İlk bulduğunu ekrana yazsın diğerlerini yazmasın.)
    
    public static void main(String[] args) {
         
        int dizi [] = {1,2,3,4,5,6,7,8,9,10};
        
        Scanner k = new Scanner(System.in);
        int sayi = k.nextInt();
        
        function(dizi,sayi,0,0);
        
       if( function(dizi,sayi,0,0) > 0 ) {
           System.out.println("Klavyeden girilen eleman dizimizde bulunmaktadır.");
       }
       
       else {
           System.out.println("Klavyeden giirlen eleman dizimizde bulunmamaktadır.");
       }
       
    }
    
    public static int function(int array[], int number , int i , int sayac) {
        
        for(; i<array.length ; i++) {
            if(number == array[i]) {
                sayac++ ;
                return sayac ;
            }
            
        }
        
        return sayac ;
        
    }
}
