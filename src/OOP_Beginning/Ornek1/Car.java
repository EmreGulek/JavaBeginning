package OOP_Beginning.Ornek1;

public class Car {
    String make;
    String model;
    String year;
    int speed;
    int distance;

    //  owner of the car :
    Person owner;

    public void go(int newDistance){
        distance += newDistance;
    }
    public void acclerate(int newSpeed){
        speed = newSpeed;
    }
    public void stop(){
        speed = 0 ;
    }
    public String getInfo(){
        String info = "Composition info "+year+" "+make+" "+model+" . Distance : "+distance+" km. and travelling at "+speed+"kmph.";

        if(owner != null){
            info+="and its owner is "+owner.firstName+" "+owner.lastName;
        }
        else{
            info +="and does not have an owner!";
        }
        return info;
    }
}
