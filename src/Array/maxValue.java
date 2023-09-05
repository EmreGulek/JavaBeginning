package Array;

import java.util.Random;

public class maxValue {
    public static void main(String[] args) {

        Random r = new Random();
        int[] array = new int[10] ;
        int arrayMaxElement = 0 ;
        int maxElementPosition = 0 ;
        for(int i=0 ; i<10 ;i++){
            array[i]= r.nextInt(100);
            System.out.println("array "+(i+1)+". elemanı :"+array[i]);
            if(array[i]>arrayMaxElement){
                arrayMaxElement = array[i];
                maxElementPosition = i+1;
            }
        }
        System.out.println("Dizinin en büyük elemanı : "+arrayMaxElement);
        System.out.println("Dizimizin en büyük elemanı dizimizin "+maxElementPosition+". elemanıdır ");


    }
}
