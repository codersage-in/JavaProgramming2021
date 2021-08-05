//Explain Scanner class for taking input
//Explain  for loop
//Explain Conditional Statement
//Explain Logical AND(&&) Logical OR(||)


import java.util.Scanner;


class SecondLargest
{
    public static void main (String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        // Get the total nos
        int t = Sc.nextInt();

        for (int i=0; i<t; i++){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            int C = Sc.nextInt();

            if(A>B && A<C || A<B && A>C){
                System.out.println(A);
            }
            else if(B>A && B<C || B<A && B>C){
                System.out.println(B);
            }
            else{
                System.out.println(C);
            }
        }
    }
}
