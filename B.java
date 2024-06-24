public class B extends Abstraction{

    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        B b = new B();
        b.sum(1, 2);

    }
}
