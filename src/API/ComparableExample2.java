package API;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;

class Insanlar implements Comparable<Insanlar>{
    private String isim;
    private String soyad;
    private int yas;

    public Insanlar(String isim, String soyad, int yas) {
        this.yas = yas;
        this.isim = isim;
        this.soyad = soyad;
    }


    public String getIsım(){
       return this.isim = isim;
    }
    public String getSoyad(){
      return  this.soyad=soyad;
    }
    public int getYas(){
       return this.yas=yas;
    }
@Override
    public String toString(){
        return "Insanlar [isim="+isim+", yaş= "+yas+", soyad = "+soyad+"]";
    }
    @Override
    public int compareTo(Insanlar human){
        if(human.yas>this.yas) return -1;
        if(human.yas<this.yas) return 1;
        return 0 ;


    }


}
public class ComparableExample2 {
    public static void main(String[] args) {
        ArrayList<Insanlar> insanlar = new ArrayList<Insanlar>();
        // Kişiler adlı ArrayList tanımladım ve
        // bu ArrayList'İn kabul ettiği parametre de Insanlar sınıfından oluşan nesneler.

        // insanlar tipide yeni nesneler oluşturdum.
        // Bu nesneleri listeye ekledim.
        insanlar.add(new Insanlar("Aylin","Yılmaz",20));
        insanlar.add(new Insanlar("Furkan","Bodur",21));


        Insanlar insanlar1 = new Insanlar("Mehmet","Yılmaz",35);

        Collections.sort(insanlar);
        //Collections sınıfına insanlar nesnesi gönderdim.
        //Java'da bir List koleksiyonunu sıralamak için kullanılan bir metottur.
        for(Insanlar insan : insanlar){ //Kişiler nesnesi yaşa göre sıralanıp ekrana yazdırılıyor.
            System.out.println(insan);
        }

    }
}
