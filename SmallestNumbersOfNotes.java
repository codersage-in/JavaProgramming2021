import java.util.Scanner;

public class SmallestNumbersOfNotes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            //user input
            int n = sc.nextInt();
            //counting number of note
            int []notes={100,50,10,5,2,1};
            int count=0;
                for(int j=0;j<6;j++)
                {
                    count=count+n/notes[j];
                    n=n%notes[j];
                }
            System.out.println(count);
        }
    }
}
