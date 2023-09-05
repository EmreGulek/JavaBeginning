package OOP_Beginning;

public class PassByValue {
    static void f (boolean y){
        y = false;
    }

    static void g (A aa){
        aa.i=6;
    }

    public static void main(String[] args) {

        boolean x = true;
        f(x);
        System.out.println(x);

        A a = new A();
        g(a);
        System.out.println(a.i);
    }

   static public class A{
        int i=5;
    }
}

/*
      Methodumun argümanı eğer primitive bir değer olursa örnekte olduğu gibi
     sadece y=x; şeklinde bir atama yapılmış gibi kabul ederiz.
     y de oluşan bir değişikllik x'in değerini etkilemez.
     Çünkü değişen parametre değerimdir.

     Eğer argümanım referans olursa örneğimde olduğu gibi
     A nesnemde oluşan iki adet referansa sahip olurum . Bunlar a ve aa
     her iki referansta aynı nesneyi ve doğal olarak o nesnenin attribute'larını referans alacağı için
     a veya aa referanslarından herhangi birinin nesneyi etkilemesi diğerinin de bundan etkilenmesine neden olur.
 */
