import java.util.*;
public class mahasena {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,number,cnt_even=0,cnt_odd=0;
        n=sc.nextInt();
        if(n>=1 && n<=100){
            
            for(int i=0;i<n;i++){
              number=sc.nextInt();
              if(number>=1 && number<=100){
                if(number%2==0){
                cnt_even++;
                }
                else{
                cnt_odd++;
                }
              }
            }
        }     
        if(cnt_even>cnt_odd)
        System.out.println("READY FOR BATTLE");
        else
        System.out.println("NOT READY");
    }
}
