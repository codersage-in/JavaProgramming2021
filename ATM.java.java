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
		Double withdrawl,account_bal;
		withdrawl=sc.nextDouble();
		account_bal = sc.nextDouble();;
		if(withdrawl % 5 ==0 && withdrawl <= account_bal-0.50)
		{
		    account_bal = account_bal - (withdrawl+0.50);
		    System.out.printf("%.2f" , account_bal);
		}
		else
		{
		    System.out.printf("%.2f", account_bal);
		}
	}
}
