import java.util.*;
import java.io.*;

public class Word1 implements Comparable
{

   private String stringOne;

   public Word1(String x){
      stringOne = x;
   }
   
   public String getWord(){
      return this.stringOne;
   }
   
   public int compareTo(Object obj) {
      Word1 str = (Word1) obj;
      String otherstr = str.getWord();
      for(int k = 0; k < otherstr.length(); k++){
         if(stringOne.length() > otherstr.length()){
            return 1;
         }else if(stringOne.length() < otherstr.length()){
            return -1;
         }
         return stringOne.compareTo(otherstr);
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
      return(stringOne);
   }
   
}