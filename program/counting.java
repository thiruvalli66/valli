import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class counting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,count=0;
		char ch;
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch!=' ')
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
}
