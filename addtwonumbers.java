import java.util.*;
public class addtwonumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter the numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a + b;
            System.out.println("Sum of " + a + " and " + b + " = " + ans);
        }
    }
}
