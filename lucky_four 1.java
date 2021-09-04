import java.util.*;

import javax.sound.midi.Soundbank;
public class lucky_four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,number;
        T=sc.nextInt();
        if(T>=1 && T<=100000){
           
            for(int i=0;i<T;i++){
                int counter=0;
                number=sc.nextInt();
                while(number>0){
                    int rem=number%10;
                    if(rem==4){
                        counter++;
                    }
                    number=number/10;
                }
                System.out.println(counter);
            }
        }
    }    
}
