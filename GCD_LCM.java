import java.util.*;
public class GCD_LCM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
         {
			long a = sc.nextLong(),b=sc.nextLong();
			long ans1 = gcd(a,b);
			long ans2 = lcm(a,b);
			System.out.println(ans1 + " "+ans2);
         }
            sc.close();
    }
    public static long gcd(long a, long b) 
    {
		if(b==0)
        {return a;}
		else {return gcd(b,a%b);}	
	}
	public static long lcm(long a , long b)
    {
		return (a)/gcd(a,b)*b;
	}
}