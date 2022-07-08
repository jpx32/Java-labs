import java.util.*;
import java.io.*;

public class Word2 implements Comparable
{

   private String stringTwo;

   public Word2(String x){
      stringTwo = x;
   }
   
   public String getWord(){
      return this.stringTwo;
   }
   
   public int compareTo(Object obj) {
      Word2 str = (Word2) obj;
      String otherstr = str.getWord();
      String Vowels = "aeiouAEIOU"; 
      int vowCount1= 0;
      int vowCount2 = 0;
      for(int k = 0; k < otherstr.length(); k++){
         for(int i = 0;  i < stringTwo.length(); i++){
            if(Vowels.indexOf(stringTwo.substring(i,i+1))>-1){
               vowCount1++;
            }
         }
         for(int j = 0;  j < otherstr.length(); j++){
             if(Vowels.indexOf(otherstr.substring(j,j+1))>-1){
               vowCount2++;
            }
         }
         if(vowCount1 > vowCount2){
            return 1;
         }else if(vowCount1 < vowCount2){
            return -1;
         }
         return stringTwo.compareTo(otherstr);
      }
      return 0;
   }
   
   public void sort (Comparable[] arr){
      for(int i = 0; i < arr.length-1; i++){
         int spot = i;
         for(int j = i; j<arr.length; j++){
            if(arr[j].compareTo(arr[spot])>0){
               spot = j;
            }
         }
         Comparable save = arr[i];
         arr[i] = arr[spot];
         arr[spot] = save;
      }
   }
   
   public String toString(){
      return(stringTwo);
   }
   
}