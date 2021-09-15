import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
Scanner sc = new Scanner(System.in);
int t= sc.nextInt();
long a,b,Gcd,Lcm;
   while(t-->0) {
            a=sc.nextInt();
            b=sc.nextInt();
            Gcd=getGcd(a,b);
            Lcm=(a*b)/Gcd;
            System.out.println(Gcd+" "+Lcm);
}
}
public static long getGcd(long a, long b) {
        while(a != b) {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
}