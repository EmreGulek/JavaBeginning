package Array;


public class secondMaxValue{
    public static void main(String[] args) {

        int array[] = {11,2,3,7,6,5,9,0,-2,5};

        int maxValue=array[0];
        int maxValuePosition=0;
        int myValue=array[0];

        for(int i=0 ; i<array.length ; i++){

            if(array[i]>maxValue){
                maxValue=array[i];
                maxValuePosition=i;
            }
            if(myValue>array[i]){
                myValue=array[i];
            } // myValue değerime dizideki en küçük elemanımı atadım.
        }

        for(int i=0 ; i<array.length ; i++){
            if(myValue<array[i] && i!=maxValuePosition){
                myValue=array[i];
            }
        }

        System.out.println("En büyük elemanımız = "+(maxValuePosition+1)+". elemanımızdır => "+maxValue);
        System.out.println("En büyük 2. elemanımız = "+myValue);
    }
}
