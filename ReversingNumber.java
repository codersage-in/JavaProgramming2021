import java.util.Scanner;
public class ReversingNumber {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev=0;
        while(n != 0){
            int r = n%10;
            rev = rev * 10 + r;
            n /= 10;
        }
        System.out.println(rev);
    }
}
