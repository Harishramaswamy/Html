class Swaping
{
    public static void main(String args[])
    {
        int x,y,Temp;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);

        System.out.println("---- Before Swaping----" );
        System.out.println(" First Number "+ x );
        System.out.println(" Second NUmber :" + y );

                        Temp = x;
                        x=y;
                        y=Temp;
        System.out.println("---- After Swaping----" );
        System.out.println("First Number " + x );
        System.out.println("Second Number " + y );

    }
}