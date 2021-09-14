import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner S = new Scanner (System.in);
		int T,a,b,c,d,i;
		T = S.nextInt();
		for(i=0;i<T;i++)
		{
		    a = S.nextInt();
    		b = S.nextInt();
    		c = S.nextInt();
    		d = S.nextInt();
		
        if(a == b && c == d)
        { 
           System.out.println("YES\n");
        }
        else if(a == d && c == b)
        {
            System.out.println("YES\n");
        }
        else if(a == c && b == d)
        {
            System.out.println("YES\n");
        }
        else
        {
            System.out.println("NO\n");
		}
		    
		}
		
	}
}

 