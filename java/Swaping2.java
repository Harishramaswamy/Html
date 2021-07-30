class Swaping2
{
    public static void main(String args[])
    {
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);

        System.out.println("---- Before Swaping----" );
        System.out.println(" First Number "+ x );
        System.out.println(" Second NUmber :" + y );

                        x=x-y;
                        y=x+y;
                        x=y-x;
        System.out.println("---- After Swaping----" );
        System.out.println("First Number " + x );
        System.out.println("Second Number " + y );

    }
}