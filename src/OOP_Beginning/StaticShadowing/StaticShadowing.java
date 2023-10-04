package OOP_Beginning.StaticShadowing;

public class StaticShadowing {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println();

        parent.doThis();
        // public void olduğu için override edilebildi.
        // Child's doThis

        parent.doThat();
        // final olduğu için override edilemez.


        parent.doIt();
        // Parent'ta public static olduğu için override edilemedi.Child'da public static olarak tekrar yeni bir metot olarak oluşturuldu.
        // static olduğu için Parent's doIt


        parent.make();
        // static olmadığı için Child's make



    }
}
