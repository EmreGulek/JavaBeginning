package OOP_Beginning.Exception;

public class Example3 {
    // Null değerli bir Stringin uzunluğunu almak.
    public static void main(String[] args) {
        String x = null;
        try{
         int y =x.length();
        }
        catch (NullPointerException e){
            System.err.println("NULL değerinin bir uzunluğu olamaz. => "+e.getMessage());
            System.out.println(e.fillInStackTrace()); // Sıra dışı durumun classını ve nedenini açıklar.
        }

    }

}
