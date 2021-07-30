import java.util.Scanner;

public class Sumofdigits {
    public static void main(String ar[]) {
        //get input from user
        Scanner input = new Scanner(System.in);
        //call the method of scanner
        int noofinput = input.nextInt();

        for (int counter = 0; counter < noofinput; counter++) {
            int data = input.nextInt();
            int sum = 0;
            while (data != 0) {
                sum += (data % 10);
                data /= 10;
            }
            System.out.println(sum);
        }
    }
}