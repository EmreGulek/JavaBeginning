package OOP_Beginning.Example2;

public abstract class UniversityStudents {
    String studentName;
    String studentLastName;
    int no;
    double AGNO =0;
    int courseNumber ;
    double exam1;
    double exam2;
    double exam3;

    public UniversityStudents(String studentName , String studentLastName, int no , int courseNumber,double exam1){
        this.no = no;
        this.studentName= studentName;
        this.studentLastName = studentLastName;
        this.courseNumber = courseNumber;
        this.exam1 = exam1;
    }

    public UniversityStudents(String studentName, String studentLastName, int no, int courseNumber, double exam1 , double exam2) {
        this.studentName= studentName;
        this.studentLastName=studentLastName;
        this.no=no;
        this.courseNumber=courseNumber;
        this.exam1 = exam1;
        this.exam2=exam2;
    }

    public UniversityStudents(String studentName, String studentLastName, int no, int courseNumber, double exam1 , double exam2,double exam3) {
        this.studentName= studentName;
        this.studentLastName=studentLastName;
        this.no=no;
        this.courseNumber=courseNumber;
        this.exam1 = exam1;
        this.exam2=exam2;
        this.exam3 = exam3;
    }

    protected void agnoCalculation (){ }

    }














