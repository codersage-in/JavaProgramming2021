//Explain Scanner class
//Explain int array
//Explain loop

import java.util.Scanner;

class SmallFactorials{
    public static void main(String argds[]){
        Scanner sc = new Scanner(System.in);

        // Get the total nos.
        int loopCount = sc.nextInt();
        
        // Declare the varaible to hold the numbers
        int data[] = new int[loopCount];

        // Get the individual numbers
        for(int i = 0; i < loopCount;i++){
            data[i] = sc.nextInt();
        }

        // do the multuplication
        for(int i = 0; i < loopCount;i++){

            int fact = 1;
            for(int j = 1; j <= data[i]; j++){
                fact = fact * j;
            }
            System.out.println(fact);
        } 
    }
}
