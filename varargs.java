import org.jetbrains.annotations.NotNull;

import java.util.*;
class varargs
{
    public int Add(int @NotNull ... args)
    {
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args)
        {
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args )
    {
        varargs v = new varargs();

        int sum1 = v.Add(2, 4);
        System.out.println("sum2 = " + sum1);

        int sum2 = v.Add(1, 3, 5);
        System.out.println("sum3 = " + sum2);

        int sum4 = v.Add(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}