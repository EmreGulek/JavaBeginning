package mathematicalProblems;

import java.util.Scanner;

public class Karekok {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        boolean flag = false;


            for(int i=2 ; i<number/2 ; i++) {
               if( number%i==0){
                   if(i*i==number){
                       System.out.println("Girilen sayımızın karekökü = "+i);
                       flag = true;
                   }
               }
            }

            if(!flag) System.out.println("Girilen sayının bir karekökü yok.");
    }
}
