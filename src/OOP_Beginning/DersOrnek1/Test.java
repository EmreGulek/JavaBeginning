package OOP_Beginning.DersOrnek1;

public class Test {
    public static void main(String[] args) {


        Person zeynep = new Person();
        zeynep.tckn = "1";
        zeynep.firstName="Zeynep";
        zeynep.lastName="Kaya";

        Car mercedes = new Car();
        mercedes.make="Mercedes";
        mercedes.model="E200";
        mercedes.year="2011";
        mercedes.speed=80;
        mercedes.distance=36_000;

        System.out.println(mercedes.getInfo());
        System.out.println(zeynep.getInfo());

        // That's how the association is established
        mercedes.owner = zeynep;
        zeynep.vehicle = mercedes;
        // Bu ikisi birlikte gerçekleşmeli.Çünkü iki-yönlü ilişki var.

        /* Composition sınıfımın mercedes referansı ,
         car sınıfımdaki PERSON NESNESİ-TÜRÜNDEN  ÜRETİLEN OWNER DEĞİŞKENİNE
         PERSON NESNESİNİN REFERANSI OLAN ZEYNEP REFERANSINI EDİNDİ.
         */

        mercedes.speed=100;
        mercedes.go(10);

        System.out.println(mercedes.getInfo());
        System.out.println(zeynep.getInfo());

        /*
        Not :
        Person ve Composition nesnelerinin referansları Heap'te ama -YANİ OWNER VE VEHİCLE HEAP'TE _
        Test' in main metodunda oluşturulan referansları Stac'tedir. - AMA ZEYNEP VE MERCEDES STAC'TEDİR.
         */
    }
}