import java.util.*;
public class remainder
{
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int N, number, rev;
            N = sc.nextInt();
            if (N >= 1 && N <= 1000) {
                for (int i = 0; i < N; i++) {
                    number = sc.nextInt();
                    rev = 0;
                    if (number >= 1 && number <= 1000000) {
                        while (number > 0) {
                            int rem = number % 10;
                            rev = rev * 10 + rem;
                            number = number / 10;
                        }
                    }
                    System.out.println(rev);
                }
            }
        }
}
