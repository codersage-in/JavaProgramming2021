import java.util.*;
public class smallfactorials
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double x=1;
        int t;
        System.out.println("Enter the length");
        t=s.nextInt();
        while(t--!=0)
        {
            System.out.println("Enter the number = ");
           int n=s.nextInt();
            for(int i=n;i>0;i--)
            {
                x = x * i;
            }
            System.out.println("Factorial = " + x);
            x=1;
        }
    }
}
