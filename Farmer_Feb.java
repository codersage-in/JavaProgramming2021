import java.util.Scanner;

public class Farmer_Feb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int i,m=0,f=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=a+b;
            int c=0;
            m=n/2;
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        f=1;
                        n++;
                        c++;
                        break;
                    }
            }
            System.out.println(c);
        }
    }
}
