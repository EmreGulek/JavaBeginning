package Array;

import java.sql.SQLOutput;
import java.util.Random;

public class maxValueInArray {
    public static void main(String[] args) {

        int array[][] = new int[2][2];
        Random r = new Random();

        for(int i=0; i<array.length;i++){
            for(int j=0 ; j<array[i].length ; j++){
                array[i][j]=r.nextInt(10);
                System.out.println(array[i][j]);
            }
        }
        int maxValue = array[0][0];

        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ; j<array[i].length ; j++){
                if(maxValue<array[i][j]){
                    maxValue = array[i][j];
                }
            }
        }

        System.out.println("En büyük sayımız : ");
        System.out.print(maxValue);
    }
}
