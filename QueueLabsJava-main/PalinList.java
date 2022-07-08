//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
   private String stackString;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{ 
        stack = new Stack<String>();
        queue = new LinkedList<String>();
        setList(list);
        stackString = list;
	}

	public void setList(String list)
	{
       String[] arrlist = list.split(" ");
         for(int i = 0; i < arrlist.length; i++){
           queue.add(arrlist[i]);
         }
           System.out.println(queue);
         for(int i = 0; i < arrlist.length; i++){
            stack.add(arrlist[i]);
         }
         System.out.println(stack);
	}

	public boolean isPalin()
	{
      while(!queue.isEmpty()){
            if(queue.poll()!=stack.pop()){
               return false;
            }
        }
        return true;
    }


	public String toString()
	{
        if(isPalin()){
           return stackString + " is a palinList.";
        }else{
          return stackString + " is not a palinList.";
        }
	 }
}