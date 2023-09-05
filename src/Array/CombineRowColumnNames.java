package Array;

public class CombineRowColumnNames {
    public static void main(String[] args) {

        // İki boyutlu dizinin satırındaki ve sütunundaki ifadeleri birleştiren program.


        String[][] array = {{"emre","ali"},{"ahmet","kemal"}};
        String[] toplamsa = new String[2];
        String[] toplamsu = new String[2];

        for(int i=0 ; i<array.length; i++){
            toplamsa[i]="";
            toplamsu[i]="";

            for(int j=0 ; j<array[i].length ; j++) {
                toplamsa[i] += array[i][j];
                toplamsu[i] += array[j][i];
            }
        }

        // [i][j] şeklinde yapıldığı zaman satır satır okuma yapar.
        // [j][i] ||  ||    ||        ||   sütun sütun olarak okuma yapar.

        System.out.println(toplamsa[0]);
        System.out.println(toplamsa[1]);

        System.out.println(toplamsu[0]);
        System.out.println(toplamsu[1]);
    }
}
