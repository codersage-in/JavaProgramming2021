import java.util.Scanner;

public class SharedFile {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();    
        }
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            int count=0,count1=0;
            b[i] = a[i];
            for(int m=0; m<=i ; m++){ 
                if(a[i] == b[m]){       // checking that a[i] is repeated before in the array
                    count++;            // if not then the count will be equal to 1
                }
            }
        // I will check the frequency of a[i] if the a[i] is repeated only one time in array
            for(int j=0;j<n && count == 1; j++){    
                if(a[i] == a[j]){
                    count1++;
                }
            }
        // I will print a[i] and its  frequency a[i] is repeated only one time in array
            if(count  == 1)
                System.out.println(a[i]+ " " + count1);
        }
    }
}
