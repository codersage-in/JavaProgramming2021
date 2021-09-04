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
		Scanner sc=new Scanner(System.in);
        double withdraw=sc.nextDouble(),acc_bal=sc.nextDouble();
        if(withdraw%5==0 && withdraw<=(acc_bal-0.50)){
            acc_bal=acc_bal - (withdraw+0.50);
            System.out.printf("%.2f",acc_bal);
        }
        else{
            System.out.printf("%.2f",acc_bal);
        }
	}
}
