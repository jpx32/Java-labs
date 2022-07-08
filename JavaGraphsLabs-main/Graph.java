//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 

import java.util.*;

public class Graph
{
	private TreeMap<String, ArrayList<String>> map;
    private ArrayList<String> currConnections;
    private List <String> list;
	private boolean found;
    private boolean cont;
    private String line;
    private String lttr;
    private String letter;
    private String toStrings;
    private String one;
    private String two;
    private String placesChecked;
    
	public Graph(String line)
	{
      line = this.line;
      list = Arrays.asList(line.split(" "));
      Collections.sort(list);
	}

	public boolean contains(String letter)
	{
      lttr=letter;
      for(int i = 0; i < lttr.length()-1;i++){
         if((line.substring(i,i+1)==lttr)&&(line.substring(i+1, i+2)!=(" "))){
            return true;
         }
      }
      return false;
	}

	public void check(String first, String second, String placesUsed)
	{  
       
       one = first;
       two = second;

       if(first.indexOf(second.charAt(0))>-1||first.indexOf(second.charAt(1))>-1){
         found = true;
       }else{
          currConnections = map.get(one);
            for(int i = 0; i < currConnections.size(); i++){
               check(list.get(i),second, placesUsed+first);
            }
       }
	}

	public String toString()
	{
       if(found=true){
         return(two.substring(1,2) + " connects to " + two.substring(0,1) + "== yes");
       }else{ 
         return(two.substring(1,2) + " connects to " + two.substring(0,1) + "== no");
       }
    }
}
