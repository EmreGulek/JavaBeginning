package mathematicalProblems;

import java.util.Random;

public class primeNumber {
    public static void main(String[] args) {

        // asal sayı bulan metot :

        Random r = new Random();
        int number = r.nextInt(100);


        System.out.println("number : " + number);


        boolean flag = true;

        if (number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number != i && number % i == 0) {
                    flag = false;
                    break;

                }
            }
        }

        if (flag) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }


}



