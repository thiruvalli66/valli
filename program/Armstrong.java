import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num=371,number,temp,total=0;
		number=num;
		while(number != 0)
		{
			temp=number % 10;
			total = total+temp*temp*temp;
			number /=10;
		}
		if(total==num)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
