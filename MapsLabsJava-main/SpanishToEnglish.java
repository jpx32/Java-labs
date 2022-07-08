import java.util.*;

public class SpanishToEnglish{
   
   String str1;
   String str2;
   String str3;
   ArrayList <String> arrl;
   TreeMap <String, String> spnengdiction;
   
   public SpanishToEnglish(){
      spnengdiction = new TreeMap<String, String>();
   }
   
   public void intaketrans(String str){
      str1 = str;
      spnengdiction.put(str1.substring(0,str1.indexOf(" ")), str1.substring(str1.indexOf(" "), str1.length()));
   }
   
   public String translation(String str){
      str2 = str;
      str3 = "";
      arrl = new ArrayList<String>(Arrays.asList(str2.split(" ")));
      for(int i = 0; i < arrl.size(); i++){
         str3 += spnengdiction.get(arrl.get(i))+" ";
      }
      return str3;
   }
   
}