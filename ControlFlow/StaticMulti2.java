package ControlFlow;

public class StaticMulti2 extends StaticInMulti{

    static int i = 100;
    static{
        m2();
        System.out.println("child Static block 1");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Main method child class");
    }



    private static void m2(){
        System.out.println(j);
    }

    static
    {
        System.out.println(x);
    }


    static int j = 200;


}
