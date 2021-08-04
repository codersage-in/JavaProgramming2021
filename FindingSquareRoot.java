import java.util.Scanner;


class SquareRoot
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		// Get the total nos
           int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
	  {
            int k = sc.nextInt();
            int res = (int)Math.sqrt(k);
            System.out.println(res);
        }

	}
}