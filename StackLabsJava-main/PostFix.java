//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 

import java.util.*;
import static java.lang.System.*;

public class PostFix
{
   String operators = "+-*/";
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
      setExpression("");
	}

	public PostFix(String exp)
	{
         stack = new Stack<Double>();
         setExpression(exp);
         System.out.println(exp+" = "+ solve(exp));
    }

	public void setExpression(String exp)
	{
         for(int i = exp.length()-1; i>=0; i--){
            if(exp.substring(0,1)==" "){
               exp = exp.substring(0,i)+exp.substring(i+1);
            }
         }
	}

	public double calc(double one, double two, char op)
	{
       //Simple Math
		switch (op){
         case('+'):
         return ((one)+(two));
         case('*'):
         return ((one)*(two));
         case('-'):
         return ((one)-(two));
         case('/'):
         return ((one)/(two));
         default:
         return 0.0;
        }
	}

	public double solve(String exp)
	{  
         for(int i = 0; i < exp.length(); i++){
           //Takes in last bit of String
           String temp = String.valueOf(exp.charAt(i));
           //If the part of a string is a number
            if (Character.isDigit(temp.charAt(0))){
               //Push it in 
               stack.push(Double.parseDouble(temp));
            //If temp as a char is in the operators list:
            }else if(operators.indexOf(temp.charAt(0))!=-1){
                    //Pop the first two and store
                   double operand1 = stack.pop();
                   double operand2 = stack.pop();
                   //calc method ^^ with variables
                   double temp2 = calc(operand2, operand1, temp.charAt(0));
                   //push it in the stack
                   stack.push((temp2));
            }
          }
         //return the last thing in pop
         return(stack.pop());
	   }
      public static void main(String args[]){
         PostFix one = new PostFix("2 7 + 1 2 + +");
         PostFix two = new PostFix("1 2 3 4 + + +");
         PostFix three = new PostFix("9 3 * 8 / 4 +");
         PostFix four = new PostFix("3 3 + 7 * 9 2 / +");
         PostFix five = new PostFix("9 3 / 2 * 7 9 * + 4 -");
         PostFix six = new PostFix("5 5 + 2 * 4 / 9 +");
      }
}
