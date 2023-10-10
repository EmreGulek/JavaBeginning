/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class Recursive04 {
    //                                                    b 
    // Kendisine parametre olarak gelen a ve b sayısının a  sini hesaplayan rekürsif fonksiyon.
    
    public static void main(String[] args) {
       
        Scanner k = new Scanner(System.in);
        int number1 = k.nextInt();
        int  number2 = k.nextInt();
        
        System.out.println(function(number1,number2));
    }
    
    public static int function (int a , int b) {
        
        if(b==1) {
            return a ;
        }
        else {
            return a*function (a,b-1) ;
        }
    }
}
