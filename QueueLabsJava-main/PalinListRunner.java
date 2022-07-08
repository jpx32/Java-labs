//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PalinListRunner
{
	public static void main ( String[] args )
	{
	   PalinList one = new PalinList("one two three two one");	
       System.out.println(one);
       PalinList two = new PalinList("1 2 3 4 5 one two three four five");	
       System.out.println(two);
       PalinList three = new PalinList("a b c d e f g x y z g f h");	
       System.out.println(three);
       PalinList four = new PalinList("racecar is racecar");	
       System.out.println(four);
       PalinList five = new PalinList("1 2 3 a b c c b a 3 2 1");	
       System.out.println(five);
       PalinList six = new PalinList("chicken is a chicken");		
       System.out.println(six);
	}
}