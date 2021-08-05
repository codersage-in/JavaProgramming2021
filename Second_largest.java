import java.util.Scanner;

public class Second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of test case that you want=");
        int t = sc.nextInt();

        int[] num;
        num = new int[3];

        for(int i=0;i<t;i++) {
            System.out.print("Enter a value of A=");
            num[0] = sc.nextInt();
            System.out.print("Enter a value of B=");
            num[1] = sc.nextInt();
            System.out.print("Enter a value of C=");
            num[2] = sc.nextInt();
            if (num[0] < num[1] && num[0] > num[2])
            {
                System.out.println("Secontd largest is="+num[0]);
            }
            else if(num[1] < num[2] && num[1] > num[0])
            {
                System.out.println("Secontd largest is="+num[1]);
            }
            else
            {
                System.out.println("Secontd largest is="+num[2]);
            }
        }

    }
}
