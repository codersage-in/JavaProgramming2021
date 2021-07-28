//Explain Scanner class for taking input
//Explain Array declaration
//Explain for loop
//Explain split () functions of java String 
//Explain modulus (%) operator


import java.util.Scanner;

class FindRemainder {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Get the total nos.
        int loopCount = sc.nextInt();

        sc.nextLine();

        // Declare the varaible to hold the numbers
        String data[] = new String[loopCount];

        // Get the individual numbers
        for (int i = 0; i < loopCount; i++) {
            data[i] = sc.nextLine();
        }

        // Split the String
        for (int i = 0; i < loopCount; i++) {
            String temp[] = data[i].split(" ");
            // Find the remainder
            int remainder = Integer.parseInt(temp[0]) % Integer.parseInt(temp[1]);
            System.out.println(remainder);
        }

    }
}