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
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0)
		{
		    int c=0;
		    int max=0;
		    String s=in.next();
		    int p=s.length();
		    if(p%2!=0)
		    System.out.println("NO");
		    else
		    {
		        for(int i=0;i<p;i++)
		        {
		            c=0;
		            char ch=s.charAt(i);
		            for(int j=0;j<p;j++)
		            {
		                char chr=s.charAt(j);
		                if(ch==chr)
		                c++;
		            }
		            if(c>max)
		            max=c;
		        }
		        if(max==p/2)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		}
	}
}