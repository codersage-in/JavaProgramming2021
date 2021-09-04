import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		if (N%4==0)
		{
		    System.out.print(++N);
		}
		else
		{
		    System.out.print(--N);
		}
	}
}