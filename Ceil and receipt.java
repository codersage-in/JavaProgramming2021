import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int max=2048;
            int count=0;
            while(n>0)
            {
                count=count+n/max;
                n=n%max;
                max=max/2;
            }
            System.out.println(count);
        }
    }
}