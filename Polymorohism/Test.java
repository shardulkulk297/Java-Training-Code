package Polymorohism;

public class Test extends A{

    public static void main(String[] args) {
        A a = new A();
        a.m1(10l);
        a.m1(5);

        a.m1('a');
//        a.m1(null);
//        a.m1(new Object(5));

        a.m1(1, 3, 4);


    }
}
