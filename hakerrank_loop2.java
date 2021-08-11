import java.util.*;
import java.lang.Math.*;

class hackerrank_loop2
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int t= S.nextInt();     //t=testcase.
        for(int i=0;i<t;i++)
        {
            int a = S.nextInt();
            int b = S.nextInt();
            int n = S.nextInt();
            for(int j=0;j<n;j++)
            {
                a += (Math.pow(2, i) * b);
                System.out.print(a + " ");
            }
        }
    }
}