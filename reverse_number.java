import java.util.Scanner;

public class reverse_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,rev;
        System.out.println("Enter the length");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the number ");
            num = sc.nextInt();
            System.out.println("The number is = " +  num);
            rev = 0;
            if (num >= 1 && num <= 1000)
            {
                while (num > 0)
                {
                    int rem = num % 10;
                    rev = rev * 10 + rem;
                    num = num / 10;
                }
            }
            System.out.println("The reversed num is = " + rev);
        }
    }
}

