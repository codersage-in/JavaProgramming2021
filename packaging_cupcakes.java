import java.util.*;
public class packaging_cupcakes
{
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i;
            for (i = 0; i < t; i++) {
                int a = sc.nextInt();
                System.out.println((a / 2) + 1);
            }
        }
}
