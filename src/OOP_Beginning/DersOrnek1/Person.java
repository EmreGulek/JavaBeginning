package OOP_Beginning.DersOrnek1;

public class Person {
    String tckn;
    String firstName;
    String lastName;

    // Composition of the person
    Car vehicle;

    public String getInfo(){
        String info = "Person info: "+tckn+" "+firstName+" "+lastName;

        if(vehicle!=null){
            info += " and has a car : "+vehicle.getInfo();
        }
        else {
            info +=" and has no car.";
        }
        return info;
    }
}
