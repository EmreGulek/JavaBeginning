/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author emregulek
 */
public class MetotlarReturn23Dizili {
    
    // Kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki en büyük sayıyı ve indisini geri döndüren methodu yazınız.
    
    public static void main(String[] args) {
            
        Scanner k = new Scanner(System.in);
        
        int dizi [][] = new int [2][2] ;
        
        for(int i=0 ; i<dizi.length ; i++) {
            for(int j=0 ; j<dizi[i].length ; j++) {
                System.out.println((i+1)+". satırımızın "+(j+1)+". sütununu giriniz.");
                dizi[i][j] = k.nextInt();
            }
        }
        
        function(dizi);
        
        int x [] = new int [3] ;
        x = function(dizi) ;
        
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
    
    public static int[] function(int array [][]) {
        
        int enb = array[0][0];
        int enbsatır = 0 ;
        int enbsutun = 0 ;
        
        for(int i=0 ; i<array.length ; i++) {
            for(int j=0 ; j<array[i].length ; j++) {
                if(array[i][j]>enb) {
                    enb = array[i][j] ;
                    enbsatır = i ;
                    enbsutun = j ;
                }
            }
        }
        
        int yerler [] = {enb,enbsatır+1,enbsutun+1};
        return yerler ;
        
    }
    
}
