import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intervals
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		for(int i=n+1;i<q;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
