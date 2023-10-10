import java.util.Scanner;


public class MetotlarB1 {
    
    /*  public void sayiTopla   (int sayi1 , int sayi2 ) ;
                1)     2)             3)
   1) void => olduğunda method yazdırma işlemi vb bir işlem yapıyor ve bize bir sonuç döndürmüyor demektir.
   2) sayiTopla => oluşturduğumuz metodun ismidir. camelCase e uygun şekilde yazılır.
   3) parantez ve parametreler => Metotlarda isimden sonra parantez kullanılır. Gerektiğinde parantez içine metotta kullanılacak olan parametreler yazılır.
    
    */
    
    
    
    // Kendisine parametre olarak gelen sayı kadar adınızı yazınız.
    
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Kaç defa adınızı yazdırmak istediğinizi giriniz.");
         int x = k.nextInt();
         
        for(int i=0 ; i<x ; i++) {
            print("emre");
         // 1) Döngümün içerisinde bulunan print fonksiyonuna gelince içindeki parametreyle birlikte  fonksiyonun olduğu yere gidicek. 
            
        }
     
    }
    
   public static void print( String name ) {
       // 2) print fonksiyonumun olduğu yere geldi.
       // print fonksiyonumun name adında bir parametresi var. main metodumda fonksiyon parametreme ismimi girmiştim.
       
       System.out.println(name);
       
     // 3) fonksiyonumun olduğu static void de ki işlemime geldim. parametremi yazdırıcak.
     
   }
    
}
