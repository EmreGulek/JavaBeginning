package mathematicalProblems;

import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args) {

        // Girilen sayı palindrom mu değil mi ? Sayı String olarak girildi.

      Scanner k = new Scanner(System.in);
      String number = k.next();

        int lengthOfNumber = number.length()-1;
        boolean flag = true;

            for(int i=0 ; i<lengthOfNumber ; i++ , lengthOfNumber--){
                if(number.charAt(i)!=number.charAt(lengthOfNumber)){
                    flag = false;
                    break;
                }
            }

        if(flag)  System.out.println("is a palindrom number");
        else  System.out.println("not a palindrom number");

    }
}
