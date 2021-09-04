import java.util.Scanner;
public class SumofDigits {
    public static void main(String ar[]){
        Scanner i = new Scanner(System.in);
        int x=i.nextInt();
        for(int j=0;j<x;j++){
            String data=i.next();
            int sum=0;
            for(int k=0;k<data.length();k++){
                sum=sum + (data.charAt(k)-'0');
            }
            System.out.println(sum);
        }
    }
}
