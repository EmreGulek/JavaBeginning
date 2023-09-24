package OOP_Beginning.Example;

public class Mercedes extends Vehicle {

    Mercedes(String name, String model, int year, double motorPower, boolean elektrikliMi,int distance) {
        super(name, model, year,  motorPower, elektrikliMi,distance);
    }

    public void MercedesArabanınVergisi(){
        super.ArabanınVergisi();
    }

    public void BakımVakti() {
        super.BakımVakti();
    if(distance>=200000){
        System.out.println("Lastikleriniz için de lütfen Bakım servisinizden değişim talep ediniz.");
    }
    }

    @Override
    public String Info(){
        return super.Info();
    }

}

