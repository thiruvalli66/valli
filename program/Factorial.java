import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num=5;
		long Factorial = 1;
		for(int i=1;i<=num;++i)
		{
			//Factorial = factorial *i;
			Factorial *= i;
		}
		System.out.printf("%d=%d",num,Factorial);
		}
}
