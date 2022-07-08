//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  
import java.util.*;
public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
      setPQ("");
	}

	public PQTester(String list)
	{
      pQueue = new LinkedList<String>();
      setPQ(list);
      System.out.println(getMin());
      System.out.println(getNaturalOrder());
	}

	public void setPQ(String list)
	{
         String[] arrlist = list.split(" ");
         for(int i = 0; i < arrlist.length; i++){
            pQueue.add(arrlist[i]);
         }
	}
	
	public Object getMin()
	{
		return (pQueue.peek());
	}
	
	public String getNaturalOrder()
	{
        String output="";
        Stack <String>tempstack = new Stack <String>();
        Iterator<String> itr = pQueue.iterator();
        while (itr.hasNext())
        {
            tempstack.add(itr.next());
        }
        Collections.sort(tempstack);
        for(int j = 0; j < tempstack.size();j++){
          output+=tempstack.get(j)+" ";
        }
		return output+"\n";		
	}


}