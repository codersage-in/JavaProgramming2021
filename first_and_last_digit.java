import java.util.*;
public class first_and_last_digit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int n=scan.nextInt();
            int y=n%10;
            while(n>9)
            {
                n=n/10;
            }
            int sum = n+y;
            System.out.println(sum);
        }
    }
}
