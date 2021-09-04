import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int winner=0;
		int maximum=0;
		int a=0;
		int b=0;
		for(int i=0 ; i<N ; i++)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    a = x+a;
		    b = y+b;
		    if(Math.abs(a-b) > maximum)
		    {
		        maximum = Math.abs(a-b);
		        if(x>y)
		        {
		            winner=1;
		        }
		        else{
		            winner=2;
		        }
		    }
		}
		System.out.println(winner + " " + maximum);
		}
	}