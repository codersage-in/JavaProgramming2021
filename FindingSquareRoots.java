// Explain the Math library - Show the documentation - https://docs.oracle.com/en/java/javase/16/
// Explain the concept of the Static member
// Explain the concept of casting

import java.util.Scanner;

public class FindingSquareRoots {
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
            data = (int) Math.sqrt(data);
            System.out.println(data);
        }
    }
}
