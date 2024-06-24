package ControlFlow;



public class InstanceBlockMulti2 extends InstanceBlockMulti{

    int m = 10;

    InstanceBlockMulti2(){
        System.out.println("I am a childconstructor");
    }

    {
        m1();
        System.out.println("first instance block");

    }

    public static void main(String[] args) {
        InstanceBlockMulti2 i = new InstanceBlockMulti2();
        System.out.println(" child Main method");

    }

    private void m1(){
        System.out.println(n);
    }

    {
        System.out.println("Second instance block");

    }

    int n = 20;

}

