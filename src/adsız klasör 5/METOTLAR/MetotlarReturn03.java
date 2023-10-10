/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn03 {
    
    // Kendisine parametre olarak gelen dizinin elemanlarını bir artırıp geri döndüren metod.
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,4,5} ;
       
      // 1) Oluşturmuş olduğum dizimi fonksiyonumun içine parametre olarak atıp gönderiyorum . Bu şekilde dizim için metot kısmımda işlemler yapıcam
        function (dizi) ;
        
        for(int i=0 ; i<dizi.length ; i++)
        System.out.println(dizi[i]);
      // Dizimde değişiklik yapıp return kavramıyla bunu kaydetmiştim dizimin üzerine.
    // Şimdide bu değişikliği döngüm sayesinde yazdırıyorum.
        
    }
        
    // ***** Geri döndürceğim şey tamamen dizinin kendisi olduğu ve dizimin elemanları da int değerinde olduğu için
   //       Burada int[] yazarak metodumu oluşturuyorum   *****
    
    public static int[] function (int array[]) { 
        
        
       // 2) Göndermiş olduğum dizimi array in parametresi olarak  göndermiştim . O yüzden burada işlemlerimi array dizisi üzerinden yapıcam.
       //  array dizimin tüm elemanlarını aşağıda bir artırıyorum.
        for(int i=0 ; i<array.length ; i++) {
            array[i] += 1 ;
            
        }
        
        // 3) Ben ana metoduma bu dizimin yeni halini yanı elemanlarının 1 er artırılmış halini göndermek istiyorum.
            // Yani bir nevi ben bu yeni yaptığım değişikliği ana metoduma kaydetmek istiyorum.
            // return array yaparak dizimi bu şekilde ana metodumda kaydetmiş oluyorum.
        
        return array ;
       
    }
}
