package OOP_Beginning.Exception;

public class Example4 {

    public static void sayiKontrol(int sayi){
        if(sayi<0){
            throw new IllegalArgumentException("Negatif Sayı Kabul edilemez.");
            // kendimce yeni bir exception oluşturup bunu jvm ye bildirdim.
        }
        System.out.println("Sayı geçerlidir => "+sayi);
    }
    public static void main(String[] args) {
        try{
            sayiKontrol(-1);
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
            System.err.println(e.fillInStackTrace());
        }
    }
}
