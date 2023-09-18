package OOP_Beginning.Static;

public class Citizien {

    String tckno;
    String lastName;
    String firstName;

    static String nationality;

    public static void main(String[] args) {
        Citizien c1 = new Citizien();
        c1.tckno="1111111";
        c1.firstName="Emre";
        c1.lastName="Gülek";

        Citizien c2 = new Citizien();
        c2.tckno="1111112";
        c2.firstName="Enes";
        c2.lastName="Gülek";

        Citizien.nationality="Türkiye Cumhuriyeti";
        // nationality bir class variable olduğu için tüm sınıf için değeri Türkiye Cumhuriyeti'dir.

        System.out.println(c1.firstName+"'s nationality = "+c1.nationality);
        System.out.println(c2.firstName+"'s nationality = "+c2.nationality);
    }
}


