/* package codechef; // don't place package name! */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

      
        int loopCount = sc.nextInt();

        sc.nextLine();

       
        int data = 0;

     
        for (int i = 0; i < loopCount; i++) {
            data = sc.nextInt();
            int revData=0, rem=0;
            while(data >0){
               
                rem = data % 10;
               
                revData = (revData * 10) + rem;
             
                data = data /10 ;
            }
            System.out.println(revData);
        }

    }
}
