package OOP_Beginning.thisKeyword.Bank;
public class CreditCard {
    String no;
    double balance;

    Customer owner;


    public CreditCard(String no, double balance, Customer owner) {
        this.no = no;
        this.balance = balance;
        this.owner = owner;
// Constructor ayrıca bir Customer nesnesinin referansını değer olarak alıyor.
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Customer getOwner() {

        return owner;
    }
}