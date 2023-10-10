/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class MetotlarReturn04 {
    
    // Kendisine parametre olarak girilen dizideki en büyük ve en küçük elemanı geri döndüren program.
    
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3,4,5} ;
     
       int mmdizi [] = new int [2] ;
       
        mmdizi = function (dizi) ;
     // 1) Burada 5 elemanlı dizimi fonksiyonuma parametremin içine atarak yolluyorum. 
    
     
     /* 5 !!!)    burada return ile yollamış olduğum 2 elemanlı dizimi mmdizi adlı 2 elemanlı değerime atıyorum.
      yani metottaki işlem yapıldıktan sonra return olarak çevirdiğim değer x ise
      function(dizi) ==> sonucu x tir.    
        
        Burada da return ile mmarray iki boyutlu dizimi gönderdiğim için aslında yaptığım işlem 
     mmdizi = mmarray oluyor.
     
     örnek :
               int dizi1[] = new int [2];
    
             int dizi2 [] = {1,2} ;
    
             dizi1 = dizi2 ;  BURADA dizi2 min içerisinde yer alan elemanlar sırasıyla dizi1 imin elemanları olur.
    
    for(int i=0 ; i<dizi1.length ; i++) {
        System.out.println(dizi1[i]); }
}
     
     */
     
     
       for(int i=0 ; i<2 ; i++) {
           System.out.println(mmdizi[i]);
       }
        
    }
    
    public static int[] function (int array[]) {
        // 2) Burada yapacağım işlemler array parametremin içerisine atılmış olan 5 elemanlı dizi nin elemanları ile yapılıyor.
        
     int enb = array[0] ;   // en büyük ve en küçük elemanlarımı 0. elemanım olarak belirtiyorum.
     int enk = array[0] ;
     
        for(int i=1 ; i<array.length ; i++) {
           if(array[i]>enb) {
               enb = array[i] ;
           }
           if(array[i]<enk) {
               enk = array[i] ;
           }
        }
        // Dizimin en büüyk ve en küçük elemanlarının belirlenmesini gerçekleştirdim.
       
        int mmarray[] = {enb,enk} ;
      // 3) Oluşturmuş olduğum 2 boyutlu dizimin içerisine en büyük ve en küçük elemanlarımı atıyorum.
        
        return mmarray ;
      // 4) return ile en büyük ve en küçük değerlerimi içeren dizimi psvm metoduma geri döndürüyorum.(yani aslında kaydediyorum.)
        
      
    }
    
}

