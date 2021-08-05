import java.util.*;
class smallFact
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int num,number;
        num=sc.nextInt();
        if(num>=1&&num<=100)
        {
            for(int i=0;i<num;i++)
            {
                number=sc.nextInt();
                int fact=1;
                if(number>=1&&number<=100)
                {
                    for(int j=1;j<=number;j++)
                    {
                        fact=fact*j;

                    }
                    System.out.println(fact);
                }
            }
        }
    }

}
