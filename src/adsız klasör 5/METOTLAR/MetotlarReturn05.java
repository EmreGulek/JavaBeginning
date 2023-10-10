/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn05 {
   //                                                 b
    // Kendisine parametre olarak gelen 2 tamsayının a   sini hesaplayıp geri döndüren metod .
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in) ;
        
        System.out.println("Taban sayımızı giriniz.");
        int number1 = k.nextInt();
        System.out.println("Üst sayımızı giriniz.");
        int number2 = k.nextInt();
        
        function(number1,number2) ;
        
        System.out.println(function(number1,number2));
        
    }
    
    public static int function (int x, int y) {
       int procces = (int) Math.pow(x, y) ;
       return procces ;
    }
    
}
