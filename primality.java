import java.util.*;
public class primality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        int number;
        t=sc.nextInt();
        if(t>=1 && t<=20){
            for(int i=0;i<t;i++){
                number=sc.nextInt();
                int cnt=0;
                if(number>=1 && number<=100000){
                    for(int j=1;j<=number;j++){
                        if(number%j==0){
                            cnt++;
                        }
                    }
                    if(cnt==2){
                        System.out.println("yes");
                    }
                    else{
                        System.out.println("no");
                    }
                }
            }
        }
    }
}
