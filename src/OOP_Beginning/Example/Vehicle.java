package OOP_Beginning.Example;

public abstract class Vehicle {
    String name;
    String model;
    int year;
    double motorPower;
    boolean elektrikliMi;
    int distance;

    int bakım;

    Vehicle( String name , String model , int year , double motorPower,boolean elektrikliMi,int distance){
        this.name = name;
        this.model = model;
        this.elektrikliMi = elektrikliMi;
        this.motorPower = motorPower;
        this.year=year;
        this.distance = distance;

        if (name.equals("Mercedes")) bakım=50000;
        else if(name.equals("VolksWagen")) bakım=70000;
        else bakım=60000;

    }

    protected void ArabanınVergisi(){
        double vergi = (motorPower*100)+30000;
       // 2020 öncesi arabalarda %18 vergi indirimi olsun.
        if(this.year<2020) {vergi -= vergi*(0.18);}
        // eğer elektrikliyse %20 teşvik indirimi olsun.
        if(this.elektrikliMi){ vergi -= vergi*(0.2);}

        System.out.println("Arabanızın yıllık vergisi : "+vergi);
    }

    public void kaçkaldı(String name,int distance){
        System.out.println(name+" Marka Arabalarda 50 bin km de bir bakım yapılmaktır.");
        while(true) {
            if(distance<bakım) break;
            else distance = distance-bakım;
        }
        if(distance<bakım/2) {
            System.out.println("En kısa zamanda bakım için yetkili servise gidiniz.");
            System.out.println(distance+" km sonra rutin "+bakım+" km bakımınız geliyor.");}
        else{
                System.out.println("Bakımına " + distance + " km kaldı. Bakımlarınızı zamanında yapmanızı tavsiye ediyoruz.");}
    }

    protected void BakımVakti(){
        kaçkaldı(name,distance);
    }

    protected String Info(){
        return
                "Arabanızın markası ve modeli :"+this.name+" "+this.model+
                "\nArabanızın kasa tarihi : "+this.year+
                "\nArabanızın motorGücü :"+this.motorPower+"\n";

    }


}
