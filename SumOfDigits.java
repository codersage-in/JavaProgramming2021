//Explain Scanner class
//Explain array
//Explain String function-charAt
//Explain operator


import java.util.Scanner;

public class SumOfDigits{
    public static void main(String argds[]){
        Scanner sc = new Scanner(System.in);

        // Get the total nos.
        int loopCount = sc.nextInt();
        
        // Declare the varaible to hold the numbers
        String data[] = new String[loopCount];

        // Get the individual numbers
        for(int i = 0; i < loopCount;i++){
            data[i] = sc.next();
        }

        // do the summation 
        for(int i = 0; i < loopCount;i++){

            // Get the individual character from the string
            char temp;
            int sum = 0;
            for (int stringIndex = 0 ; stringIndex < data[i].length();stringIndex++){

                // Do the addition
                sum = sum + (data[i].charAt(stringIndex) - '0');
            }
            System.out.println(sum);
        } 
    }
}