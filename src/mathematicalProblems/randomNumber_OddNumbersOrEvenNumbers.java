package mathematicalProblems;

import java.util.Random;

public class randomNumber_OddNumbersOrEvenNumbers {
    public static void main(String[] args) {

        // Random olarak 100 e kadar olan sayılardan  alınan 10 sayıdan
        // tek olanları bir arada çiftnolanları bir arada toplayan program :

        Random r = new Random();
        int oddNumberCollection = 0;
        int evenNumberCollection = 0;
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            if (number % 2 == 0) {
                System.out.println(i + ". number :" + number);
                evenNumberCollection += number;
            } else {
                System.out.println(i + ". number :" + number);
                oddNumberCollection += number;
            }
        }

        System.out.println("Tek sayıların toplamı :" + oddNumberCollection);
        System.out.println("Çift sayıların toplamı :" + evenNumberCollection);
    }
}
