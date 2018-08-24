import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int k=sc.nextInt();
		int i;
		for(i=0;i<k;i++)
		{
			System.out.print(name.charAt(i));
		}

	}
}
