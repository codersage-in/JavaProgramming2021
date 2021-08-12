import java.math.BigInteger;
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
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
		    int n = sc.nextInt();
		    BigInteger fact= new BigInteger("1");
		    for(int j =1; j<=n;j++){
		        fact=fact. multiply (BigInteger.valueOf(j));
		    }
		    System.out.println(fact);
		}
	}
}