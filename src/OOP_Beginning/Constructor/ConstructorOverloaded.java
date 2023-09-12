package OOP_Beginning.Constructor;

public class ConstructorOverloaded {
    String type;
    float height;

    public ConstructorOverloaded(){
        type = "Pine";
        height =1.0f;
    }
    public ConstructorOverloaded(String newType){
        type=newType;
        height=1.0f;
    }
    public ConstructorOverloaded(float newHeight){
        type="Pine";
        height = newHeight;
    }
    public ConstructorOverloaded(String newType , float newHeigth){
        height = newHeigth;
        type=newType;
    }

    public void printInfo(){
        System.out.println("\nTree Info =");
        System.out.println("Type:"+type);
        System.out.println("Height:"+height);
    }

    public static void main(String[] args) {
        ConstructorOverloaded tree1 = new ConstructorOverloaded();
        ConstructorOverloaded tree2 = new ConstructorOverloaded("Oak");
        ConstructorOverloaded tree3 = new ConstructorOverloaded(4.2f);
        ConstructorOverloaded tree4 = new ConstructorOverloaded("Oak",12.04f);

        tree1.printInfo();
        tree2.printInfo();
        tree3.printInfo();
        tree4.printInfo();
    }
}
