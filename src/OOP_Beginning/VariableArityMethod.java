package OOP_Beginning;

public class VariableArityMethod {
    // Değişen sayıda argümana sahip metodlar :
    public static void main(String[] args) {
    calculateAverage(1,2);

    int array_a [] = {1,2,3,4,5};
    calculateAverageWithArray(array_a);

    calculateAverageArity(1,2,3,4,5);

    calculateAverageWithArrayAndBooelan(true,1,2,3,4,5);

    calculateAverageWithArrayAndBooelan2(1,true,1,2,3,4,5);


    }
    public static void calculateAverage(int x,int y){
        System.out.println("Average : "+(double)(x+y)/2) ;
    }

    public static void calculateAverageWithArray(int[] array){
        int sum = 0 ;
        int i = 0 ;

        for(int x : array){
            sum += x ;
            i++;
        }
        System.out.println("Average : "+(double)sum/i);
    }

    public static void calculateAverageArity ( int ... array){
        int i=0 ;
        int sum = 0;

        for(int x : array){
            sum += x;
            i++;
        }
        System.out.println("Average : "+(double)sum/i);
    }

    public static void calculateAverageWithArrayAndBooelan(boolean b, int ... array) {
        int sum = 0;
        if(b){
        for(int x : array){
            sum += x;
        }
            System.out.println("Sum : "+sum);
        }
    }

    public static void calculateAverageWithArrayAndBooelan2(int y ,boolean b, int ... array) {
        int sum = 0;
        if(b){
            for(int x : array){
                sum += x;
            }
            System.out.println("Sum : "+sum+y);
        }
    }
}

/*  NOT:
    Metoda parametre girildiği zaman overloading yapılan hangi metoda gideceği net olarak belli olmalı.

    public static void f(int a , int b){
    sout(a+b); }

    public static void f(int a , int ... array){
    int sum = 0 ,
    int i = 0 ;
    for(int x : array){
    sum += x;
    i++;
    }
    sout(sum+a);}

    public static void f(int ... array) {
    int sum =0 ;
    int i=0,
    for(int x:array) {
    sum += x;
    i++;  }
    sout(sum);

    psvm{
    f(1);
    f(1,2,3),
    f(1,2);

    Burada bulunan kodların hangi metoda gideceği nerden bilinebilir ki ?
    Kodu yazarken dikkatli ve NET olmak lazım.
    }




 */
