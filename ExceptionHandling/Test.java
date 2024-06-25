package ExceptionHandling;

public class Test {

    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        System.out.println("Pokemon");
        m2();
    }

    public static void m2(){
        System.out.println("Ash");
        System.out.println(10/0);
    }
}
