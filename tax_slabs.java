import java.util.*;

import javax.lang.model.util.ElementScanner14; 
public class tax_slabs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,income;
        float tax;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                income=sc.nextInt();
                if(income>=0 && income<=10000000){
                    if(income<=250000){
                        tax=0;
                    }
                    else if(income>250000 && income<=500000)
                    {
                        tax=250000*0+(income-250000)*0.05f;
                    }
                    else if(income>500000 && income<=750000){
                        tax=250000*0 + 250000*0.05f + (income-500000)*0.1f;
                    }
                    else if(income>750000 && income<=1000000){
                        tax=250000*0 + 250000*0.05f + 250000*0.1f +(income-750000)*0.15f; 
                    }
                    else if(income>1000000 && income<=1250000){
                        tax=250000*0 + 250000*0.05f + 250000*0.1f + 250000*0.15f + (income-1000000)*0.20f;
                    }
                    else if(income>1250000 && income<=1500000){
                        tax=250000*0 + 250000*0.05f + 250000*0.1f + 250000*0.15f + 250000*0.20f + (income-1250000)*0.25f;
                    }
                    else{
                        tax=250000*0 + 250000*0.05f + 250000*0.1f + 250000*0.15f + 250000*0.20f + 250000*0.25f + (income-1500000)*0.30f;
                    }
                    int netincome=income-(int)(tax);
                    System.out.println(netincome);
                }
            }
        }
    }
}
