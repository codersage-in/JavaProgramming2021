/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	for(int i=0;i<a;i++)
	{
	    int x=scan.nextInt();
	    int y=x%10;
	    while(x>9)
	    {
	        x=x/10;
	    }
	    int sum = x+y;
	    System.out.println(sum);
	}
	}
}
