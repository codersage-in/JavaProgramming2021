import java.util.*;
public class secondlargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the length");
        n=sc.nextInt();
        if(n>=1 && n<=1000)
        {
            for (int i = 0; i < n; i++)
            {
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                int num3=sc.nextInt();
                int largest;
                if((num1>num2 && num1>num3))
                {
                    largest=num1;
                }
                else if(num2>num3)
                {
                    largest=num2;
                }
                else
                {
                    largest=num3;
                }
                int lowest=(num1<num2 && num1<num3)?num1:(num2<num3?num2:num3);
                if(num1<num2 && num1<num3)
                {
                    lowest = num1;
                }
                else if(num2<num3)
                {
                    lowest = num2;
                }
                else
                {
                    lowest = num3;
                }
                System.out.println("LARGEST = " + largest);
                if(num1<largest && num1>lowest)
                    System.out.println("Second largest = " + num1);
                else if(num2<largest && num2>lowest)
                    System.out.println("Second largest = " + num2);
                else
                    System.out.println("Second largest = " + num3);
            }
        }

    }
}
