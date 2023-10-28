package OOP_Beginning.InnerClasses;

public class OuterClass3 {
    // Local Inner Class
    public int outerValue = 10;

    public void doSomething(){
        // LocalInnerClass adında bir yerel iç sınıf, doSomething metodu içinde tanımlanmıştır.
        //  Yerel iç sınıf, sadece tanımlandığı metot içinde kullanılabilir ve bu metotun dışında erişilemez.
        class LocalInnerClass {
            public void printOuterValue(){
                System.out.println(outerValue);
            }
        }

        LocalInnerClass innerClass = new LocalInnerClass();
        innerClass.printOuterValue();

        /* LocalInnerClass sınıfının örneği,
 sadece doSomething metodunun içinde tanımlandığı metotta erişilebilir ve bu metottan dışarıda (örneğin main metodunda) kullanılamaz.
Bu nedenle main metodunda doğrudan LocalInnerClass'ın bir örneği oluşturamam.
ve bu örneğin metotlarını çağıramazsınız. LocalInnerClass'ın örneği, doSomething metodunun içinde oluşturulmalı ve orada kullanılmalıdır.

         */
    }

    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.doSomething();
    }
}
