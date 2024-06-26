package ExceptionHandling;

public class Finallycheck {

    public static void main(String[] args) {

    }

    public static int fc()
    {
        try{
            System.out.println("try block");
            return 1;
        }
        catch (Exception e)
        {
            return 0;
        }

        finally {
            System.out.println("pokemonsss");
        }
    }
}
