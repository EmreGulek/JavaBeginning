package OOP_Beginning.Composition;


public class Car {
    private String make;
    private String model;
    private String year;
    private int speed;
    private int distance;
// Private yaptım çünkü bu class dışında bir yerde bu verilerimin kullanılmasını istemiyorum.

    private Wheel[] wheels = new Wheel[4];
    private Engine engine;
    private int doorCount;
    private Door[] doors;
    private Transmission transmission;
    // Burada paketimdeki diğer nesnelerime ait referanslarımı ve dizilerimi oluşturdum.
    // Bunlarla alakalı işlem sadece bu class'da olacak . -private-

    public Car (String make,String model,String year,int doorCount) {
        this.make = make;
        this.model = model;
        this.year = year;

        engine = new Engine(2300, 175);
        transmission = new Transmission();

        wheels[0] = new Wheel("Left-Front");
        wheels[1] = new Wheel("Right-Front");
        wheels[2] = new Wheel("Left-Rear");
        wheels[3] = new Wheel("Right-Rear");

        this.doorCount = doorCount;
        doors = new Door[this.doorCount];
        doors[0] = new Door("Left-front");
        doors[1] = new Door("Right-front");
    // Araba 2 kapılı mı 4 kapılı mı ?
    // 4 kapılıysa arka kapılara da isimlerini vermeliyim.
        if (this.doorCount == 4) {
            doors[2] = new Door("Left-rear");
            doors[3] = new Door("Right-rear");
        }
        System.out.println("A car of "+make+","+model+","+year+" is created.\n");

    }

    public void start(){
        engine.start();
        // Engine sınıfıma ait oluşturduğum referansımla start metodumu kullanarak arabayı çalıştırdım.
    }

    public void go(int newDistance){
        // Arabanın hareket etmesi için tüm kapılarının kapalı olması gerek.
        for(Door dorr : doors){
            // kapılarımı kontrol ediyorum.
            if(!dorr.isClosed()){
                // Herhangi bir kapım açıksa kapatıyorum.
                dorr.close();
            }
        }
        System.out.println("Car is moving.");
        distance += newDistance;
        System.out.println("Distance : "+distance);
    }

    // Arabayı hızlandırmak için metodum.
    public void acclerate (int newSpeed){
        speed = newSpeed;
        System.out.println("Acclerating. New speed :"+speed);
    }

    // Arabayı durdurmak için metodum.
    public void stop(){
        speed = 0;
        System.out.println("\nCar stopeed. New Speed : "+speed);
    }


    public String getInfo(){return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at "
            + speed + " kmph.";
    }

    // Kontağı kapatmak için metodum.
    public void turnOff() {
        engine.stop();
    }
}
