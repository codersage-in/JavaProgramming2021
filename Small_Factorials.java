import java.util.Scanner;
import java.math.BigInteger;
public class Small_Factorials {
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        if(t>=1 && t<=100)
        {
            for(int i=1;i<=t;i++)
            {
                int num=s.nextInt();
                BigInteger fact= BigInteger.ONE;
                for(int j=num;j>0;j--)
                    fact = fact.multiply(BigInteger.valueOf(j));
                System.out.println(fact);
            }
        }
        else
            System.out.println(-1);
    }
}
