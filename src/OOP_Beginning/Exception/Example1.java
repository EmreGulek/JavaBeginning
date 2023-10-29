package OOP_Beginning.Exception;

public class Example1 {
 //   Example:
 //   Sıfıra bölünme sonucunda oluşacak olan sıra dışı durum tespiti ve çözümü.

    public static void divide(int num1 , int num2){
        System.out.println("\nnum1 : "+num1+"\nnum2 : "+num2);
        try {  // hata alınması muhtemel yeri yazdım . (yani bölünme kısmını)
            int division = num1 / num2;
            System.out.println("num1/num2 : " + division);
        }
        catch (ArithmeticException e) {
            System.err.println("Sıfıra bölünme hatası => "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        divide(10,5);
        divide(5,0);
    }
}

/*
İlk olarak, "divide" metodu çağrılır.
"try" bloğu içinde, sıfıra bölmeye çalışılır.
Eğer sıfıra bölmeye çalışıldığında bir hata oluşursa, yani "ArithmeticException" meydana gelirse, bu hatayı "catch" bloğu ele alır.
"catch" bloğu içinde, hatayı işler ve hata mesajını ekrana yazdırır.

"try-catch" blokları hatayı yakalar ve programın çökmesini önler.
 */
