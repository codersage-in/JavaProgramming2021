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
	    int T=in.nextInt();
	    for(int i=1;i<=T;i++){
	        int num=in.nextInt();
	        if(num==0)
	        {
	            System.out.println("0");
	        }
	        else if(num%5==0)
	        {
	            System.out.println("1");
	        }
	        else
	        System.out.println("-1");
		}
	}
}
