import java.util.*;
import java.io.*;

public class Relatives{

   TreeMap <String, String> rel;
   String y;

   public Relatives(){
      rel = new TreeMap<String, String>();
   }
   
   public void relate(String x){
      y=x;
      if(rel.containsKey(y.substring(0,y.indexOf(" ")))||rel.containsKey(y.substring(y.indexOf(" ")+1))){
         rel.put(y.substring(0,y.indexOf(" ")), y.substring(y.indexOf(" ")+1) + rel.get(y.substring(0,y.indexOf(" ")))+" ");
         rel.put(y.substring(y.indexOf(" ")+1), y.substring(0,y.indexOf(" ")) + rel.get(y.substring(y.indexOf(" ")+1))+" ");
      }else{
         rel.put(y.substring(0,y.indexOf(" ")), y.substring(y.indexOf(" ")+1) +" ");
         rel.put(y.substring(y.indexOf(" ")+1), y.substring(0,y.indexOf(" ")) +" " );      
      }
   }
   
   public TreeMap<String, String> getMap(){
      return rel;
   }
   
   public void outPrint(TreeMap<String, String> m){
      rel = m;
      for (Map.Entry<String, String> entry : rel.entrySet()) {
         String key = entry.getKey();
         Object value = entry.getValue();
         System.out.println(key + " is related to "+ value);
       }
   }
   
   
}