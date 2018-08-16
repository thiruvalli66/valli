import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ser
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<=0)
		System.out.println("invalid");
		else if(n==1)
		System.out.println(1);
		else
		{
			int a=1,b=1,next;
			System.out.println(a+" "+b);
			for(int i=2;i<n;i++)
			{
				next=a+b;
				System.out.println(" "+next);
				a=b;
				b=next;
			}
		}
	}
}
