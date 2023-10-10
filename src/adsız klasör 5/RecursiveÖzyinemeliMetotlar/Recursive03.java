/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class Recursive03 {
    
    // Kendisine parametre olarak gelen sayı kadar adınızı ekrana yazdıran program.
    
    public static void main(String[] args) {
        
        System.out.println(function(5,"Emre"));
        
    }
    
    public static String function(int x, String name) {
        
        if(x==1) {
        return name ;
        }
    
    
    else {
            System.out.println(name);
            return function(x-1,name) ;
}
    
}
}