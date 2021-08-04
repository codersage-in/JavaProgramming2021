import java.util.Scanner;
public class reverse_num {
    public static void main(String arr[]) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int rev=0,temp=0;
        for(int i=1;i<=n;i++){
            rev=0;
            int x=s.nextInt();
            while(x!=0){
                temp=x%10;
                rev=rev*10+temp;
                x/=10;
            }
            System.out.println(rev);
        }
    }
}
