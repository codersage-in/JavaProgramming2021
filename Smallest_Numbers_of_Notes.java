import java.util.Scanner;

public class Smallest_Numbers_of_Notes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        for(int i=0;i<count;i++) {
            int b = sc.nextInt();
            int sum=0;
            sum+=b/100;
            b%=100;
            sum+=b/50;
            b%=50;
            sum+=b/10;
            b%=10;
            sum+=b/5;
            b%=5;
            sum+=b/2;
            sum+=b%2;
            System.out.println(sum);
        }
    }
}
