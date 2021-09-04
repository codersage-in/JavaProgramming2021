import java.util.*;
public class totalexpenses 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int quantity,price;
        for(int i=0;i<n;i++)
        {
            quantity=sc.nextInt();
            price = sc.nextInt();
            float discount=0;
            if(quantity>1000)
            {
                discount = (float) (quantity*price*10)/100;
            }
            float expense = quantity*price - discount;
            System.out.println(expense);
        }
        sc.close();
    }   
}
