import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int c=0;
		    for(int j=1;j<=a;j++)
		    {
		        if(a%j==0)
		        c++;
		        
		    }
		    if(c==2)
		    System.out.println("yes");
		    else System.out.println("no");
		    
		
		
		}
	}
}
