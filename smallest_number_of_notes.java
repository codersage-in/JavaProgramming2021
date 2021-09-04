import java.util.*;

public class smallest_number_of_notes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,number,cnt;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                number=sc.nextInt();
                cnt=0;
                while(number!=0){
                    if(number>=100){
                        cnt=number/100;
                        number=number-cnt*100;
                    }
                    if(number>=50){
                        cnt=cnt+number/50;
                        number=number-(number/50)*50;
                    }
                    if(number>=10){
                        cnt=cnt+number/10;
                        number=number-(number/10)*10;
                    }
                    if(number>=5){
                        cnt=cnt+number/5;
                        number=number-(number/5)*5;
                    }
                    if(number>=2){
                        cnt=cnt+number/2;
                        number=number-(number/2)*2;
                    }
                    if(number>=1){
                        cnt=cnt+number/1;
                        number=number-(number/1)*1;
                    }
                }
                System.out.println(cnt);
            }
        }
    }    
}
