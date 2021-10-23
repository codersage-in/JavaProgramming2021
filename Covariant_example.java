class Covariant_example
{
    public Number demo(float a, float b)
    {
        Number result = a+b;
        return result;
    }
}
    class Sub extends Covariant_example
{
    public Integer demo(float a, float b)
    {
        return (int) (a+b);
    }
    public static void main(String args[])
    {
        Sub sub = new Sub();
        System.out.println(sub.demo(25, 89f));
    }
}
