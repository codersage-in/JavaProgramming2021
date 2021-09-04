import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int a[]=new int[t];
	    int i=0,temp=0;
	    for( i=0;i<t;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    for( i=0;i<t;i++)
	    {
	        System.out.println(a[i]);
	    }
		// your code goes here
	}
}