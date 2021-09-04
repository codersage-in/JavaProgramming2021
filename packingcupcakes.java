import java.util.*;
public class packingcupcakes
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = in.nextInt();
        if(n>=1 && n<=1000)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println("Total cupcakes = ");
                int A= in.nextInt();
                System.out.println("Maximum Size = " + ((A/2)+1));
            }
        }
        in.close();
    }
}

