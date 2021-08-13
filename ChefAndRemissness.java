import java.util.Scanner;

public class ChefAndRemissness
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0,total=0;
        int t = sc.nextInt();
        for(int i=0 ; i<t ; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
            {
                max = a - b;
            }
            else
            {
                max = b - a;
            }
            total=a+b;
            System.out.println(a+" "+total);
        }
    }
}
