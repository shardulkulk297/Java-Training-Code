package Polymorohism;

public class A {
    public void m1(int i)
    {
        System.out.println(i);
    }

    public void m1(long i)
    {
        System.out.println(i);
    }

    public void m1(){
        System.out.println("pokemon");
    }

    public void m1(String i){
        System.out.println("i am into string");
    }

    public void m1(Object obj)
    {
        System.out.println("I am into Object");
    }

    public void m1(int ... i){

        System.out.println("I am in varargs");

    }
}
