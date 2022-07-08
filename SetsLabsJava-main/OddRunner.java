import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner {

   public static void main(String args[]) throws IOException{
      File oddeven = new File("oddevent-1.dat");
      Scanner in3 = new Scanner(oddeven);
      while(in3.hasNext()){
         OddEvenSets one = new OddEvenSets(in3.nextLine());
      }
   }
   
}