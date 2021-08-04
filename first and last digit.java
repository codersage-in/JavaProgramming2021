import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int [] a=new int[100];
            int i=0;
            while(n!=0){
                a[i]=n%10;
                n=n/10;
                i++;
            }
            int sum=a[0]+a[i-1];
            System.out.println(sum);
        }
    }
}
