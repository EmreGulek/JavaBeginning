/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn13 {
    
    // Kendisine parametre olarak gelen String teki "aa" Stringlerinden kaç tane olduğunu geri döndüren method.
    
    public static void main(String[] args) {
        
        String word = "aabaacaaaa" ; // 5 tane var.
        function(word);
        
        System.out.println("ifademizde aa şeklinde olan sözcük sayısı = "+function(word));
    }
    
    public static int function(String x) {
        int sayac=0 ;
        for(int i=0 ; i<x.length()-1 ; i++) {
            if(x.charAt(i)==x.charAt(i+1)) {
                sayac++;
            }
        }
        return sayac ;
    }
}
