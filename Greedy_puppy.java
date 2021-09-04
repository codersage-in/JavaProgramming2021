import java.util.Scanner;
public class Greedy_puppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println((a%b));
        }
    }
}
