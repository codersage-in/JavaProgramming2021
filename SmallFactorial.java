/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(;t>0;t--)
		{
		    int num=s.nextInt();
		    int fact;
		    for(fact=1;num>0;num--)
		    {
		        fact*=num;
		        
		    }
		    System.out.println(fact);
		   
		}
	}
}
