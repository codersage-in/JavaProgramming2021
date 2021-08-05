import java.util.Scanner;
public class square_root {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++)
        {
            int num=s.nextInt();
            System.out.println((int)(Math.sqrt(num)));
        }
    }
}
