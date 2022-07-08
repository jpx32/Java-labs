//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jeremiah Pitts
import java.util.*;
import static java.lang.System.*;
   
public class SyntaxChecker
{
   String open = "([{<";
   String close = ")]}>";
	private String exp;
	private Stack<Character> symbols;
   
	public SyntaxChecker()
	{
         setExpression("");
	}

	public SyntaxChecker(String s)
	{
         symbols = new Stack <Character>();
         setExpression(s);
         System.out.print(s+" is ");
         if(checkExpression(s)){
             System.out.println("correct\n");
         }else{
            System.out.println("incorrect\n");
         }
	}
	
	public void setExpression(String s)
	{
       exp = new String();
       for(int i = exp.length()-1; i >= 0; i--){
         if(open.indexOf(s.charAt(i)) == -1||close.indexOf(s.charAt(i)) == -1){
            exp = exp.substring(0,i)+exp.substring(i+1);
         }
       }       
	}

	public boolean checkExpression(String s)
	{
        boolean bool = false;
        for(int j = 0; j < s.length()-1; j++){
            if(open.indexOf(s.substring(j,j+1)) > -1){
               symbols.push(s.charAt(j));
            }else if (close.indexOf(s.substring(j,j+1)) > -1){
               if(!symbols.isEmpty()){
                 char optemp = symbols.pop();
                  if(open.charAt(open.indexOf(optemp))!=close.charAt(open.indexOf(optemp))){
                     bool = true;
                  }
               }
            }
         }
		return bool;
	}
}