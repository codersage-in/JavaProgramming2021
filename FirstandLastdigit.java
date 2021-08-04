import java.util.Scanner;

public class FirstandLastdigit {
    public static void main(String[] arg){
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int lastDigit = n%10, firstdigit = 0;
            n /= 10;
            while(n != 0){
                firstdigit = n%10;
                n /= 10;
            }
            System.out.println(firstdigit+lastDigit);
    }   
}
