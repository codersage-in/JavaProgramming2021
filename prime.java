import java.util.*;

class prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int x,flag=0;
        System.out.print("enter a number to check for prime number:");
        x= input.nextInt();
        if(x==0 || x==1){
            System.out.println(x+" is not a prime number.");
        }
        else{
            for (int i=2; i<x;i++) {
                if(x%i==0){
                    System.out.println(x+" is not a prime number.");
                    flag=1;
                    break;
                }
            }
        if(flag==0){
            System.out.println(x+" is a prime number.");
            }
        }
        input.close();
    }    
}
