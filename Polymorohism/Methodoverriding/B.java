package Polymorohism.Methodoverriding;

public class B extends A {

    public void m1(){
        System.out.println("Poke");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.m1();
        b.m1();

        A a1 = new B();
        a1.m1(); //overriding
        
       }

}
