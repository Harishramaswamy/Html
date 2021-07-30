class statickeyword
{
    // using static variable in static method
    static int a;
    //using static keyword in methods
    static void m1()
    {
        a=23;
        System.out.println(" Hello Harish ");
        System.out.println(" my age is : " + a);

    }
    public static void main(String args[])
    {
        m1();
    }
}