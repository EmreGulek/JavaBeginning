package OOP_Beginning.Example2;

public class University {
    public static void main(String[] args) {


        ComputerEngineeringStudent Alperen = new ComputerEngineeringStudent("Alperen", "Aktaş", 32, 2,30,30);
        System.out.println("\n"+Alperen.studentName+" adlı öğrencinin verileri : ");
        System.out.println(Alperen.studentName+"'nin ödev puanlarının ortalaması : "+(Alperen.exam1+Alperen.exam2)/2);
        Alperen.agnoCalculation();

        ComputerEngineeringStudent Emre = new ComputerEngineeringStudent("Emre", "Gülek", 554, 3,10,20,40);
        System.out.println("\n"+Emre.studentName+" adlı öğrencinin verileri : ");
        System.out.println(Emre.studentName+"'nin ödev puanlarının ortalaması : "+(Emre.exam1+Emre.exam2+Emre.exam3)/3);
        Emre.agnoCalculation();

        ComputerEngineeringStudent Mirac = new ComputerEngineeringStudent("Miraç","Özmen",12,1,100);
        System.out.println("\n"+Mirac.studentName+" adlı öğrencinin verileri : ");
        System.out.println("\n"+Mirac.studentName+" adlı öğrencinin verileri : ");
        System.out.println(Mirac.studentName+"'nin ödev puanlarının ortalaması: "+Mirac.exam1);
        Mirac.agnoCalculation();


    }
}