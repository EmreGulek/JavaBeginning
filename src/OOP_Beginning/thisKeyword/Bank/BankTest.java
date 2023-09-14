package OOP_Beginning.thisKeyword.Bank;
public class BankTest {

    public static void main(String[] args) {


        Customer c1 = new Customer(2, "Kemal");
        // Customer nesnesine ait c1 kişisini oluşturdum.

        CreditCard cc1 = new CreditCard("2222222222222222", 2500.0, c1);
        // cc1 kredi kartını oluşturdum.
        // Bu kredi kartına no'sunu , bilançosunu ve kredi kartı sahibini girdim.

        System.out.println(cc1.getOwner().name);
// cc1.getOwner().name ifadesi,
// önce cc1 tarafından temsil edilen kredi kartının sahibi olan Customer nesnesine erişir
// ardından bu müşterinin name özelliğine erişir ve adını yazdırır.


        CreditCard cc3 = c1.getCc();
        if(cc3 == null)
            System.out.println("NULLLLLL");


    }

}