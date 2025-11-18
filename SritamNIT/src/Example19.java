public class Example19
{
    static int x = 10;

    {
        x = 50;
    }

    static 
    {
        x = 30;
    }

    public static void main(String[] args) 
    {
        System.out.println("Before Object Creation: " + x);
        Example19 obj1 = new Example19();
        System.out.println("After Object Creation: " + x);
    }
}