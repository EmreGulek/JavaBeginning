package OOP_Beginning.Example;

public class Information {
    public static void main(String[] args) {

        Mercedes mercedesA200 = new Mercedes("Mercedes","A200",2023,1.8,true,100000);
        System.out.println(mercedesA200.Info());
        mercedesA200.BakımVakti();
        mercedesA200.MercedesArabanınVergisi();

        System.out.println(" ");

        VolksWagen vwTroc = new VolksWagen("VolksWagen","Troc",2019,1.6,true,76580);
        System.out.println(vwTroc.Info());
        vwTroc.BakımVakti();
        vwTroc.VwArabanınVergisi();
    }
}
