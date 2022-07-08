import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AcroRunner{

   public static void main (String args[]) throws IOException{
      File Acron = new File("acro.dat");
      Scanner in = new Scanner (Acron);
      int x = Integer.parseInt(in.nextLine());
      Acronyms acccc = new Acronyms();
      for(int i = 0; i < x; i++){
         acccc.acroAdd(in.nextLine()); 
      }
      while(in.hasNext()){
         System.out.println(acccc.acrostc(in.nextLine())); 
      }
   }
   
}