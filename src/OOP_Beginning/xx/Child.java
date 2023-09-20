package OOP_Beginning.xx;

public class Child extends Parent {

    private int i = 5;	// Hiding b of Parent
    private boolean b = true;	// Hiding b of Parent
    private static String s = "Child";

    public static void f(){
        System.out.println("f() in Child");
    }

    public void g() {
        System.out.println("g() in Child");
        System.out.println(this.b);
        System.out.println(this.i);
    }
}
