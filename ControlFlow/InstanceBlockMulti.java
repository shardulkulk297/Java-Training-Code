package ControlFlow;



public class InstanceBlockMulti {

    int i = 10;

    InstanceBlockMulti(){
        System.out.println("I am a parentconstructor");
    }

    {
        m1();
        System.out.println("first instance block");

    }

    public static void main(String[] args) {
        InstanceBlockMulti i = new InstanceBlockMulti();
        System.out.println("parent Main method");

    }

    private void m1(){
        System.out.println(j);
    }

    {
        System.out.println("Second instance block");

    }

    int j = 20;

}

