//imports
import java.util.*;
import java.io.*;
//Histogram Class
public class Histogram{
   
   Map <Character, String> mapl;
   Character y = null;
   
   public Histogram(){
      mapl = new TreeMap<Character, String>();
   }
   
   public void histoAdd(Character x){
      //initializing the variables
      y = x;
      //initializing main map

      //if it contains the certain character
      if(mapl.containsKey(y)){
      //adds a star to the getKey()
         mapl.put(y,mapl.get(y)+"*");
      //if not 
      }else{
      //add it to the map with one occurence (star)
         mapl.put(y,"*");
      }
   }
   
   public Map<Character, String> getMap(){
      return mapl;
   }
   
   public void toString(Map m){
      Iterator<Character> it;
      it = mapl.keySet().iterator();
         System.out.println("char      1---5----01---5");
         while(it.hasNext()){   
            char c = it.next(); 
            System.out.println(c+"           "+mapl.get(c));
         }
         System.out.println("\n");
         mapl.clear();
   }
}