import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int a,b,c;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    if(a+b==c || b+c==a || a+c==b)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    t--;
		}
	
	}
}
