/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		//try {
		    Scanner Sc = new Scanner (System.in);
		    int t = Sc.nextInt();
		    if(t>=1 && t<=100)
		    {
		      for (int i=0; i<t ; i++)
		      {
		       int n =Sc.nextInt();
		       
		       BigInteger f = BigInteger.ONE;
		       
		       
		       for (int j=1;j<=n ;j++ )
		            f=f.multiply(BigInteger.valueOf(j));
		        
		        System.out.println(f);
		      }
		    }
		    else
		     System.out.println(-1);
		//} catch(Exception e) {
		//}
	}
}
