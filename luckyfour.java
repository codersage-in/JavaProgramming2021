import java.util.*;
public class luckyfour
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        while(T!=0)
        {
            int N = S.nextInt();
            int count=0;
            String str = Integer.toString(N);
            for(int i=0;i<str.length();i++)
            {
                if (str.charAt(i) == '4')
                {
                    count++;
                }
            }

                    System.out.println("count="+count);

        }

    }
}
