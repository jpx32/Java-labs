import java.util.*;
import java.io.*;

public class HistoRunner{
   
    public static void main (String args[]) throws IOException{
         //intakes file
         File Histo = new File("histogram.dat");
         Scanner in = new Scanner (Histo);
         //initializes the histogram 
         Histogram histog = new Histogram();
         //while there is another line
         while(in.hasNext()){
            //makes an arrayList of each term in the line
            ArrayList<String> scan2 = new ArrayList<String>(Arrays.asList(in.nextLine().substring(2).split(" ")));
            ArrayList<Character> scan = new ArrayList<Character>();
            for(int j = 0; j < scan2.size(); j++){
               scan.add(scan2.get(j).charAt(0));
            }
            //for each character
            for(int i = 0; i < scan.size(); i++){
               //uses histo Add method on each character 
               histog.histoAdd(scan.get(i));
            }
            //Prints histogram 
            histog.toString(histog.getMap());
         }
         
    }
    
}