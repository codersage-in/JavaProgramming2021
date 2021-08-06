import java.util.*;
public class reverse_while
{
    public static void main(String[] args)
    {
        Scanner S= new Scanner(System.in);
        int num = S.nextInt();
        int reversed =0;
        while(num!=0)
        {
            int digit = num%10;
            reversed = reversed*10+digit;
            num=num/10;
        }
        System.out.println("Reversed Number =" + reversed);
    }
}
