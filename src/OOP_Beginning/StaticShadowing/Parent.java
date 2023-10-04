package OOP_Beginning.StaticShadowing;

public class Parent {
    public void doThis(){
        System.out.println("Parent's doThis");
    }
    public final void doThat(){
        System.out.println("Parent's doThat");
    }
    public static void doIt(){
        System.out.println("Parent's doIt");
    }
    protected void make(){
        System.out.println("Parent's make");
    }
}
