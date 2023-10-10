/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive08 {
  
    // Kendisine parametre olarak gelen int dizisinin sıralı olup olmadığını geri döndüren rekürsif
    
  public static void main(String[] args) {
        
        int dizi [] ={3,5,7,9,11,18,156,254};
        
        boolean b = fonksiyon(dizi,0);
        
        if (b) {
            System.out.println("Dizimiz sıralıdır");
        }
        else{
            System.out.println("Dizimiz sıralı değildir");
        }
    }
    public static boolean fonksiyon (int array[] ,int say){
        
            if (say==array.length-1) {
                return true;
            }
            
            else if (array[say]<array[say+1]) {
               return fonksiyon(array,++say);
           }
            
            else{
                return false;
            }
}
    
}