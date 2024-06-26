package ExceptionHandling;

import java.sql.SQLOutput;

public class MultipleExceptions {

    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        try{
            System.out.println("1");
            System.out.println(1/0);
        }

        catch (Exception e)
        {
            System.out.println("EXCEPTION 1");

            try {
                System.out.println(1 / 0);
            }

            catch (Exception eee)
            {
                System.out.println("caught");
            }
        }

        finally {
            System.out.println("pokeon");
        }
    }
}
