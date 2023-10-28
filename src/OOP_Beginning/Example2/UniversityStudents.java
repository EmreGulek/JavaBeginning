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


    public UniversityStudents(String studentName, String studentLastName, int no, int courseNumber, double exam1 , double exam2,double exam3) {
        this(studentName,studentLastName,no,courseNumber,exam1,exam2);
        // İkinci constructor'ı çağırıp onun üzerinden işlem yapar.
        // this ile çoklu constructor kullanımı yaptım. Böylece kod tekrarından kaçınmış oldum.

        this.exam3 = exam3;
    }

    public UniversityStudents(String studentName, String studentLastName, int no, int courseNumber, double exam1 , double exam2) {
       this(studentName,studentLastName,no,courseNumber,exam1);
        // Birinci constructor'ı çağırıp onun üzerinden işlem yapar.
        this.exam2=exam2;

    }

    public UniversityStudents(String studentName , String studentLastName, int no , int courseNumber,double exam1){
        this.no = no;
        this.studentName= studentName;
        this.studentLastName = studentLastName;
        this.courseNumber = courseNumber;
        this.exam1 = exam1;
    }

    protected  abstract void agnoCalculation ();
    // Bu sınıfı soyut bir sınıf yaptım . Çünkü tüm subclass'lar bu metodu override ediyor.

    }














