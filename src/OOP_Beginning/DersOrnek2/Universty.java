package OOP_Beginning.DersOrnek2;

public class Universty {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.name=("Software Engineering");

        Professor professor1 = new Professor();
        professor1.name="Taner Tuncer";

        Course course1 = new Course();

        course1.name="Algorithms";


        Student student1 = new Student();
        student1.name="Emre Gülek";

        department1.head=professor1;
        professor1.department=department1;

        System.out.println(department1.name+" with "+department1.head.name+" :");

        course1.department = department1;
        department1.courses=new Course[10];
        department1.courses[0]=course1;

        System.out.println(course1.department.name); // == System.out.println(course1.name);

        course1.teacher = professor1;

        professor1.coursesGiven=new Course[2];
        professor1.coursesGiven[0]=course1;
        System.out.println(course1.teacher.name);

        professor1.advisee=new Student[100];
        professor1.advisee[0]=student1;

        student1.adviser = professor1;
        System.out.println(professor1.advisee[0].name);

        student1.coursesTaken=new Course[7];
        student1.coursesTaken[0]=course1;

        course1.students = new Student[50];
        course1.students[0] = student1;
        System.out.println(student1.coursesTaken[0].name);

        System.out.println("******************");

        Course course2 = new Course();
        course2.name="BBT";
        course2.students = new Student[10];
        course2.students[0]=student1;
        course2.department=department1;
        department1.courses[1]=course2;
        course2.teacher=professor1;
        professor1.coursesGiven[1]=course2;

        professor1.coursesGiven[1] = course2;
        student1.coursesTaken[1] = course2;

        System.out.println(course2.department.name);
        System.out.println(course2.name);
        System.out.println(course2.students[0].name);
        System.out.println(course2.department.head.name);



    }
}
