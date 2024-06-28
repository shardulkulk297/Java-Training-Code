package Multithreading;

public class Test {

    public static void main(String[] args) {
        MyThread m = new MyThread();

        m.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("I am normal thread");
        }
    }
}
