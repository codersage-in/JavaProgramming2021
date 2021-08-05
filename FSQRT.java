import java.util.Scanner;
class demo
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int i=1; i<=tc; i++)
		{
			int n=sc.nextInt();
		    int sqrtroot=(int)Math.sqrt(n);
			System.out.println(sqrtroot);
		}
	}
}
		