/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive {
    
    public static void main(String[] args) {
        
        System.out.println(function(5));
      // 1) Burada kodumuz fonksiyon metodumuza gidiyor.  
    }
    
    public static int function (int x) {
        
      // 9) f(1) fonksiyonumuzu bulmak için buradayız çünkü x==1 .
      // 10) f(1) = 1 miş.
        
        if (x==1) {
                     return 1 ;
        }
        
        else {   // 2) Fonksiyonumuz parametre olarak 5 değerini aldığı için buradaki şartımızın içine girdi.
                //  3) return kısmı 5*f(4) ; işlemini psvm ye kaydetti ama f(4) ü bilmiyoruz.
               
                // 4) f(4) ü bulmak için tekrar methodumuzun içerisindeyiz. x==4 olduğu için buradaki şartın içindeyiz.
                // 5) return kısmı f(4) = 4*f(3) olarak kaydetti . f(3) ü bilmiyoruz.
                
                // 6) f(3) ü bulmak için tekrar metod fonksiyonumuzun içindeyiz ve bu işlemi bu şartımızın içinde yapıyoruz çünkü x==3
                // 7) f(3) = 3*f(2) olduğunu return ile kaydettik.
                
                // 8) f(2) = 2*f(1) olduğunu kaydettik f(1) i bulmak için method fonksiyonumuzda arama yapıyoruz.
                
                
            return x*function(x-1);
        }
    }
    
}

/* ******************************************************************

fonksiyonumuz sırasıyla
                           f(5) = 5*f(4)
                                    f(4)= 4*f(3)
                                            f(3) = 3*f(2)
                                                     f(2) = 2*f(1) 
                                                              f(1)=1
 BÖYLECE = f(5) = 120 ;
  
*/