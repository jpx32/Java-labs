import java.util.*;
import java.io.*;

public class RelativesRunner{
   public static void main (String args[]) throws IOException{
      File Relat = new File("relatives.dat");
      Scanner in = new Scanner (Relat);
      int x = Integer.parseInt(in.nextLine());
      Relatives rr= new Relatives();
      for(int i = 0; i < x; i++){
         rr.relate(in.nextLine());
      }
      rr.outPrint(rr.getMap());
   }
}