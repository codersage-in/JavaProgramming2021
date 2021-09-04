import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n1,n2;
		Scanner src = new Scanner(System.in);
		n1 = src.nextInt();
		n2 = src.nextInt();
		if(n1>n2)
		    System.out.println(n1-n2);
		else    
		    System.out.println(n1+n2);
	}
}

