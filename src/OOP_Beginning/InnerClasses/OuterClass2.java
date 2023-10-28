package OOP_Beginning.InnerClasses;

public class OuterClass2 {
// Üye İç Sınıflar - member ınner class - : Static değiller ve dış sınıf olmadan erişilemezler.
    private int outerValue1 = 1;
    private static int  outerValue2 = 2;

    public class MemberInnerClass{
        public void printOuterValue(){
            System.out.println(outerValue1);
            System.out.println(outerValue2);
        }
    }

    public static void main(String[] args) {
        OuterClass2 outer2 = new OuterClass2();
        MemberInnerClass memberInnerClass = outer2.new MemberInnerClass();
        memberInnerClass.printOuterValue();

    }

}


/*
erel iç sınıf (local inner class) ve üye iç sınıf (member inner class) arasında bazı önemli farklar vardır:

Tanımlandıkları Yer:
Yerel İç Sınıf (Local Inner Class): Yerel iç sınıflar, bir metot içinde tanımlanır ve sadece bu metot içinde kullanılabilirler. Diğer metotlardan ve dışarıdan erişilemezler.
Üye İç Sınıf (Member Inner Class): Üye iç sınıflar, dış sınıfın içinde tanımlanır ve dış sınıfın üyeleri gibi davranırlar. Dolayısıyla, dış sınıfın herhangi bir üyesi gibi kullanılabilirler.

Erişim Düzeyi:
Yerel İç Sınıf (Local Inner Class): Yerel iç sınıflar, yalnızca tanımlandıkları metot içinde erişilebilirler. Diğer metotlardan ve dış sınıfın üyelerinden erişilemezler.
Üye İç Sınıf (Member Inner Class): Üye iç sınıflar, dış sınıfın tüm üyelerine (değişkenler, metotlar) erişebilirler. Ayrıca, dış sınıfın örneği oluşturulmadan da kullanılabilirler.

Kapsam (Scope):
Yerel İç Sınıf (Local Inner Class): Yerel iç sınıfların kapsamı yalnızca tanımlandıkları metotun kapsamıdır. Yani, sınıfın dışında erişilemezler.
Üye İç Sınıf (Member Inner Class): Üye iç sınıflar, dış sınıfın kapsamına aittirler ve dış sınıfın diğer üyeleriyle aynı kapsamı paylaşırlar.

Örnekleme (Instantiation):
Yerel İç Sınıf (Local Inner Class): Yerel iç sınıfların örnekleri sadece tanımlandıkları metot içinde oluşturulabilirler. Diğer metotlardan veya sınıf dışından bu sınıfların örnekleri oluşturulamaz.
Üye İç Sınıf (Member Inner Class): Üye iç sınıfların örnekleri, dış sınıfın örnekleri üzerinden oluşturulabilir. Ayrıca, dış sınıfın dışında da bu sınıfların örnekleri oluşturulabilir.
 */
