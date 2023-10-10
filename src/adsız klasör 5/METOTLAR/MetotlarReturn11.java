/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author emregulek
 */
public class MetotlarReturn11 {
    
    // Kendisine parametre olarak gelen String i ters çevirip döndüren method yazınız.
    
    public static void main(String[] args) {
       
        String name = "emre" ;
        
        function(name);
        System.out.println("Kelimemizin tersten yazılışı = "+function(name));
    }
    
    public static String function(String x) {
        
        String reverse = "" ;
        for(int i=x.length()-1 ; i>=0 ; i--) {
            reverse += x.charAt(i) ;
        }
        
        return reverse ;
    }
    
}
