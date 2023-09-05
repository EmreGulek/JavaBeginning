package Array;

public class reverseCombineRowColumnNames {
    public static void main(String[] args) {

   String[][]array = {{"a","b"},{"c","d"},{"e","f"}};
   String[] arraysa = new String[2];
   String[] arraysu = new String[2];

   String tmp ="";
   for(int i=0 ; i<array.length ; i++) {
       arraysa[i] ="";
       arraysu[i] ="";
       for (int j=0 ; j< array[i].length ; j++){
         tmp =  array[i][j] ;
                for(int a=tmp.length()-1 ; a>=0 ; a--){
                    arraysa[i] += tmp.charAt(a);
                    arraysu[i] += tmp.charAt(a);
                }
       }
   }

        System.out.println(arraysa[0]);
        System.out.println(arraysa[1]);
        System.out.println(arraysu[0]);
        System.out.println(arraysu[1]);


    }
}
