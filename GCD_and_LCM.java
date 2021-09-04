import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcd = 1;
            for(int i = 1; i <= a && i <= b; i++)
            {
                if(a%i==0 && b%i==0) {
                    gcd = i;
                }
            }
            int lcm=(a*b)/gcd;
            System.out.println(gcd);
            System.out.println(lcm);
        }
    }
}
