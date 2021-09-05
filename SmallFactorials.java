/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		if(t>=1 && t<=100)
		{
		    for(int i=1;i<=t;i++)
		    {
		        int num=s.nextInt();
    		    BigInteger fact= BigInteger.ONE;
    		    for(int j=num;j>0;j--)
    		        fact = fact.multiply(BigInteger.valueOf(j));
        		    System.out.println(fact);
		    }
		}
		else 
		System.out.println(-1);
		   
		    
		}
	}

