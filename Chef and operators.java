import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>y)
		        System.out.println(">");
		    else if(x<y)
		        System.out.println("<");
		   else
		        System.out.println("=");
		}
	}
}