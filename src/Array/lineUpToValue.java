package Array;

public class lineUpToValue {
    public static void main(String[] args) {

     // Diziyi küçükten büyüğe sıralama :

        int[] array = {2,1,4,5,-1} ;
        int[] lineUp = new int[5];
        int minValue= array[0];
        int maxValue = array[0];

        for(int i=0 ; i< array.length;i++){
            if(array[i]>maxValue){
                maxValue = array[i];
            }
        }

        int a = 0;
        int b = 0;

     while(a<5){
          for (int i = 0; i < array.length; i++) {
              if (minValue > array[i]) {
                  minValue = array[i];
                  b = i;
              }
          }

          lineUp[a] = array[b];
          array[b] = maxValue++;
          minValue = maxValue++;

         System.out.println(lineUp[a]);
          a++;


      }

    }
}
