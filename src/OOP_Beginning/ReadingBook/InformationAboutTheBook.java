package OOP_Beginning.ReadingBook;

public class InformationAboutTheBook {

    public static void main(String[] args) {

        // Kitap 1
        Book book1 = new Book();
        book1.name = "Le Petit Prince";
        book1.page = 112;
        book1.isHardCover = true;
        book1.type = "KidsBook";
        book1.language = "French";

        Author author1 = new Author();
        book1.author = author1;
        author1 = book1.author;
        book1.author.name = "Antoine de Saint-Exupéry";

        // Kitap 2
        Book book2 = new Book();
        book2.name = "The Lord of the Rings";
        book2.page = 426;
        book2.isHardCover = true;
        book2.type = "Mythopoeia";
        book2.language = "English";

        Author author2 = new Author();
        book2.author = author2;
        author2 = book2.author;
        book2.author.name = "J. R. R. Tolkien";

        // Kitap 3
        Book book3 = new Book();
        book3.name = "The Godfather";
        book3.page = 595;
        book3.type = "Crime/Drama";
        book3.language = "English";
        book3.isHardCover = false;

        Author author3 = new Author();
        book3.author = author3;
        author3 = book3.author;
        book3.author.name = "Mario Puzo";

        // Kitap 4
        Book book4 = new Book();
        book4.name = "The Lord of the Rings";
        book4.page = 520;
        book4.language = "English";
        book4.type = "Fantastic";

        book4.author = author2; // Kitap 4'ün yazarı kitap 2'nin yazarıdır.
        author2 = book4.author;

        System.out.println(" ");
        System.out.println(getInfo(book1));
        System.out.println(" ");
        System.out.println(getInfo(book2));
        System.out.println(" ");
        System.out.println(getInfo(book3));
        System.out.println(" ");
        System.out.println(getInfo(book4));

    }

    public static String getInfo(Book book) {
        return "Book Name: " + book.name + "\n" +
                "Author: " + book.author.name + "\n" +
                "Page Count: " + book.page + "\n" +
                "Hard Cover: " + book.isHardCover + "\n" +
                "Type: " + book.type + "\n" +
                "Language: " + book.language;
    }
}
