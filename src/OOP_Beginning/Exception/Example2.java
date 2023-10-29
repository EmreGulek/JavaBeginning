package OOP_Beginning.Exception;

public class Example2 {

    public static void main(String[] args) {
        int dizi [] = {1,2,3,4,5};
        int  uzunluk = dizi.length;
        System.out.println(uzunluk);
        try{
            // Dizinin uzunluğunu aşıyoruz.
            int deger = dizi[10];
            System.out.println("Dizinin 10. elemanı : "+deger);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Dizi uzunluğu aşıldı: " + e.getMessage());

        }
    }
}
