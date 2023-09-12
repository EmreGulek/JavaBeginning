package OOP_Beginning.Constructor;

public class TreeWithDefaultConstructor {

    String type;
    float height;

    public TreeWithDefaultConstructor(){}
    // Bu yazmış olduğum default constructor. Bunu ben yazmazsam da
    // yine de derleyici tarafından Class dosyasına bir tane default constructor sağlanır.

    // Hiçbir argüman almayan ama yine de(benim yazmazsam) compiler ın koyduğu bir constructor var.
    public static void main(String[] args) {
        TreeWithDefaultConstructor tree = new TreeWithDefaultConstructor();
        tree.pointInfo();
        tree.type="0ak";
        tree.height=8.74f;
        tree.pointInfo();
    }

    public void pointInfo(){
        System.out.println("\nInfo :" );
        System.out.println("Type:"+type);
        System.out.println("Height:"+height);
    }
}
