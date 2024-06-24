package ControlFlow;



public class InstanceBlock {

    int i = 10;

    InstanceBlock(){
        System.out.println("I am a constructor");
    }

    {
        m1();
        System.out.println("first static block");

    }

    public static void main(String[] args) {
        InstanceBlock i = new InstanceBlock();
        System.out.println("Main method");
        InstanceBlock i1 =  new InstanceBlock();
    }

    private void m1(){
        System.out.println(j);
    }

    {
        System.out.println("Second static block");

    }

    int j = 20;

}

