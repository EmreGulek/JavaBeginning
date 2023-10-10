/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn08 {
    
    // Kendisine parametre olarak gelen pozitif tam sayıya kadarki tüm tamsayıları toplayıp geri döndüren method yazınız.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        int number2 ;
        double number1 ;
        
        do {
            System.out.println("Lütfen pozitif bir tam sayı giriniz");
            number1 = k.nextDouble();
        }
       
        while(number1<=0 || number1 < 1/number1 ); // koşulum sağlanmıyorsa do while dan çıkar.
       
     // Eğer girdiğim sayı sıfırdan küçükse ya da ondalıklı bir sayı ise do ya atıp yeniden klavyeden sayı isticek.
     // Eğer girdiğim sayı While Döngüsünün içindeki KOŞULA UYMUYORSA DO WHİLE DAN ÇIKAR.
     
         number2 = (int) number1 ;
     
         function(number2);
                  
         System.out.println("Sonucumuz = "+function(number2));
         
          }

    public static int function(int x){
        
        int procces = 0 ;
        
        for(int i = 0 ; i<=x ; i++) {
            procces += i ;
        }
        
        return procces ;
    }
               

        
    }
    

