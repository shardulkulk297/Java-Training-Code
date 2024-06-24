package ControlFlow;

public class StaticBlock {

    static int i = 10;

    static {
        m1();
        System.out.println("first static block");

    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    private static void m1(){
        System.out.println(j);
    }

    static{
        System.out.println("Second static block");

    }

    static int j = 20;

}

