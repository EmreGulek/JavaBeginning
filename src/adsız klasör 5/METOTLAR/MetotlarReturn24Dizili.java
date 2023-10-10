/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn24Dizili {
    
    // Kendisine parametre olarak gelen iki boyutlu tamsayı dizisindeki her bir satırın toplamını geri döndüren method yazınız.
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        int dizi [] [] = new int [2][2] ;
        
         for(int i=0 ; i<dizi.length ; i++) {
            for(int j=0 ; j<dizi[i].length ; j++) {
                System.out.println((i+1)+". satırımızın "+(j+1)+". sütununu giriniz.");
                dizi[i][j] = k.nextInt();
            }
        }
         
         function(dizi);
         
         int toplam [] = new int [2];
         toplam = function(dizi);
         
         System.out.println(toplam[0]);
         System.out.println(toplam[1]);
         
    }
    
    public static int[] function (int array[][]) {
        
        int toplamarray [] = new int [2];
        
          for(int i=0 ; i<array.length ; i++) {
            for(int j=0 ; j<array[i].length ; j++) {
              toplamarray[i] += array[i][j] ;
                      
            }
        }
          
          return toplamarray ;
        
    }
}
