interface School { //Arayüz

    void okulaGiris(double ogrenciPuanı);
 // Arayüz içerisinde tanımlanan metotlar otomatik olarak public abstract olur.

    String getSchoolName();
    String getSchoolType();
    double getSchoolMaxPuan();
    double getSchoolMinPuan();

    // Java'da arayüzlerin constructor'ları olmaz.
}



 class Anadolu implements School {

     private String SchoolName;
     private String SchoolType;
     private double SchoolMaxPuan;
     private double SchoolMinPuan;


     public Anadolu(String SchoolName, String SchoolType, double SchoolMaxPuan, double SchoolMinPuan) {
         this.SchoolMaxPuan = SchoolMaxPuan;
         this.SchoolMinPuan = SchoolMinPuan;
         this.SchoolName = SchoolName;
         this.SchoolType = SchoolType;
     }

     @Override
     public void okulaGiris(double ogrenciPuanı) {
         if (ogrenciPuanı >= this.SchoolMinPuan && ogrenciPuanı <= SchoolMaxPuan) {
             System.out.println(this.SchoolName + " okuluna kayıt yaptırabilirsiniz.");
         } else {
             System.out.println(this.SchoolName + " okuluna kayıt yaptıramazsınız.Puanınız yeterli değil.");
         }
     }

     @Override
     public double getSchoolMaxPuan() {
         return SchoolMaxPuan;
     }

     @Override
     public double getSchoolMinPuan() {
         return SchoolMinPuan;
     }

     @Override
     public String getSchoolName() {
         return SchoolName;
     }

     @Override
     public String getSchoolType() {
         return SchoolType;
     }

 }



 public class Main {
     public static void main(String[] args) {
         Anadolu BAL = new Anadolu("Bahçelievler Lisesi", "Anadolu Lisesi", 493, 488);
         Anadolu FY = new Anadolu("Füsun Yönder", "AnadoluLisesi", 420, 400);

         BAL.okulaGiris(460);
         FY.okulaGiris(420);
     }}
