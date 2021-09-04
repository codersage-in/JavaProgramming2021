/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input>=1 && input<=100){
		for(int i=0;i<input;i++){
		    int num = sc.nextInt();
		    BigInteger fac = new BigInteger("1");
		    for(int j=1;j<=num;j++){
		    fac = fac.multiply(BigInteger.valueOf(j));    
		    }
		    System.out.println(fac);
		    }
		}
		
	}
}
