//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		SyntaxChecker one = new SyntaxChecker("(abc(*def)") ;
        SyntaxChecker two = new SyntaxChecker("[{}]");
        SyntaxChecker three = new SyntaxChecker( "[");	
        SyntaxChecker four = new SyntaxChecker("[{<()>}]") ;
        SyntaxChecker five = new SyntaxChecker("{<html[value=4]*(12)>{$x}}") ;
        SyntaxChecker six = new SyntaxChecker("[one]<two>{three}(four)") ;
        SyntaxChecker seven = new SyntaxChecker("car(cdr(a)(b)))") ;
        SyntaxChecker eight = new SyntaxChecker("car(cdr(a)(b))") ;
	}
}
