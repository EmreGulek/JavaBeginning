/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emregulek
 */
public class NewClass {
    
    public static void main(String[] args) {
        String[]dizi1={"aa","aaaa","aaaaaaaaa","a","aa","aa"};
        int m=1;
        
        String maxx="";
      
        
        
        System.out.println(enUzunString(dizi1,m, maxx));
        
    }
    public static String enUzunString(String[] dizi2, int n,String maxIndex) {
   
    if (dizi2.length == 1) {
        return dizi2[0];
       
    }
    
    
   if(maxIndex.length()<=dizi2[n].length()){
    
        maxIndex = dizi2[n];
        
   if(n==5){
        return maxIndex;
   }
   
        n=n+1;
        return enUzunString(dizi2,n,maxIndex);
   }
   
   return maxIndex;
    }
}
      
   
    

  
  
   

