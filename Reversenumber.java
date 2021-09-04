import java.util.Scanner;

public class Reversenumber {
    public static void main(String ar[]){
        Scanner i = new Scanner(System.in);
        int num=i.nextInt();
        int reverse=0;
        int arr[] = new int[10];
        for(int j=0;j<num;j++){
            arr[j]=i.nextInt();
            while(arr[j]!=0) {
                int remainder = arr[j] % 10;
                reverse = reverse * 10 + remainder;
                arr[j] = arr[j] / 10;
            }
            System.out.println(reverse);
        }
    }
}
