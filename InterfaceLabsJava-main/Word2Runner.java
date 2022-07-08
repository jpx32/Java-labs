import java.util.*;
import java.io.*;
public class Word2Runner{
   public static void main (String args[]) throws IOException{
      File sortThis = new File("1Word.dat");
      Scanner in = new Scanner(sortThis);
      Word2 [] arr = new Word2[Integer.valueOf(in.nextLine())];
      for(int i =0; i < arr.length; i++){
         arr[i] = new Word2(in.nextLine());
      }
      System.out.println(Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
   }
}