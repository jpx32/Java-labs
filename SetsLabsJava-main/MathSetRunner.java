import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MathSetRunner {
   public static void main(String args[]) throws IOException{
      File mathset = new File("mathsetdata.dat");
      Scanner in2 = new Scanner(mathset);
      while(in2.hasNext()){
         MathSet one = new MathSet(in2.nextLine(), in2.nextLine());
      }
   }
}