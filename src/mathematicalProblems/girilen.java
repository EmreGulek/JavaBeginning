package mathematicalProblems;


import java.util.Scanner;

public class girilen {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar kaç tane asal sayı olduğunu hesaplayan program

        Scanner k = new Scanner(System.in);
        int number = k.nextInt();

        boolean flag = true;
        int sayac = 0 ;
        if(number>=2) ++sayac;
        else {
            System.out.println("0");
            System.exit(0);
        }

          here:  for (int i = 2; i < number; i++) {
                for (int j = 2; j < i && i!=j; j++) {
                    flag = true;
                    if (i % j == 0) {
                        flag = false;
                        continue here;
                    }
                }
                if (flag) ++sayac;
            }


        System.out.println(sayac);


    }
}
