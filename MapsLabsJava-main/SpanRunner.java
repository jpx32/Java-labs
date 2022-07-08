import java.io.*;
import java.util.*;

public class SpanRunner{

   public static void main (String args[]) throws IOException{
      File SpanEng = new File("spantoeng.dat");
      Scanner in = new Scanner (SpanEng);
      int x = Integer.parseInt(in.nextLine());
      SpanishToEnglish spanengone = new SpanishToEnglish();
      for(int i = 0; i < x; i++){
            spanengone.intaketrans(in.nextLine()); 
      }
      while(in.hasNext()){
         System.out.println(spanengone.translation(in.nextLine())); 
      }
   }

}