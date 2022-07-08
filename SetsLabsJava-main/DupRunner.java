import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DupRunner {

   public static void main(String args[]) throws IOException{
      File dups = new File("dupunies.dat");
      Scanner in = new Scanner(dups);
      while(in.hasNext()){
         UniqueDupes one = new UniqueDupes(in.nextLine());
      }
   }
   
}