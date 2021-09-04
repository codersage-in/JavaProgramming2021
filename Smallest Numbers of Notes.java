import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner s = new Scanner(System.in);
        //System.out.println("enter test cases:");
        int T = s.nextInt();

        if (T >= 1 && T <= 1000) {
            for (int i = 1; i <= T; i++) {
                int sum=0;
                //System.out.println("enter the sum:");
                int N = s.nextInt();
                if (N >= 1 && N <= 1000000) {
                    while(N!=0){
                        if(N>=100){
                            N=N-100;
                            sum++;



                        }else if(N>=50){
                            N=N-50;
                            sum++;
                        }else if(N>=10){
                            N=N-10;
                            sum++;
                        }else if(N>=5){
                            N=N-5;
                            sum++;
                        }else if(N>=2){//Input3 1200 500 242

                            N=N-2;
                            sum++;
                        }else if(N>=1){
                            N=N-1;
                            sum++;
                        }

                    }
                    System.out.println(sum);


                }


            }

        
		// your code goes here
	}
}
}
