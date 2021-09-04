import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=0;i<n;i++)
        {
            int ans=0;
            int a =sc.nextInt();
            if (a>=100) {
                ans+=a/100;
                a%=100;
            } 
            if (a>=50) {
                ans+=a/50;
                a%=50;
            } 
            if (a>=10) {
                ans+=a/10;
                a%=10;
            } 
            if (a>=5) {
                ans+=a/5;
                a%=5;
            } 
            if (a>=2) {
                ans+=a/2;
                a%=2;
            } 
            if (a>=1) {
                ans+=a/1;
                a%=1;
            }
            System.out.println(ans);
        }
	}
}