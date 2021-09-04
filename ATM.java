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
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		double t=s.nextDouble();
		if((n+0.5)<=t&&(n%5==0))
		{
		    t=t-(n+0.5);
		}
		System.out.printf("%.2f",t);
	}
}
