import java.util.*;
public class ATM{
    public static void main(String arr[]) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double balance = s.nextDouble();
        s.close();
        if((x % 5 == 0) && (x+0.50) <= balance )
        {
            x+=0.5;
            balance -= x;
        }
        System.out.printf("%.2f",balance);
    }
}