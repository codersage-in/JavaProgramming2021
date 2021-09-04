import java.util.Scanner;

public class FirstandLast {
    public static void main(String ar[]){
        Scanner i = new Scanner(System.in);
        int x=i.nextInt();
        for(int j=0;j<x;j++){
            String data=i.next();
            int sum=0,last;
            last=data.length();
            sum=sum + (data.charAt(0)-'0')+(data.charAt(last-1)-'0');
            System.out.println(sum);
        }
    }
}