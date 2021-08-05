import java.util.*;
public class incrementdecrement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%4==0)
        {
            n = n+1;
            System.out.println("Divisible hence n = " + n);
        }
        else
        {
            n = n-1;
            System.out.println("Not-divisible hence n = " + n);
        }
    }
}
