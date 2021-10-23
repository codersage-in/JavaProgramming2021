class Primitive_to_wrapper
{
    public static void main(String[] args)
    {
        // create primitive types
        int a = 5;
        double b = 5.55;

        //converts into wrapper objects
        Integer a1 = Integer.valueOf(a);            //We use valueOf to convert primitive datatype to wrapper type
        Double  b1 = Double.valueOf(b);

        if(a1 instanceof Integer)
        {                 //instanceof is a binary operator used to test if an object is of a given type.
            System.out.println("An object of Integer is created.");
        }

        if(b1 instanceof Double)
        {
            System.out.println("An object of Double is created.");
        }
    }
}