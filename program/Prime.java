import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,m=0,flag=0;      
  int n=11;//it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println("n0");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println("no");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("yes"); }  
  }//end of else  
	}
}
