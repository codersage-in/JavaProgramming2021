/*
     NAME:- PRAJAPATI DHARMENDRA
     ID:- 20IT117
*/

package JavaProgramming2021;

import java.util.Scanner;

public class Sum_Or_Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N1 = input.nextInt();
        int N2 = input.nextInt();

        int result ;
        if(N1 > N2){
            result = N1 - N2;
            System.out.println(result);
        }
        else{
            result = N1 + N2;
            System.out.println(result);
        }
    }
}
