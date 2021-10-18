package JavaProgramming2021;

import java.util.Scanner;

public class Test_Match_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int draw = 0, ind = 0, eng = 0;
            int []arr = new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();

                if(arr[i] == 0){
                    draw++;
                }
                if(arr[i] == 1){
                    ind++;
                }
                if(arr[i] == 2){
                    eng++;
                }
            }

            if(ind > eng){
                System.out.println("INDIA");
            }
            else if(eng > ind){
                System.out.println("ENGLAND");
            }
            else if(draw == ind && ind == eng){
                System.out.println("DRAW");
            }
            else{
                System.out.println("DRAW");
            }
        }
        sc.close();
    }
}
