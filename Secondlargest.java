import java.util.*;
public class Secondlargest
{
        public static void main(String[] args)
        {
            Scanner reader = new Scanner(System.in);
            int num[]={1,5,2,3,15}; //unsorted array

            int n = num.length;

            Arrays.sort(num);

            System.out.println("second largest number =" + num[n-2]);


            }

}
