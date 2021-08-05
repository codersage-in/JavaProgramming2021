import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i=0;i<N;i++){
            int num = input.nextInt();
            int rev = 0;
            while(num>0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.println(rev);
        }
    }
}
