import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d= sc.nextInt();
            if((a==b&&c==d)||(a==c&&b==d)||(a==d&&c==b)||(b==c&&a==d)||(b==d&&a==c)||(c==d&&a==b))
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            }
	}
}
