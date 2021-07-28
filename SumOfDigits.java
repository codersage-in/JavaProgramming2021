import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int number;
        System.out.println("enter the range of number to find the sum of digits");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter a number");
            number = sc.nextInt();
            int sum = 0;
            while (number > 0) {
                int rem = number % 10;
                sum = sum + rem;
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}
