import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class OddEvenSets {
   
   Set<String> values;
   Set<Integer> oddret;
   Set<Integer> evenret;
   String str4 = "";
   
   public OddEvenSets(String str){
      str4 = str;
      sort(str4);
      System.out.println("Odds: "+getOdds(str4));
      System.out.println("Evens: "+getEvens(str4)+"\n");
   }
   
   public Set<Integer> getOdds(String str){
      return oddret;
   }
   
   public Set<Integer> getEvens(String str){
      return evenret;
   }
   
   public void sort(String one){
      str4 = one;
      values = new TreeSet<String>(Arrays.asList(str4.split(" ")));
      oddret = new TreeSet<Integer>();
      evenret = new TreeSet<Integer>();
      Iterator valuez = values.iterator();
      while (valuez.hasNext()){
         String temp = (String)valuez.next();
         if((Integer.valueOf(temp))%2==0){
            evenret.add((Integer.valueOf(temp)));
         }else{  
            oddret.add((Integer.valueOf(temp)));
         }
      }
   }

}