import java.time.LocalDate;

public class MathFunctions {
    static private int data=0;

    static{
        System.out.println("Static CTOR");
        init();
    }
    /*public MathFunctions()
    {
        System.out.println("CTOR");
        int today = LocalDate.now().getDayOfWeek().getValue();
        if(today % 2 == 0)
        {
            data=10;
        }
        else {
            data = 11;
        }
    }*/

    private static void init()
    {
        int today = LocalDate.now().getDayOfWeek().getValue();
        if(today % 2 == 0)
        {
            data=10;
        }
        else {
            data = 11;
        }
    }
    public static int add(int x, int y)
    {
        System.out.println("ADD");
        data++;
        return data;
    }

    public static int substract(int x, int y)
    {
        return x-y;
    }

    public static void foo()
    {
        System.out.println("Foo");
    }

    public void soo() //this is non static
    {
        System.out.println(data);
    }
}
