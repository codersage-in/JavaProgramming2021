import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
			    int a=0,b=0;
		Scanner s = new Scanner(System.in);
                                 int n=s.nextInt();
                                 for(int i=0;i<n;i++)
		{
          int num=s.nextInt();
		    if(num%2==0)
		    {
		        a=a+1;
		    }
		    else{
		        b=b+1;
		    }
		}
		if(a>b)
		{
		    System.out.println("READY FOR BATTLE");
		}
		else
		{
		    System.out.println("NOT READY");
		}
	}
}