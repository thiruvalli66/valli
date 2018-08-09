import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int low=150,high=160;
		for(int number =low+1;number<high;++number)
		{
			int digits=0;
			int result=0;
			int originalNumber=number;
			//number of digits calculation
			while(originalNumber !=0)
			{
				originalNumber /=10;
				++digits;
			}
			originalNumber = number;
			//result contains sum of nth power of its digits
			while (originalNumber !=0)
			{
				int remainder=originalNumber % 10;
				result +=Math.pow(remainder,digits);
				originalNumber /= 10;
			}
			if(result==number)
			System.out.print(number + " ");
		}
	}
}
