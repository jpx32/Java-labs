import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class MathSet {
   
   Set<String> unionret1;
   Set<String> unionret2;
   Set<String> unionret3;
   Set<String> intersectionret1;
   Set<String> intersectionret2;
   Set<String> diffABret1;
   Set<String> diffABret2;
   Set<String> diffBAret1;
   Set<String> diffBAret2;
   Set<String> symdifret1;
   Set<String> symdifret2;
   String strtwo = "";
   String strthree = "";
   
   public MathSet(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      System.out.println("union: "+union(strtwo,strthree));
      System.out.println("intersection: "+intersection(strtwo,strthree));
      System.out.println("difference A-B: "+diffAB(strtwo,strthree));
      System.out.println("difference B-A: "+diffBA(strtwo,strthree));
      System.out.println("symmetric difference: "+symDif(strtwo,strthree)+"\n");
   }
   
   public Set<String> union(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      unionret1 = new TreeSet<String>(Arrays.asList(strtwo.split(" ")));
      unionret2 = new TreeSet<String>(Arrays.asList(strthree.split(" ")));
      Iterator itr1 = unionret2.iterator();
      while(itr1.hasNext()){
         unionret1.add((String)itr1.next());
      }
      return unionret1;
   }
   
   public Set<String> intersection(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      intersectionret1 = new TreeSet<String>(Arrays.asList(strtwo.split(" ")));
      intersectionret2 = new TreeSet<String>(Arrays.asList(strthree.split(" ")));
      intersectionret1.retainAll(intersectionret2);
      return intersectionret1;
   }
   
   public Set<String> diffAB(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      diffABret1 = new TreeSet<String>(Arrays.asList(strtwo.split(" ")));
      diffABret2 = new TreeSet<String>(Arrays.asList(strthree.split(" ")));
      diffABret2.retainAll(diffABret1);
      Iterator itr = diffABret2.iterator();
      while(itr.hasNext()){
         diffABret1.remove((String)itr.next());
      }
      return diffABret1;
   }
   
   public Set<String> diffBA(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      diffBAret1 = new TreeSet<String>(Arrays.asList(strtwo.split(" ")));
      diffBAret2 = new TreeSet<String>(Arrays.asList(strthree.split(" ")));
      diffBAret1.retainAll(diffBAret2);
      Iterator itr = diffBAret1.iterator();
      while(itr.hasNext()){
         diffBAret2.remove((String)itr.next());
      }
      return diffBAret2;
   }
   
   public Set<String> symDif(String str, String strzero){
      strtwo = str;
      strthree = strzero;
      symdifret1 = diffAB(strtwo,strthree);
      symdifret2 = diffBA(strtwo,strthree);
      Iterator itr3 = symdifret2.iterator();
      while(itr3.hasNext()){
         symdifret1.add((String)itr3.next());
      }
      return symdifret1;
   }
   
}