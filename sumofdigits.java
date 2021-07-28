package com.company;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] ar){
        Scanner input = new Scanner(System.in);
        int noofinputs = input.nextInt();

        for(int counter = 0;counter<noofinputs;counter++) {
           String data = input.next();
           int sum = 0;
           for(int charcounter=0;charcounter<data.length();charcounter++){
               sum = sum + (data.charAt(charcounter) - '0');
           }
           System.out.println(sum);
        }
    }
}
