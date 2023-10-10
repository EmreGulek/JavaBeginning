/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn02 {
    
    // Kendisine parametre olarak gelen tam sayı dizisinin toplamını geri döndüren program.
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,4,5} ;
        
        // 1) Fonksiyonumun içine bir dizi yazıp . Metoduma bir dizi yollamış oluyorum.
        function (dizi) ;
        
        System.out.println(function(dizi));
        // 5) İşlemimin sonucunu return kavramı sayesinde zaten burada kaydetmiştim .
      // o işlemimin sonucunu getiren fonksiyonumu yazarak işlemimin sonucunu yazdırmış oluyorum.
    }
    // 2) integer değerinde bir değer döndüreceğim için metot int şeklinde oluyor.
    // 3) function metoduma girdiğim parametrem bir dizi olmalı çünkü ana metodumdan bir dizi göndermek istiyorum.
    //   Bu nedenle parametremi array adlı bir dizi olarak belirliyorum.
    
    public static int function (int array[])  {
        int procces = 0 ;
        
        for(int i=0 ; i<array.length ; i++) {
            procces += array[i] ;
        }
        // 4) Dizimin değerlerini burada parametrem sayesinde topluyorum.
        
        return procces ;
        // İşlemimi returnlayıp bir nevi işlem sonucumu ana metodumun içine kaydetmiş gibi oluyorum.
    }
}
