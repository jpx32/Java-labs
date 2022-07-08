//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2 :)
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
         listOfInts = new ArrayList <Integer>();
	}

	public void add(int item)
	{
      listOfInts.add(item);
	}

	public int remove()
	{
        int poll = listOfInts.get(0);
        listOfInts.remove(0);
        return poll;
	}

	public boolean isEmpty()
	{
        if(listOfInts.size()==0){
           return true;
        }
		return false;
	}

	public int peek()
	{
		if(listOfInts.size()>0){
         return(listOfInts.get(0));
       }else{
         return 0;
       }
	}

	public String toString()
	{
        String returnString = "[";
        if(listOfInts.size()>1){
            for(int j = 0; j < listOfInts.size()-1; j++){
               returnString+=listOfInts.get(j)+", ";
            }
            returnString+=listOfInts.get(listOfInts.size()-1);
         }else if(listOfInts.size()==1){
            returnString+=listOfInts.get(0);
         }
         returnString+="]";
		 return returnString;
	 }
}
