import java.util.Scanner;

public class Small_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=1;i<=N;i++){
            int num = scan.nextInt();
            int fact = 1;
            while(num>0){
                fact = fact*num;
                num--;
            }
            System.out.println(fact);
        }
    }
}
