import java.util.*;
public class ceil_and_reciept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),budget,cnt=0;
        for(int i=0;i<t;i++){
            budget=sc.nextInt();
            
            while(budget!=0){
                for(int j=0;j<12;j++){
                    if(Math.pow(2, j)<=budget){
                        cnt++;
                        budget=budget-(int)(Math.pow(2,j));
                    }
                }
            }
            System.out.println(cnt);
            cnt=0;
        }
    }
}
