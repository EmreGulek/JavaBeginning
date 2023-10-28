package OOP_Beginning.InnerClasses;

interface Greeting{
    void sayHello();

}
/*
Bu tür sınıflar, bir arayüzü veya bir soyut sınıfı doğrudan bir nesne yaratırken kullanılır
ve genellikle tek kullanımlık veya geçici bir sınıf olarak tasarlanır.
 */
public class AnonymousClass{
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        greeting.sayHello();
    }
}