/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class NewClass2 {
    
    
    
    
    
    public static void main(String[] args) {
        String[] dizi1 = {"aa","aaaa","aaaaaaaaa","a","aa","aa"};
        
        System.out.println(enUzunString(dizi1));
    }
    
    public static String enUzunString(String[] dizi) {
        if (dizi.length == 1) {
            return dizi[0];
        }
        
        String enUzun = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i].length() > enUzun.length()) {
                enUzun = dizi[i];
            }
        }
        return enUzun;
    }
}

