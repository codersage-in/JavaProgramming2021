import java.util.*;
public class Turbo_Sort {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr =new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int j=0;j<num-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}
