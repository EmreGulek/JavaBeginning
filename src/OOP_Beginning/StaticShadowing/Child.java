package OOP_Beginning.StaticShadowing;

public class Child extends Parent {
    @Override
    public void doThis(){
        System.out.println("Child's doThis");
    }
    /*public final void doThat(){
        final olduğu için override edemem.
    }*/

    // @Override olmaz çünkü Parent'ta static. Burada bu kodu aslında yeniden yazmış oldum.
    public static void doIt(){
        System.out.println("Child's doIt");
    }
    @Override
    public void make(){
        System.out.println("Child's make");
    }
}
