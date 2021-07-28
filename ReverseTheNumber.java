// Explain String length method
// Explain how to iterate loop in reverse

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Get the total nos.
        int loopCount = sc.nextInt();

        sc.nextLine();

        // Declare the varaible to hold the numbers
        int data = 0;

        // Get the individual numbers
        for (int i = 0; i < loopCount; i++) {
            data = sc.nextInt();
            int revData=0, rem=0;
            while(data >0){
                // Get the last digit
                rem = data % 10;
                // put it at front
                revData = (revData * 10) + rem;
                // Remove the last digit
                data = data /10 ;
            }
            System.out.println(revData);
        }

    }
}
