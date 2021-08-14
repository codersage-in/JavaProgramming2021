import java.util.*;
// import java.math.BigInteger;

public class CommonFile {
    public static void main(String[] arg){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int LCM = 0;
            if(A % B == 0 || B % A == 0){
                LCM = A > B ? A : B; 
            }
            else if((A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0) || (A % 2 != 0 && B % 2 != 0)){
                LCM = A*B;
            }
        // In this case where both A and B are even so they must have one multiple common
            else{ 
                for(int i= 2,j=2; ; ){
                    if(A*i < B*j){
                        i++;
                    }
                    else if(B*j < A*i){
                        j++;
                    }
                    else{
                        LCM = A*i;
                        break;
                    }
                }
            }
            int ForLoopTerminatingCondition =  A < B ? A : B;
            int GCD = 1;
            for(int i=2; i<=ForLoopTerminatingCondition/2; i++){
                    if(A % i == 0 && B % i == 0){
                        GCD = i;
                    }
            }
            System.out.println(GCD + " " + LCM);
        }
    }
}
