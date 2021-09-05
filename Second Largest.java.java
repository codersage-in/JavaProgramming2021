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
		Scanner sc = new Scanner(System.in);
		try 
		{
		    int t = sc.nextInt();
		    while(t-->0)
		    {
		        long a,b,c;
		        a=sc.nextLong();
		        b=sc.nextLong();
		        c=sc.nextLong();
		        if((a>b) && (a<c) ||  (a<b) && (a>c))
		       {
		            System.out.println(a);
		       }
		       else if ((b>a) && (b<c) || (b<a) && (b>c))
		       {
		           System.out.println(b);
		       }
		       else {
		           System.out.println(c);
		       }
		    }
		} 
		catch(Exception e)
		{
		    return;
		} 
	}
}
