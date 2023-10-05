package OOP_Beginning.AbstractClass;

public abstract class AbstractClass {
    public void aMethod(){
        System.out.println("aMethod in Abdstract  Class");
    }
    public abstract void anotherMethod();// abstract class olduğu için subclasslardan birinde override edilmeli ya da o subclass da abstract yani soyut olmalı.
}

     class AbstractClassExample extends AbstractClass{
    @Override
    public void anotherMethod(){
        System.out.println("anotherMethod() in AbstractClassExample");
    }

    public static void main(String[] args) {
     AbstractClassExample a1 = new AbstractClassExample();
     a1.anotherMethod();
     a1.aMethod();
    }

}
