package OOP_Beginning.Constructor;

public class TreeWithArgumentConstructor {
 String type;
 float height;
    public TreeWithArgumentConstructor(String newType , float newHeight){
        type = newType;
        height = newHeight;
    }

    public static void main(String[] args) {
        TreeWithArgumentConstructor tree1 = new TreeWithArgumentConstructor("Pine",2.0f);
        TreeWithArgumentConstructor tree2 = new TreeWithArgumentConstructor("Apple",5.5f);
        tree1.pointInfo();
        tree2.pointInfo();
    }

    public void pointInfo(){
        System.out.println("\nInfo :" );
        System.out.println("Type:"+type);
        System.out.println("Height:"+height);
    }
}
