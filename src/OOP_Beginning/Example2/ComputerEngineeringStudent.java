package OOP_Beginning.Example2;

import java.util.Scanner;

public class ComputerEngineeringStudent extends UniversityStudents {

    public ComputerEngineeringStudent(String studentName, String studentLastName, int no, int courseNumber,double exam1 , double exam2) {
        super(studentName, studentLastName, no, courseNumber,exam1,exam2);
    }

    public ComputerEngineeringStudent(String studentName, String studentLastName, int no, int courseNumber,double exam1 , double exam2,double exam3) {
        super(studentName, studentLastName, no, courseNumber,exam1,exam2,exam3);
    }
    public ComputerEngineeringStudent(String studentName, String studentLastName, int no, int courseNumber,double exam1) {
        super(studentName, studentLastName, no, courseNumber,exam1);
    }
    @Override
public  void agnoCalculation (){

    Scanner k = new Scanner(System.in);

        for(int i=0 ; i<this.courseNumber ; i++) {


        System.out.println("Ders adını giriniz. ");
        k.next();

        System.out.println("Dersin notunu giriniz. ");
        AGNO += k.nextInt();

    }
    AGNO = (AGNO/courseNumber)+(this.exam1+this.exam2)*0.5;
        System.out.println(this.exam1);
        System.out.println("Öğrencinin AGNO puanı  : "+AGNO);
}



}
