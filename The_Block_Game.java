import java.util.*;
public class The_Block_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=1;i<=count;i++) {
            int c,e = 0;
            int a = sc.nextInt();
            int b = a;
            while (a > 0) {
                c = a % 10;
                e = (e * 10) + c;
                a = a / 10;
            }
            if (b == e) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
        }

    }
}
