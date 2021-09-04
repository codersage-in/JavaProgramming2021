import java.util.*;
public class smallfactorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,x=1;
        System.out.println("Enter the length");
        t=sc.nextInt();
        while(t--!=0)
        {
            System.out.println("Enter the number = ");
            n=sc.nextInt();
            for(int i=n;i>0;i--)
            {
                x = x * i;
            }
            System.out.println("Factorial = " + x);
            x=1;
        }
    }
}
