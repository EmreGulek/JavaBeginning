package API;

/* instanceOf : Belirli bir sınıfın veya  arabirimin bir örneği mi değil mi ? Bunun kontrol edip bize cevaplar.

        OLuşturulan sınıf ve nesneler  oluşturuldukları andan itibaren Object sınıfının da bir nesnesi olurlar.
        Object
        Hayvan
        Kuş   Köpek   Kedi

 */


abstract class Hayvan{
    String ad;

    public Hayvan(String ad){
        this.ad = ad ;
    }


}

class Kedi extends Hayvan {

    public Kedi(String ad) {
        super(ad);
    }

}

    class Kopek extends Hayvan {

        public Kopek(String ad) {
            super(ad);
        }


    }
        public class instanceOf{
            public static void main(String[] args) {

                Kedi Pamuk = new Kedi("Pamuk");
                Kopek Karabas = new Kopek("Karabas");

                if(Pamuk instanceof Kedi) System.out.println(Pamuk.ad+" bir kedi.");

                else System.out.println(Pamuk.ad+" bir kedi değildir.");
            }
        }