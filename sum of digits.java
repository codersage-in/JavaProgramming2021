import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n;
        int number;
        
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            number = sc.nextInt();
            int sum = 0;
            while (number > 0) {
                int rem = number % 10;
                sum = sum + rem;
                number = number / 10;
            }
            System.out.println(sum);
        }
	}
}
