import java.util.Scanner;
import java.math.BigInteger;

class SmallFactorial
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			BigInteger fact = BigInteger.ONE;
			for(int j=1;j<=a;j++)
			{
				fact = fact.multiply(BigInteger.valueOf(j));
			}
			System.out.println(fact);

            sc.close();
		}
	}
}