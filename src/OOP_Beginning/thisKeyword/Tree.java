package OOP_Beginning.thisKeyword;

public class Tree {
    String type ;
    float height;

    public Tree(String type , float height){ //Constructor
        this.type = type;
        this.height = height;
    }

    public Tree copy(){
        Tree copyTree = new Tree(type,height);
        return copyTree;
        //Tree nesnesinden copyTree adlı bir referans oluşturup
        //oluşturmuş olduğum referansıma type ve height değerlerimi yolladım.
    }

    public Tree grow(){
        height++;
        return this;
    // Tree nesnemi referans alan referansım bu metod sayesinde uzunluğunu artırmış olcak.
    // Ayrıca kendisini de geri döndürücek . (Referans aldığı nesnesinin tipinde)
    }

    public void printInfo(){
        System.out.println("\nTree Info :" );
        System.out.println("Type : "+type);
        System.out.println("Type : "+height);
        // Not : this.height dememe gerek yok zaten o nesnenin içerisindeyim
    }

    public static void main(String[] args) {
        Tree tree = new Tree("Pine",15.0f);
        tree.printInfo();

        Tree treee;


        Tree copyTree = tree.copy();
        // copy metodumda oluşturmuş olduğum height ve type değerlerine sahip referansımla
        // copyTree referansım artık aynı değerleri referans alıyorlar.
        copyTree.printInfo();
        System.out.println();

        // tree ve copyTree aynı nesneyi mi gösteriyorlar karşılaştırması yapılıyor burada.
        if (tree == copyTree)
            System.out.println("The same");

        else
            System.out.println("Different");

        tree.grow().grow().grow().printInfo();
        // ilk başta constructor yardımıyla oluşturduğum referansımı 3. kez büyütüp değerini yazdırıyorum.
        Tree grownTree = tree.grow();
        // Tree türünden yeni bir referans oluşturup onu büyüttüm.

        // Önemli not:
        // yukarıda yüksekliğini artırdığım değerler ana constructor a sahip Tree nesnemi referans aldıkları için
        // onlar üzerinde yapılan yükseklik değerinin değişiklikleri sonradan oluşturulan grownTree referansıma da başlanıç değeri olarak geçer.
        // Yanı grownTree nesnem başlangıç olarak 15 yüksekliğinde değil 18 yüksekliğindedir.
        grownTree.printInfo();

        System.out.println();


        if (tree == grownTree)
            System.out.println("The same");
        else
            System.out.println("Different");

    }


}
