/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn21Dizili {
    
    // Kendisine parametre olarak gelen tamsayı dizisindeki en büyük ikinci sayıyı geri döndüren metod.
    
    public static void main(String[] args) {
        
        int dizi[] = {1,2,5,8,2,3,6};
        
        function(dizi);
        
        System.out.println("En büyük 2. sayımız = "+function(dizi));
    }
    
    public static int function (int array[]){
        
        int enb = array[0];
        int enbyer = 0 ;
        int enk = array[0];
      
        for(int i=0 ; i<array.length ; i++) {
            if(array[i]>enb) {
                enb = array[i];
                enbyer = i ;
            }
            if(array[i]<enk) {
                enk = array[i];
            }
        }
        
        
        for(int i=0 ; i<array.length  ; i++) {
            if(i==enbyer) {
                i++;
            }
            if(array[i]>enk) {
               enk = array[i];
           }
        }
        return enk ;
    }
    
}


