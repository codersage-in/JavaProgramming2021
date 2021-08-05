import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();      //T= total no. of test
        for(int i =0;i<T;i++)
        {
            int N = S.nextInt();
            if(N<10)
            {
                System.out.println("Thanks for helping chef");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
