import java.util.Scanner;

 class CuttingRecipes {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
       CuttingRecipes c=new CuttingRecipes();
       c.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases -- > 0)
        {
         int NumbersOfIngredients=getInteger();
         int[] Array=new int[NumbersOfIngredients];
         for(int i=0;i<Array.length;i++)
         {
             Array[i]=getInteger();
         }
         long GCD=getGcd(Array[0],Array[1]);
         for(int i=2;i< Array.length-1;i++)
         {
             GCD=getGcd(GCD,Array[i]);
         }
         for(int i=0;i< Array.length;i++)
         {
             int y=Array[i] /= GCD;
             System.out.print(y +" ");
         }
        }
    }

    long getGcd(long a, long b)
    {
        while(a != b) {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    int getInteger()
     {
        return sc.nextInt();
    }
}