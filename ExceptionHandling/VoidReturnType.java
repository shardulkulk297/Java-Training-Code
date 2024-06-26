package ExceptionHandling;

public class VoidReturnType {

    public static void main(String[] args) {
        m22();
    }

    public static void m22(){
        try
        {
            System.out.println("pokemon");
        }

        catch(Exception e)
        {
            System.out.println("excep");
        }

        finally {
            System.out.println("kkk");
        }

        System.out.println("executed");
    }
}
