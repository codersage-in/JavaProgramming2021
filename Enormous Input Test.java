import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            int num=scn.nextInt();
            if (num%k==0) {
                count++;
            }
        }
        System.out.println(count);
	}
}