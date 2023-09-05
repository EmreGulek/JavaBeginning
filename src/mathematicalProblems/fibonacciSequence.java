package mathematicalProblems;

public class fibonacciSequence {
    public static void main(String[] args) {

        // Fibonacci serisinin ilk 10 elemanını yazdıran program :

        int number1 = 1 ;
        int number2 = 1 ;
        int counter = 0 ;
        while(counter<5) {
            System.out.println(number1);
            System.out.println(number2);
            number1 += number2;
            number2 += number1;
        counter++;
        }
    }
}
