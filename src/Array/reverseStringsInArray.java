package Array;

public class reverseStringsInArray {
    public static void main(String[] args) {

        String[] array = {"Emre","Ali","Ahmet","Abdullah","Kıvanç"};
        String tmp ;

        for(int i=0 ; i<array.length ; i++){
            tmp=array[i];
            String newString="";
            for(int j=tmp.length()-1;j>=0;j--){
                newString += tmp.charAt(j);
            }
            array[i] = newString;
            System.out.println(array[i]);
        }
    }
}
