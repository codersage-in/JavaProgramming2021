import java.util.*;
class non_varargs
    {

    public int sumNumber(int a, int b){
        return a+b;
    }

    public int sumNumber(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main( String[] args )
    {
        non_varargs obj = new non_varargs();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));
    }
}