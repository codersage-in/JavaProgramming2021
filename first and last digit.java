import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	for(int i=0;i<a;i++)
	{
	    int n=scan.nextInt();
	    int y=n%10;
	    while(n>9)
	    {
	        n=n/10;
	    }
	    int sum = n+y;
	    System.out.println(sum);
	}
	}
	
}