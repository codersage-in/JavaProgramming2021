import java.util.Scanner;
 class PackagingCupcakes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            int p = sc.nextInt();
            if(p%2==0){
                System.out.println((p/2)+1);
            }
            else{
                System.out.println((p+1)/2);
            }
        }
    }
}