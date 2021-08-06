import java.util.*;
public class reverseforloop
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        //int reversed = 0;
        int num = 12345, reversed =0;

        for(;num!=0;num/=10);
        {
            int digit = num%10;
            reversed = reversed *10+digit;
        }
        System.out.println("Reversed number="+ reversed);
    }
}
