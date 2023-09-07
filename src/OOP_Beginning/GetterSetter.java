package OOP_Beginning;

public class GetterSetter {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 400, "Rowling", "Kodlama Vakti");

        // Sayfa sayısını ayarla
        book.setNumberOfPage(10);

        // Sayfa sayısını al ve yazdır
        System.out.println(book.getNumberOfPage());
    }
}

class Book {
    public String name, author, publisher;
    private int numberOfPage;

    public Book(String name, int numberOfPage, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;

        if (numberOfPage < 1) {
            this.numberOfPage = 10;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
