import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
			Scanner sc = new Scanner(System.in);
		int temp= sc.nextInt();
		long x,y,Gcd,Lcm;
		    while(temp-->0) {
            x=sc.nextInt();
            y=sc.nextInt();
            Gcd=getGcd(x,y);
            Lcm=(x*y)/Gcd;
            System.out.println(Gcd+" "+Lcm);
		}
	}
	public static long getGcd(long m, long n) {
        while(m!= n) {
            if(m>n)
            {
            m=m-n;
            }
            else 
            {
            n=n-m;
            }
        }
            return m;
	}
}
