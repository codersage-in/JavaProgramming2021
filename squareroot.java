import java .util.*;
public class squareroot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        int num;
        if(n>=1 && n<=10)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the number = ");
                num=sc.nextInt();
                System.out.println("Entered number = " + num);
                if(num>=1 && num<=10000)
                {
                    System.out.println("Square root = " + (int)Math.sqrt(num));
                }
            }
        }
        sc.close();
    }
}

