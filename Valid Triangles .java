import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if(a+b+c == 180)
		    {
		      System.out.println("YES");
		    }
		    else
		    {
		      System.out.println("NO");  
		    }
		}
	}
}