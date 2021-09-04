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
       int N,i,t;
    Scanner in = new Scanner(System.in);
    t = in.nextInt();
    while(t--!=0)
    {
    BigInteger fact = BigInteger.valueOf(1);
    N = in.nextInt();
    for(i=2;i<=N;i++)
     fact = fact.multiply(BigInteger.valueOf(i));

    System.out.println(fact);
    }
    in.close();
	}
}
