package OOP_Beginning.InnerClasses;


    /*
     Nested Classes : 1)static inner classes. => Sadece içinde tanımlandığı sınıfın statik alanlarına doğrudan erişebilirler.
                      2)inner classes. => Parçası olduğu sınıfın static alanlarına , private tanımlansalar bile ulaşabilirler.
                            2a) Member Inner Classes
                            2b) Local Inner Classes
                            2c) Anonymous Classes

     class OuterClass1{
        class InnerClass{---}
        static class NestedClass{ --- }
        }

     */

    // Static ınner class :


public class OuterClass1 {
    private static int outerVar1 = 10 ;
    private int outerVar2 = 20 ;

    public static class StaticInnerClass{
        public void printOuterValue(){
            System.out.println(outerVar1);
        //  System.out.println(outerVar2); static inner class , static olmayan  bir değişkene direkt ulaşamaz.
        }
    }

    public static void main(String[] args) {
     // statik iç sınıfa erişim için dış sınıfın adı ve iç sınıfın adı kullanılabilir.

     //     Dış sınıf üzerinden de iç sınıf canlı hale getirilebilir.
        OuterClass1.StaticInnerClass inner = new OuterClass1.StaticInnerClass();
        inner.printOuterValue();
    //    Static iç sınıf sadece kendisi olarak da canlı hale getirilebilir.
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.printOuterValue();
    }

}
