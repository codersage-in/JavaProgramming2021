import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		try
		{
		    int t = input.nextInt();
		    while(t-- > 0)
		    {
		        int a = input.nextInt();
		        int b = input.nextInt();
		        int c = input.nextInt();
		        int d = input.nextInt();
		        if(((a==b) && (c==d)) || ((a==c) && (b==d)) || ((a==d) && (b==c)))
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
