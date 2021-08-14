import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        float total=0;

        for(int i=0;i<t;i++)
        {
            int quantity = sc.nextInt();
            int price = sc.nextInt();

            if(quantity>=1000)
            {
                total=(quantity*price)-(quantity*price)*10/100;
            }
            else
            {
                total=quantity*price;
            }
            System.out.format("%.6f",total);
        }
    }
}
