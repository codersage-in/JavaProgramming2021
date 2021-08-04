/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class add
{
	public static void main (String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
	
		int sum=0;
		for(int i=0;i<t;i++)
		{
		    int n = in.nextInt();
		    while (n!=0)
		    {
    		    sum = sum + (n%10);
    		    n = n/10;
		    }
		    System.out.println(sum);
		    sum = 0;
		}
		
	}
}
