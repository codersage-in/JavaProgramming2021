package JavaProgramming2021;

import java.util.Scanner;

public class First_And_Last_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int N = input.nextInt();
        for(int i=0;i<N;i++){
            int total, temp = 0;
            int number = input.nextInt();
            int reminder = number%10;
            while(number>0){
                temp = number%10;
                number = number/10;

            }
            total = reminder + temp;
            System.out.println(total);
        }
    }
}

/*
import java.util.Scanner;

class First_and_Last_Digit{
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

        // Get the fisrt and last character
        for(int i = 0; i < loopCount;i++){
            // do the summation
            int sum = (data[i].charAt(0) - '0') + (data[i].charAt(data[i].length()-1) - '0');
            System.out.println(sum);
        }
    }
}
*/