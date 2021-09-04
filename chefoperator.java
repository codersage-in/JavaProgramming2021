import java.util.*;
public class chefoperator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the numbers :");
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            if(num1>num2)
            {
                System.out.println(">");
            }
            else if(num1<num2)
            {
                System.out.println("<");
            }
            else
            {
                System.out.println("=");
            }
        }
        sc.close();
    }
}

