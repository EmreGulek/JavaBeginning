/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn09 {
    
    // Kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren method yazınız.
    
    public static void main(String[] args) {
        
        double number1 ;
        double number2 ;
        
        int number3 ;
        int number4 ;
        
        Scanner k = new Scanner(System.in);
        
        do {
            number1 = k.nextDouble();
            number2 = k.nextDouble();
        }
        while(number1<1/number1 || number2<1/number2) ;
        
         number3 = (int) number1 ;
         number4 = (int) number2 ;
        
        // Sayılarımı tek boyutlu 2 elemanlı dizimin içerisine atıyorum.
         int dizi [] = {number3,number4} ;
        
        
        function(dizi) ;
        
        System.out.println("Girdiğiniz sayılardan en büyük olan = "+function(dizi));
         
    }
    // burada ana gövdeye return kısmının veri tipini gönderiyoruz !!!!!!!.
    // parantez içerisine ise parametremizin veri tipini gönderiyoruz !!!!!!!.
    public static int function (int array[]) {
        int enb ;
        enb = array[0];
        
        if(array[0]<array[1]) {
            enb = array[1] ;
        }
        
        return enb ;
        
    }
    
    
}
