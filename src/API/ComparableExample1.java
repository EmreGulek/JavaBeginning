package API;
import java.lang.Comparable;
class Kisi implements Comparable<Kisi>{
    // Oluşturmuş olduğum kişi sınıfı arayüz olarak Comparable arabimini uygular ve yaşa göre sıralama yapmamızı sağlar.
    private String ad;
    private int yas;


    public Kisi(String ad , int yas){ //Kisi sınıfının constructor'ı
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd(){
        return ad;
    }
    public int getYas(){
        return yas;
    }


    public int compareTo(Kisi digerKisi){
        return this.yas-digerKisi.getYas();
    }
//Comparable arayüzünü uyguladığım için bu arayüzün içinde yer alan compareTo metodunu da override etmem lazımdı.
//Bu metod yaşa göre sıralama yapmamı sağlayacak.
}

public class ComparableExample1 {
    public static void main(String[] args) {
        Kisi Ahmet = new Kisi("Ahmet",30);
        Kisi Mehmet = new Kisi("Mehmet",25);

       // Ahmet ve Mehmet'in yaşlarını karşılaştırıyorum.
        int sonuc = Ahmet.compareTo(Mehmet);

// Karşılaştırma sonucuna göre ekrana mesaj basıyorum.
        if (sonuc < 0) {
            System.out.println("Ahmet, Mehmet'den küçük.");
        } else if (sonuc > 0) {
            System.out.println("Ahmet, Mehmet'den büyük.");
        } else {
            System.out.println("Ahmet ve Mehmet eşit.");
        }
    }
}

