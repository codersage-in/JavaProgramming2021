import java.util.Scanner;
public class find_reminder {
    public static void main(String arr[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int x=1;x<=t;x++){
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(a%b);
        }
    }
}
