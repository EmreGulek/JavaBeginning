/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author emregulek
 */
public class MetotlarReturn22Dizili {

    // Vize ve Final sınav notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp geri döndüren program.
    
    public static void main(String[] args) {
        
    double dizi1 [] = {50,60,70,80};
    double dizi2 [] = {80,70,60,50};
    
     function(dizi1,dizi2);
     
     double ortalamaa [] = new double [4];
     
     ortalamaa = function(dizi1,dizi2);
     
        for(int i=0 ; i<dizi1.length ; i++) {
            System.out.println(ortalamaa[i]);
        }
    
    }
    
    public static double[] function(double array1[], double array2[]) {
        
        double ortalama [] = new double[4] ;
        
        for(int i=0 ; i<array1.length; i++) {
            ortalama[i] = (double)  (array1[i] + array2[i])/2 ;
        }
        return ortalama ;
    }
}
