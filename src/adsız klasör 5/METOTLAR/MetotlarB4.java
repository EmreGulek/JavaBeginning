/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarB4 {
    
    // Üçgenin alanını hesaplayan metot =
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Üçgenimizin tabanını giriniz.");
        int taban = k.nextInt();
        
        System.out.println("Üçgenimizin yüksekliğini giriniz.");
        int yukseklik = k.nextInt();
        
        ucgen (taban , yukseklik) ;
    }
    
    public static void ucgen (int x , int y ){
        double procces = (double) (x*y)/2 ;
        System.out.println(procces);
    }
    
}
