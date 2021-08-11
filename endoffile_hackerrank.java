import java.util.*;
public class endoffile_hackerrank
{

    public static void main(String[] args)
    {
        Scanner S = new Scanner (System.in);
        int n =1;
        while(S.hasNext())
        {
            System.out.println(n + " " + S.nextLine());
            n++;
            System.out.println(" ");
        }
    }
}