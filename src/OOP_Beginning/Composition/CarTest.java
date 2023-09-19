package OOP_Beginning.Composition;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mercedes Benz", "CLK 200", "2013", 2);
        car.start();
        car.go(1000);
        car.acclerate(100);
        car.stop();
        car.turnOff();

     //   Her bir bileşen, kendi davranışlarını ve özelliklerini yönetir
     //  ve araç sınıfı bu bileşenleri bir araya getirerek bir araç oluşturur.
    }
}
