import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		if( (c >= 'a' && c<= 'z') || (c >= 'A' && c <= 'z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("no");
		}
	}
}
