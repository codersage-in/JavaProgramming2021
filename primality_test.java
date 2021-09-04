import java.util.*;
//import java.math.*;
public class primality_test 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int num=sc.nextInt();
            int count=0;
            for(int a=1;a<=num;a++)
            {
                if(num%a==0)
                {
                    count++;
                }
                if(count==2)
                {
                    System.out.println("yes");
                }
                else{System.out.println("no");}
            }
        }
        sc.close();
    }
}
// BigInteger n = scan.nextBigInteger();
//System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");