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
          int n= s.nextInt();
          for (int i=0;i<n;i++){
              int x=s.nextInt();
              int ans=(x/2)+1;
              System.out.println(ans);
          }
	}
}