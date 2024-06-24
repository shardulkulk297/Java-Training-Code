package ControlFlow;

public class StaticInMulti {

    static int x = 100;
    static{
        m1();
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main method parent class");
    }



    private static void m1(){
        System.out.println(y);
    }

    static
    {
        System.out.println(x);
    }

    static int y = 200;

}

