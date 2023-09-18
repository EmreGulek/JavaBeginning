package OOP_Beginning.Static;


    public class Myclass {

      static int staticVar = 5 ;
      int instanceVar = 10 ;

      public void instanceMethod(){
          int result = staticVar + 1;
 // Static olmayan bir metodumun static olmayan değişkeninde ,
 // static değişkenimi direkt kullanabiliyorum.
          int sum = staticVar + instanceVar ;
          System.out.println(result);
          System.out.println(sum);
      }

      public static void staticMethod(){
          int result = staticVar*2;
          System.out.println(result);
        //  int resultt = instanceVar+2;
        // static bir metod static olmayan yani instance bir değişkene direkt olarak erişemez.
      // Öncelikle Myclass myc = new Myclass(); şeklinde referans oluşturup
      // myc.instanceVar şeklinde erişebilirdim.

      }

        public static void main(String[] args) {
           Myclass object = new Myclass();
           object.instanceMethod();
        // Sınıfımda yer alan static olmayan metoduma sınıfımın nesnesiyle erişebildim.
           staticMethod();
        // static metoduma direkt erişebildim.
        }

}
