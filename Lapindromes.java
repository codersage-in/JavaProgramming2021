import java.util.*;
public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int h=1;h<=count;h++) {
            String A = sc.next();
            String reverse = "";
            for (int i = A.length() - 1; i >= 0; i--) {
                reverse = reverse + A.charAt(i);
            }
            if (A.compareTo(reverse) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
