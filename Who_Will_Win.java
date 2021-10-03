package JavaProgramming2021;

import java.util.Scanner;

public class Who_Will_Win {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int []RCB = new int[11];
            int []MI = new int[11];
            int RCBsum = 0, MIsum = 0;
            for(int i=0;i<RCB.length;i++){
                RCB[i] = sc.nextInt();
                RCBsum += RCB[i];
            }
            for(int j=0;j<MI.length;j++){
                MI[j] = sc.nextInt();
                MIsum += MI[j];
            }

            if(RCBsum > MIsum){
                System.out.println("RCB");
            }
            else if(RCBsum == MIsum){
                System.out.println("DRAW");
            }
            else{
                System.out.println("MI");
            }
        }
        sc.close();
    }
}
