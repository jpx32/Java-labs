import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class UniqueDupes {
   ArrayList<String> orig;
   Set<String> uniques;
   ArrayList<String> dupes;
   Set<String> dupesTurn;
   Set<String> uniquestemp;
   String str1 = "";
   
   public UniqueDupes(String str){
       str1 = str;
       orig = new ArrayList<String>(Arrays.asList(str1.split(" ")));
       System.out.println("Original List: "+orig);
       System.out.println("Uniques: "+uniques(str1));
       System.out.println("Dupes: "+dupes(str1)+"\n");
   }
   
   public Set<String> uniques (String one){
      str1=one;
      uniques = new TreeSet<String>(Arrays.asList(str1.split(" ")));
      return uniques;
   }
   
   public Set<String> dupes (String two){
      str1=two;
      uniquestemp = new TreeSet<String>(Arrays.asList(str1.split(" ")));
      dupes = new ArrayList<String>(Arrays.asList(str1.split(" ")));
      dupesTurn = new TreeSet<String>();
      Iterator itr = uniquestemp.iterator();
      while(itr.hasNext()){
         dupes.remove(itr.next());
      }
      for(int i = 0;  i<dupes.size(); i++){
         dupesTurn.add(dupes.get(i));
      }
      return dupesTurn;
   }
   
}