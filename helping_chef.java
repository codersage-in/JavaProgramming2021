import java.util.*;

public class helping_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, number;
        T = sc.nextInt();
        if (T >= 1 && T <= 1000) {
            for(int i=0;i<T;i++){
                number = sc.nextInt();
                if (number >= -20 && number <= 20) {
                    if (number <= 10) {
                        System.out.println("Thanks for helping Chef!");
                    } else {
                        System.out.println("-1");
                    }
                }
            }
        }
    }
}
