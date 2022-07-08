//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremiah Pitts

import java.util.Stack;
import java.util.*;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;
   
	public StackTest()
	{
		setStack("");
	}

	public StackTest(String line)
	{
         stack = new Stack <String>();
         setStack(line);
         System.out.println(stack+"\n");
         System.out.println("popping all items from the stack");
         popEmAll();
	}
	
	public void setStack(String line)
	{  
         String [] temp = line.split(" ");   
         for(int j = 0 ; j< temp.length; j++){
            stack.push(temp[j]);
         }
	}

	public void popEmAll()
	{
         for(int i =  stack.size()-1; i >= 0; i--){
            System.out.print(stack.pop()+" ");
         }
         System.out.println("\n\n");
	}
}