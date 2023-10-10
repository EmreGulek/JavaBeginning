/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn01 {
    
    /*   Metot içerisinde oluşturduğumuz bir veriyi dışarıya aktarma ihityacı duyabiliriz.
       Bu durumlarda return kullanılır.

     Metot int türünde bir ifade döndürüyorsa return ifadeside int türünde döndürmelidir.
  
     Return ifadesi , metodun sonlandırılmasına neden olduğu için  sonda yer alır.
  Return ifadesinden sonra herhangi bir ifade çalıştırılmaz.                                  */
    
    
    public static void main(String[] args) {
        
        // İki sayının toplaması =
        
     Scanner k = new Scanner(System.in);
        
     
        System.out.println("İlk sayımızı giriniz.");
        int number1 = k.nextInt();
        System.out.println("İkinci sayımızı giriniz.");
        int number2 = k.nextInt();
        
       // 1)Fonksiyonumuza gereken 2 değeri girip fonksiyona yolladık.
       
       function(number1 , number2); // 2) bu kısımda artık fonksiyonun olduğu kısma gidiyor.
       
       System.out.println(function(number1, number2));
     // 6) function umun number1 ve number2 için proccesini return ile kaydetmiştim. Onu yazdırabildim.
     
        
    }
    
    // returnlu fonksiyonun metodu yazılırk.
    
    // public - static - DÖNECEK OLAN RETURN DEĞERİNİN TÜRÜ - FONKSİYONUMUN İSMİ -
    
    
    public static int function(int a , int b) {
        // 3) yapıcağım işlemimi tanımladım .
       int procces =  a+b ;
       // 4) Bu yaptığım işlemi return kavramı kullanarak  aslında psvm nin içinde kaydetmiş gibi oluyorum .
       // 5)  ve orada bu işlemimi kullanabiliyorum.
       
       return procces ;
    }
    
}
