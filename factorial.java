import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int num = 3;
        int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}