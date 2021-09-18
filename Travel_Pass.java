package JavaProgramming2021;

import java.util.Scanner;

public class Travel_Pass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0;i<T;i++){
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();


            String arr = in.next();

            int cnt = 0, mnt = 0;
            for(int j=0;j<arr.length();j++){
                char ch = arr.charAt(j);
                if(ch == '0'){
                    mnt++;
                }
                if(ch == '1'){
                    cnt++;
                }
            }
//            System.out.println(cnt);
//            System.out.println(mnt);
            int D = (mnt*A) + (cnt*B);
            System.out.println(D);
            }
        }
    }