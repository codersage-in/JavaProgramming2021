import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int number;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

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
