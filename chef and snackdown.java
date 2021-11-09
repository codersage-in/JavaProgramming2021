import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
		    int N=s.nextInt();
		    if(N==2010 || N==2015 || N==2016 || N==2017 || N==2019){
		        System.out.println("HOSTED");
		    }
		    else{
		        System.out.println("NOT HOSTED");
		    }
		}
	}
}