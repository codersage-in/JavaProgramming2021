import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		try 
		{
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0)
		    {
		        int n=sc.nextInt();
		        int x1=sc.nextInt();
		        int y1=sc.nextInt();
		        int x2=sc.nextInt();
		        int y2=sc.nextInt();
		        int x3=sc.nextInt();
		        int y3=sc.nextInt();
		        int d1=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		        int d2=(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
		        int d3=(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
		        int n1=n*n;
		        if(d1<=n1 && d2<=n1 || d2<=n1 && d3<=n1 || d1<=n1 && d3<=n1)
		        {
		            System.out.println("yes");
		        }
		        else
		        {
		            System.out.println("no");
		        }
		    }
		    
		} catch(Exception e) {return;}
	}
}