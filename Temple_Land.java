package JavaProgramming2021;

import java.util.Scanner;

public class Temple_Land {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int sample;

        for(int i=0;i<S;i++){
            int N = in.nextInt();

            int []H = new int[N];
            for(int j=0;j<N;j++){
                H[j] = in.nextInt();
            }

            if(N%2 == 0){
                System.out.println("no");
            }
            else{
                if(H[0] != 1){
                    System.out.println("no");
                }
                else{
                    int cnt = 0;
                    for(int l=N/2;l<N;l++){
                        sample = H[l]-1;

                        if(H[l+1] != sample){
                            System.out.println("no");
                            cnt = 1;
                            break;
                        }
                        if((N-1) == (l+2)){
                            break;
                        }
                    }
                    if(cnt == 0){
                        System.out.println("yes");
                    }
                }
            }
        }
    }
}
