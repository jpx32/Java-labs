import java.util.*;
import java.io.*;

public class Acronyms{
    
   String b;
   String c;
   String d;
   ArrayList <String> acrosal;
   TreeMap <String, String> acros;
    
   public Acronyms(){
      acros = new TreeMap<String, String>();
   }
   
   public void acroAdd(String a){
      b = a;
      acros.put(b.substring(0,b.indexOf(" - ")), b.substring(b.indexOf(" - ")+3));
   }
   
   public String acrostc(String a){
      c = a;
      d = "";
      acrosal = new ArrayList<String>(Arrays.asList(c.split("[ .]")));
      for(int i =0 ; i < acrosal.size(); i++){
         if(acros.containsKey(acrosal.get(i))){
            d += acros.get(acrosal.get(i))+" ";
         }else{
            d +=acrosal.get(i)+" ";
         }
      }
      return d;
   }
   
}