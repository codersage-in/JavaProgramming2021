/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t--!=0)
		{
		  int n=in.nextInt();
		  if(n%2==0)
			  System.out.println((n+2)/2);
		  else
			  System.out.println((n+1)/2);
		}
	}
}
