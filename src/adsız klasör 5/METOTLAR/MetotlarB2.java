/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarB2 {
    
    public static void main(String[] args) {
       
        Scanner k = new Scanner(System.in);
        
        System.out.println("ilk sayımızı giriniz =");
        int number1 = k.nextInt();
        
        System.out.println("İkinci sayımızı giriniz =");
        int number2 = k.nextInt();
        
        addition (number1,number2) ;
      
     // İşlem için klavyeden aldığım iki sayımı fonksiyonda parametrelerimin yerine yazıyorum.
        
    }
    
    public static void addition(int a , int b) {
        
        System.out.println("Toplama işlemimizin sonucu = ");
        System.out.print(a+b);
      // fonksiyon metodumun içerisinde burada parametrelerimle işlem yapıyorum.
    }
    
    
}



