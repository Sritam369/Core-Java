
public class Test  
{
	static int y ;

    static 
    {
        System.out.println("Static block: y = " + y);
        y = 20;
    }

    

    public static void main(String[] args) 
    {
        System.out.println("Main: y = " + y);
    }
}
















