
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			  Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=1;i<=n;i++) {
           int a = s.nextInt();
           int b=s.nextInt();
           int c=s.nextInt();
           if((a+b+c)==180){
               System.out.println("YES");
           }
           else
           System.out.println("NO");
       }
	}
}
