package OOP_Beginning.Constructor;
//          ** önemli **
public class ConstructorOverloaded2 {
    String type;
    float height;

    public ConstructorOverloaded2(String newType, float newHeight){
        type = newType;
        height = newHeight;
    }
    public ConstructorOverloaded2(String newType){
        this(newType,1.0f);
    }
    public ConstructorOverloaded2(float newHeight){
        this("Pine",newHeight);
    }
    public ConstructorOverloaded2(){
        this("Pine",1.0f);
    }

    public static void main(String[] args) {
        ConstructorOverloaded2 tree1 = new ConstructorOverloaded2("Oak",2.2f);
        ConstructorOverloaded2 tree2 = new ConstructorOverloaded2("Oak");
        ConstructorOverloaded2 tree3 = new ConstructorOverloaded2(3.2f);
        ConstructorOverloaded2 tree4 = new ConstructorOverloaded2();

        tree1.printInfo();
        tree2.printInfo();
        tree3.printInfo();
        tree4.printInfo();
    }
    public void printInfo(){
        System.out.println("\nInfo :" );
        System.out.println("Type:"+type);
        System.out.println("Height:"+height);
    }
}
