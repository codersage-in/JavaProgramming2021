import java.util.Arrays;
import java.util.Scanner;

public class Turbo_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int []arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<N;i++) {
            for(int k=i+1;k<N;k++){
                if(arr[i] > arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
