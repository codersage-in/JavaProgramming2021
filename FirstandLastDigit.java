//Explain Scanner class
//Explain String array
//Explain for loop
//Explain String function -charAt
//Explain operator(+)
//Explain: When operation is performed on the char data then it gets converted into the integr e.g. data[i].charAt(0) - '0'

import java.util.Scanner;

class FirstandLastDigit{
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