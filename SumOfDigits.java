import java.util.Scanner;

public class SumOfDigits {
    public static void main(String ar[]){

        // Get the input from the user
        Scanner input = new Scanner(System.in);
        // let's call the method of scanner
        int noOfInputs = input.nextInt();

        for(int counter=0;counter<noOfInputs;counter++){
            String data = input.next(); //12345
            int sum=0;
            for(int charCounter =0;charCounter<data.length();charCounter++){
                sum = sum + (data.charAt(charCounter) - '0'); // '1' into 1
            }
            System.out.println(sum);

        }

    }
}
