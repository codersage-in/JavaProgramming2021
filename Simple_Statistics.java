package JavaProgramming2021;

import java.util.*;

public class Simple_Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int N = sc.nextInt();
            int K = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>(N);
            for(int j=0;j<N;j++){
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            for(int l=0;l<K;l++){
                list.set(l,0);
                int len = list.size()-1-l;
                list.set(len,0);
            }
            double sum = 0;
            for(int num:list){
                sum = sum+num;
            }
            double avg = sum/(list.size()-2*K);
            System.out.println(avg);

        }
    }
}
