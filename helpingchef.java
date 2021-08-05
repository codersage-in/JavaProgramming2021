import java.util.*;
public class helpingchef
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the length");
        n= in.nextInt();
            for(int i=0;i<n;i++)
            {
                int a= in.nextInt();
                if(a<10)
                {
                    System.out.println("Thanks for helping Chef!");
                }
                else
                {
                    System.out.println("-1");
                }
            }
    }
}
