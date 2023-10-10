package OOP_Beginning.Example1;

public class VolksWagen extends Vehicle {
    // Kuruclar devralınamazlar.
    //1 Her alt çocuk sınıf kendi kurucusunu tanımlamak zorunda.
    //2 Her alt sınıf , üst sınıfındaki bir kurucuyu çağırmak zorunda. super().

    VolksWagen(String name, String model, int year, double motorPower, boolean elektrikliMi,int distance) {
        super(name, model, year, motorPower, elektrikliMi,distance);
    }

    // super() çağrısı zorunlu. Üstteki sınıfın varsayılan kurucusunu çağırır.

    public void VwArabanınVergisi(){
       super.ArabanınVergisi();
        // Burada override yapılmadı.(override'da arayüz değişmez.)
        // super ile üst sınıfın metodu da DİREKT çağrılabilir.
        // super.ArabanınVergisi(motorPower, year) kullanarak üst sınıfın metodu çağrılıp vergi işlemi yapıldı.
        // return ile volkswagen in vergisini döndürdüm.
    }


    public void BakımVakti(){
      super.BakımVakti();
    }

    @Override
    public String Info(){
        return super.Info();
    }



}
